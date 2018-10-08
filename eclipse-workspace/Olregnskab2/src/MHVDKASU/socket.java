package MHVDKASU;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class socket {
	private Socket sck;
	public socket(String string, int i) throws UnknownHostException, IOException {
		sck = new Socket(string ,i);
	}
	public void addperson(String string) throws IOException {
		String str = commands.Add_Person.getCommand()+":"+string+"\n";
		sck.getOutputStream().write(str.getBytes());
	}
	public void adddrink(String person, String drink, Integer number) throws IOException {
		String str = commands.Buy_Drink.getCommand()+":"+person+" "+drink+" "+number+"\n";
		sck.getOutputStream().write(str.getBytes());
	}
	public void cheers(String string) throws IOException {
		String str = commands.Cheers.getCommand()+":"+string+"\n";
		sck.getOutputStream().write(str.getBytes());
	}

}
