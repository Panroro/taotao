package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.Tbitem;
import com.taotao.pojo.Tbitemdesc;

public interface ItemService {
	/**
	 * 根据商品ID查询商品信息
	 * @param itemId
	 * @return item
	 */
	public Tbitem getTbitemById(long itemId);
	/**
	 * 分页展示商品信息
	 * @param page
	 * @param rows
	 * @return json包装的商品信息
	 */
	public EasyUIDataGridResult itemList(int page,int rows);
	/**
	 * 添加一个商品信息
	 * @param tbitem
	 * @return 返回一个结果集 包括status msg data 
	 */
	public TaotaoResult addTbitem(Tbitem tbitem,String desc);
}
