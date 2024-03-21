package com.hv.sync.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.hv.sync.domain.Biao;
import com.hv.sync.domain.DockerBiao;
import com.hv.sync.mapper.BiaoMapper;
import com.hv.sync.service.BiaoService;
import com.hv.sync.service.DockerBiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * RuoYi-Cloud-master
 *
 * @Author liuhongxu2000
 * @date 2024/3/21
 **/
@DS("slave")
@Service
public class BiaoServiceImpl implements BiaoService {

    @Autowired
    private BiaoMapper biaoMapper;

    @Autowired
    private DockerBiaoService dockerBiaoService;
    @Override
    public void insert(Biao biao) {
        biaoMapper.insert(biao);
    }

    @Override
    public Biao findByVin(String vin) {
        return biaoMapper.findByVin(vin);
    }

}
