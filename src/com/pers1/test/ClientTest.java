package com.pers1.test;

import com.pers1.Server;
import com.pers1.ServerService;
/*
 * ²âÊÔ!!!!!!!!!!!!!!!!
 */
public class ClientTest {
	public static void main(String[] args) {
		Server server=new ServerService().getServerPort();
		String name = server.getValue("ÀÏÍõ");
		System.out.println("name:"+name);
	}
}
