package com.taotao.Mytest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Test;

import com.taotao.common.utils.FtpUtil;
import com.taotao.common.utils.IDUtils;

public class mytest1 {
/*	@Test
	public void demo() throws FileNotFoundException {
		InputStream input = new FileInputStream("C:\\Users\\b01\\Desktop\\1.jpg");
		FtpUtil.uploadFile("192.168.25.133", 21, "ftpuser", "ftpuser", "/home/ftpuser/www/images", "demo", "2.jpg",
				input);
	}*/
	@Test
	public void demo1(){
		System.out.println(IDUtils.genItemId());
		System.out.println(IDUtils.genItemId());
		System.out.println(IDUtils.genItemId());
	}
}
