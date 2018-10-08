package MHVDKASU;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;


public class socket {
	public static void main(String[] args) throws UnknownHostException, IOException {	
		Socket sck = new Socket("localhost",8090);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter string");
		String s = br.readLine();
		sck.getOutputStream().write(s.getBytes());
		byte[] b = new byte[1024];
		sck.getInputStream().read(b );
		System.out.println(new String(b));
		sck.close();
	}

}
