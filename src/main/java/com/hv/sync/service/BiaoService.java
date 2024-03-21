package com.hv.sync.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.hv.sync.domain.Biao;
import com.hv.sync.domain.DockerBiao;

import java.util.List;

/**
 * RuoYi-Cloud-master
 *
 * @Author liuhongxu2000
 * @date 2024/3/21
 **/
@DS("slave")
public interface BiaoService {

    void insert(Biao biao);
    Biao findByVin(String vin);

}

