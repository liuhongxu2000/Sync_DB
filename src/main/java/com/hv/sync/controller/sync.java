package com.hv.sync.controller;

import com.hv.sync.domain.Biao;
import com.hv.sync.service.BiaoService;
import com.hv.sync.service.DockerBiaoService;
import com.ruoyi.common.core.web.domain.AjaxResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import java.util.stream.Collectors;

/**
 * RuoYi-Cloud-master
 *
 * @Author liuhongxu2000
 * @date 2024/3/21
 **/
@RestController
@RequestMapping("/sync")
@Slf4j
public class sync  {
    static int times = 0;
    @Autowired
    DockerBiaoService dockerBiaoService;
    @Autowired
    BiaoService biaoService;
    @GetMapping("/list")
    @Scheduled(cron ="*/6 * * * * ?")//定时任务
    public AjaxResult Sync_DB() {
        List<Map<String, Object>> listMap = dockerBiaoService.selectVinAndCtype().stream()
                .map(dockerBiao -> {
                    Map<String, Object> map = new HashMap<String, Object>();
                    map.put("vin", dockerBiao.getVin());
                    map.put("ctype", dockerBiao.getCtype());
                    return map;
                })
                .collect(Collectors.toList());
        for (int i = 0; i < listMap.size(); i++) {
            Biao biao1 = new Biao();
            biao1.setVin((String) listMap.get(i).get("vin"));
            biao1.setCtype((String) listMap.get(i).get("ctype"));

            // 查询数据库中是否存在相同的 vin 编码
            Biao existingBiao = biaoService.findByVin(biao1.getVin());

            // 如果不存在相同的 vin 编码，则插入数据
            if (existingBiao == null) {
                biaoService.insert(biao1);
                times++;
                log.info("同步更新次数  " +times+"        sync-successful");
            }
        }

        return AjaxResult.success("ok");
    }

}

