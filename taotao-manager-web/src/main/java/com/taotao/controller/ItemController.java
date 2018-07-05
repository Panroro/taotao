 package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
/*import com.taotao.common.pojo.EasyUIDataGridResult;*/
import com.taotao.pojo.Tbitem;
import com.taotao.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/{itemId}")
	@ResponseBody
	public Tbitem getItemById(@PathVariable Long itemId) {
		//根据商品id查询商品信息
		System.out.println(itemId);
		Tbitem tbItem = itemService.getTbitemById(itemId);
		return tbItem;
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
		EasyUIDataGridResult result = itemService.itemList(page, rows);
		return result;
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public TaotaoResult addItem(Tbitem tbitem,String desc){
		TaotaoResult result = itemService.addTbitem(tbitem, desc);
		return result;
	}
	
}

