package dk_Ovelse1_mhvasu;
//dette program skal kunne læse fra en fil 
//hvis denne fil ikke findes skal den give fejlmeddelse
//og hvis den kan finde den skal den lave store bogstaver til små og omvendt
import java.io.*;
public class Ovelse_1 {

	public static void main(String[] args) throws IOException{
		//setting up the readers and writers
		FileReader IN = null;
		FileWriter OUT = null;
		
		try {
			//taking in the file
			IN = new FileReader("input.txt");
			OUT = new FileWriter("output.txt");
			int c;
			//as long as theres something to read in it will run this loop
			while ((c = IN.read()) != -1) {
				//variables
				boolean check;
				//checking if the character is upper or lower case
				check = Character.isLowerCase(c);
				if(check == true) {
					//change to lower case
					OUT.write(Character.toUpperCase(c));
				}else{
					//change to lower case
					OUT.write(Character.toLowerCase(c));
				}
			}
		}finally {
			if (IN != null) {
	            IN.close();
	         }
	         if (OUT != null) {
	            OUT.close();
	         }

		}

	}
}

