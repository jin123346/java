package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main7 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Set<Integer> remainders = new HashSet<>();
		
		final int divisor=42;
		
		
		for(int i=0;i<10;i++) {
			 int number = Integer.parseInt(br.readLine());
			 int remainder = number%divisor;
			 remainders.add(remainder);
		}
		
		
		System.out.println(remainders.size());

	}

}
