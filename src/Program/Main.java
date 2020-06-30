package Program;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		Map <String,Integer> mapTest = new LinkedHashMap<String,Integer>();
		Scanner sc = new Scanner(System.in);
		
		String getInput;

		System.out.print("Enter the file path:");
		getInput = sc.nextLine();
		Map <String,Integer> voteMap = new HashMap<>();
		try (BufferedReader br = new BufferedReader (new FileReader(getInput))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				String getInfo[] = line.split(",");
				
				
				
				line = br.readLine();
			}
		}
		
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		
		sc.close();
	}

}
