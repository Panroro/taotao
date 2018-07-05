package com.taotao.service;

import com.taotao.common.pojo.PictureResult;
public interface PictureService {
	/**
	 * 将图片上传到图片服务器 
	 * @param btyes 文件输入流
	 * @param name	文件名
	 * @return
	 */
	public PictureResult uploadFile(byte[] bytes,String name);
}
