package com.taotao.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.mapper.TbitemcatMapper;
import com.taotao.pojo.Tbitemcat;
import com.taotao.service.ItemCatService;
@Service
public class ItemCatServiceImpl implements ItemCatService {
	@Autowired
	private TbitemcatMapper tbitemcatMapper;
	@Override
	public List<EasyUITreeNode> getTbitemCatList(long parentid) {
		// TODO Auto-generated method stub
		List<Tbitemcat> list = tbitemcatMapper.getTbitemcatList(parentid);
		List<EasyUITreeNode> easyList=new ArrayList<EasyUITreeNode>();
		for(Tbitemcat cat:list){
			EasyUITreeNode node=new EasyUITreeNode();
			node.setId(cat.getId());
			node.setState(cat.getIsparent()?"closed":"open");
			node.setText(cat.getName());
			easyList.add(node);
		}
		return easyList;
	}

}
