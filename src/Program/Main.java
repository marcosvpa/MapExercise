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

		Scanner sc = new Scanner(System.in);

		String getInput;

		System.out.print("Enter the file path:");
		getInput = sc.nextLine();
		Map<String, Integer> voteMap = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader(getInput))) {
			
			String line = br.readLine();
			
			while (line != null) {
				
				String getInfo[] = line.split(",");

				if (!voteMap.containsKey(getInfo[0])) {
					voteMap.put(getInfo[0], Integer.parseInt(getInfo[1]));
				} else {
					voteMap.put(getInfo[0], voteMap.get(getInfo[0]) + Integer.parseInt(getInfo[1]));
				}

				line = br.readLine();
			}
		}

		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		
	       for (Map.Entry<String, Integer> totalVote : voteMap.entrySet()) {
	            String key = totalVote.getKey();
	            Integer value = totalVote.getValue();
	            System.out.println(String.format("Candidato: %s | Total Votos: %d", key, value));
	        }
	       
		
		sc.close();
	}

}
