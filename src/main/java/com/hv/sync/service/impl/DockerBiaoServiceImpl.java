package com.hv.sync.service.impl;

import com.hv.sync.domain.DockerBiao;
import com.hv.sync.mapper.DockerBiaoMapper;
import com.hv.sync.service.DockerBiaoService;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author liuhongxu2000
 * @create 2024/3/21 10:08
 */

@Service
public class DockerBiaoServiceImpl implements DockerBiaoService {

    @Autowired
    private DockerBiaoMapper dockerBiaoMapper;

    @Override
    public  List<DockerBiao> selectVinAndCtype() {
        return dockerBiaoMapper.selectVinAndCtype();
    }

}