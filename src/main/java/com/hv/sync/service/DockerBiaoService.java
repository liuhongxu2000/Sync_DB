package com.hv.sync.service;

import com.hv.sync.domain.DockerBiao;

import java.util.List;
import java.util.Map;

/**
 * RuoYi-Cloud-master
 *
 * @Author liuhongxu2000
 * @date 2024/3/21
 **/
public interface DockerBiaoService {
    List<DockerBiao> selectVinAndCtype();
}
