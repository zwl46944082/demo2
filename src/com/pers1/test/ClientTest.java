package com.pers1.test;

import com.pers1.Server;
import com.pers1.ServerService;
/*
 * ����!!!!!!!!!!!!!!!!
 */
public class ClientTest {
	public static void main(String[] args) {
		Server server=new ServerService().getServerPort();
		String name = server.getValue("����");
		System.out.println("name:"+name);
	}
}
