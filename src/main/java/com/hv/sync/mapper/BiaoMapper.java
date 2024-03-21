package com.hv.sync.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.hv.sync.domain.Biao;

import java.util.List;

/**
 * RuoYi-Cloud-master
 *
 * @Author liuhongxu2000
 * @date 2024/3/20
 **/
@DS("slave")
public interface BiaoMapper {
    void insert(Biao biao);
    Biao findByVin(String vin);
}
