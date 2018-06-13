package com.henu.miaosha.redis;

public interface KeyPrefix
{

    int expireSeconds();

    String getPrefix();

}
