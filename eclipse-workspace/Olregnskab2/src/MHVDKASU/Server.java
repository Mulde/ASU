package MHVDKASU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class Server implements Runnable {
	ServerSocket server;
	private HashMap<String,HashMap> tap = new HashMap<String, HashMap>();
	private List<String> drinks = new LinkedList<String>();
	
	public Server(String string, int i) throws IOException {
		server = new ServerSocket();
		server.bind(new InetSocketAddress(i));
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Socket sck  = server.accept();
			InputStreamReader st = new InputStreamReader(sck.getInputStream());
			BufferedReader br = new BufferedReader(st);
		}
		
	}
	
}
