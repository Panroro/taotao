package com.taotao.service;

import java.util.List;

import com.taotao.common.pojo.EasyUITreeNode;

public interface ItemCatService {
	/**
	 * 查询商品类目
	 * @param parentid
	 * @return List<EasyUITreeNode>
	 */
	public List<EasyUITreeNode> getTbitemCatList(long parentid);
}
