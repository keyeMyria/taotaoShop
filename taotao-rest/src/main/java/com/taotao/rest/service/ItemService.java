package com.taotao.rest.service;

import com.taotao.common.pojo.TaotaoResult;

public interface ItemService {

	TaotaoResult getItemBaseInfo(long itemId);//获取商品基本信息
	TaotaoResult getItemDesc(long itemId);//获取商品描述信息
	TaotaoResult getItemParam(long itemId);//获取商品规格参数
}
