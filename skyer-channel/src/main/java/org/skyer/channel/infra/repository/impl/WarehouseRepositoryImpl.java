package org.skyer.channel.infra.repository.impl;

import org.springframework.stereotype.Component;

import org.skyer.channel.domain.entity.Warehouse;
import org.skyer.channel.domain.repository.WarehouseRepository;
import org.skyer.mybatis.base.impl.BaseRepositoryImpl;

/**
 * @author: lzh
 * @date: 2021-06-18
 * @description:
 */
@Component
public class WarehouseRepositoryImpl extends BaseRepositoryImpl<Warehouse> implements WarehouseRepository {
}
