package com.taotao.mapper;

import java.util.List;

import com.taotao.pojo.Tbitemcat;

public interface TbitemcatMapper {
	/**
	 * 查询商品类目
	 * @param parentid
	 * @return
	 */
	public List<Tbitemcat> getTbitemcatList(long parentid); 
}