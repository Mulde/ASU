package MHVDKASU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
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
	//private HashMap<String,HashMap> tap = new HashMap<String, HashMap>();
	//private List<String> drinks = new LinkedList<String>();
	public Server(String string, int i) throws IOException {
		server = new ServerSocket();
		server.bind(new InetSocketAddress(string ,i));
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Socket sck  = server.accept();
			InputStreamReader st = new InputStreamReader(sck.getInputStream());
			BufferedReader br = new BufferedReader(st);
			OutputStream ot = sck.getOutputStream();
			while(true) {
				String resp = br.readLine();
				System.out.println("server read message " +resp);
				String[] temp = resp.split(":");
				commands cmd = null;
				
				for (commands p:commands.values()) {
					if (p.getCommand().equals(temp[0])) {
						cmd = p;
						break;
					}
				}
				int num;
				switch(cmd) {
					case Add_Person:
						//code for adding person here 
						//find in ølregnskab
						System.out.println("adding person");
						break;
					case Buy_Drink:
						//code for adding drinks
						System.out.println("buying drink");
						break;
					case Cheers:
						//code for cheers
						System.out.println("cheers mate");
						break;
					default:
						ot.write("error: no such command".getBytes());
				
				}
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
	
