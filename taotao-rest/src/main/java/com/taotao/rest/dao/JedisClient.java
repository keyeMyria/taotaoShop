package com.taotao.rest.dao;

/**
 * Jedis的单机版（是一个JedisPool对象）和集群版（JedisCluster对象）
 * 这两个对象的调用方法还不一样，所以为了适应单击版和集群版，我们开发一套接口，根据需求调用单击版实现类或集群版实现类
 * */
public interface JedisClient {

	String get(String key);
	String set(String key, String value);
	String hget(String hkey, String key);
	long hset(String hkey, String key, String value);
	long incr(String key);
	long expire(String key, int second);
	long ttl(String key);
	long del(String key);
	long hdel(String hkey, String key);
}
