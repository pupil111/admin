package com.zy.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import org.apache.commons.lang.StringUtils;

public class ServerSocketTest {
	private int port = 4578;
	
	private Socket socket = null;
	
	private BufferedReader reader = null;
	
	private BufferedWriter writer = null;
	
	private ServerSocket server = null;
	
	public void creatServer() throws Exception {
		server = new ServerSocket(port);
		System.out.println("111111111111");
	}
	
	public void close() throws Exception {
		reader.close();
	}
	
	public void getMessage() throws Exception {
		socket = server.accept();
		System.out.println("22222222222");
		while (true) {
			System.out.println("==========");
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("-------------");
			String msg = reader.readLine();
			System.out.println(msg);
			System.out.println("dfdfdfdfdddddddddddd");
			while (StringUtils.isNotEmpty(msg)) {
				System.out.println("client  :  " + msg);
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		final ServerSocketTest socketTest = new ServerSocketTest();
		socketTest.creatServer();
//		new Thread(new Runnable() {
//			public void run() {
//				try {
//					socketTest.getMessage();
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}).start();
//		
//		while (Thread.activeCount() > 1) {
//			
//		}
		socketTest.getMessage();
		socketTest.close();
		
	}
	
	
	
}
