package com.taotao.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.IDUtils;
import com.taotao.mapper.TbitemMapper;
import com.taotao.mapper.TbitemdescMapper;
import com.taotao.pojo.Tbitem;
import com.taotao.pojo.Tbitemdesc;
import com.taotao.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private TbitemdescMapper tbitemdescMapper;
	@Autowired
	private TbitemMapper tbitemMapper;
	@Override
	public Tbitem getTbitemById(long itemId) {
		// TODO Auto-generated method stub
		Tbitem tbItem = tbitemMapper.getItemById(itemId);
		return tbItem;
	}
	@Override
	public EasyUIDataGridResult itemList(int page, int rows) {
		// TODO Auto-generated method stub
		//分页插件处理page rows
		PageHelper.startPage(page, rows);
		//查询数据
		List<Tbitem> itemList = tbitemMapper.itemList();
		//将查询到的商品数据放入到分页的对象里面去
		PageInfo<Tbitem> pageInfo = new PageInfo<Tbitem>(itemList);
		EasyUIDataGridResult result=new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(itemList);
		return result;
	}
	@Override
	/**
	 * 页面传过来的商品信息包括cid title sellpoint price num barcode image desc
	 * 缺少的id,status created updated都需要在方法里面设定
	 */
	
	public TaotaoResult addTbitem(Tbitem tbitem,String desc) {
		// TODO Auto-generated method stub
		Date date=new Date();
		tbitem.setId(IDUtils.genItemId());
		tbitem.setStatus((byte) 1);
		tbitem.setCreated(date);
		tbitem.setUpdated(date);
		tbitemMapper.addTbitem(tbitem);
		//商品的信息和商品的描述需要通过分表来完成
		Tbitemdesc tbitemdesc=new Tbitemdesc();
		tbitemdesc.setItemdesc(desc);
		tbitemdesc.setItemid(tbitem.getId());
		tbitemdesc.setCreated(date);
		tbitemdesc.setUpdated(date);
		tbitemdescMapper.addTbitemdesc(tbitemdesc);
		return TaotaoResult.ok();
	}

}
