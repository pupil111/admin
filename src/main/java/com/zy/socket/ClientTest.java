package com.zy.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import org.apache.commons.lang.StringUtils;

public class ClientTest {
	
	private int port = 4578;
	
	private String host = "127.0.0.1";
	
	private Socket socket = null;
	
	private BufferedReader reader = null;
	
	private BufferedWriter writer = null;
	
	private PrintWriter printWriter = null;
	
	public void createClient() throws Exception {
		socket = new Socket(host, port);
	}
	
	public void close() throws Exception {
		reader.close();
	}
	
	public void postMessage() throws Exception {
		System.out.println("555555555555");
		while (true) {
			System.out.println("66666666666");
			Scanner scanner = new Scanner(System.in);
			System.out.println("77777777777777");
			String msg = scanner.next();
			//writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//writer.write(msg);
			//System.out.println("client  :  " + msg);
			printWriter = new PrintWriter(socket.getOutputStream(), true);
			printWriter.print(msg);
			System.out.println("client  :  " + msg);
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		final ClientTest clientTest = new ClientTest();
		clientTest.createClient();
		System.out.println("33333333333333");
		new Thread(new Runnable() {
			public void run() {
				try {
					clientTest.postMessage();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		while (Thread.activeCount() > 1) {
			
		}
		
		clientTest.close();
		
	}
	
}
