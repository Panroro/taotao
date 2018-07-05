package com.taotao.mapper;

import java.util.List;

import com.taotao.pojo.Tbitem;

public interface TbitemMapper {
	/**
	 * 通过ID查询商品信息
	 * @param itemId 商品id
	 * @return tbitem 商品
	 */
	public Tbitem getItemById(long itemId);
	/**
	 * 分页展示商品
	 * @return tbitem 集合
	 */
	public List<Tbitem> itemList();
	/**
	 * 添加一个商品
	 * @param tbitem
	 */
	public void addTbitem(Tbitem tbitem);
}