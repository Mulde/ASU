package MHVDKASU;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


public class Server {
	private static int LEN = 1024;
	private static ServerSocket	server;
	private static byte[] b = new byte[LEN];
	
	public static void main(String[] args) throws IOException{
		server = new ServerSocket(8090);
		while(true) {
			Socket sck = server.accept();
			sck.getInputStream().read(b,0,LEN);
			String s = new String(b);
			switch(order) {
			case 1: s = "add person";
					
					break;
			case 2: s = "add drink";
					
					break;
			case 3: s = "cheers";
					
					break;
			}
		}
	}

}