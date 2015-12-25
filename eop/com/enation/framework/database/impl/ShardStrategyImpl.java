package com.enation.framework.database.impl;

import com.google.code.shardbatis.strategy.ShardStrategy;

public class ShardStrategyImpl implements ShardStrategy{
    @Override
    public String getTargetTableName(String baseTable, Object params, String mapperId) {
        // TODO Auto-generated method stub
        return baseTable+"_1_1";
    }


}
