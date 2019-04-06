package _20190112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
	        String line = br.readLine();
	        if(!line.equals("#")) {
		        int cnt = 0;
		        char a = line.split(" ")[0].charAt(0);
		        for(char c : line.substring(1).toCharArray()) {
		        	if(Character.toUpperCase(a) == Character.toUpperCase(c)) {
		        		cnt++;
		        	}
		        }
		        System.out.print(a+" "+cnt+" \n");
		    } else {
		    	br.close();
		    	break;
		    }
		}
    }
}