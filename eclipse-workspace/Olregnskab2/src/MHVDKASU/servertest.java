package MHVDKASU;

import java.io.IOException;

public class servertest {

	public static void main(String[] args)throws IOException {
		String ip = "localhost"; 
		int i = 8090;
		
		Server server = new Server(ip, i);
		socket Socket = new socket(ip, i);
		server.run();
		
		

	}

}
