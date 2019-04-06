package _20190406;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_20190406_2_2921 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        
        
        int score1 = Integer.parseInt(st1.nextToken());
        int rslt = 0;
        
        for(int i=0; i<=score1; i++) {
        	for(int j=i; j<=score1; j++) {
        		rslt+=i;
        		rslt+=j;
        	}
        }
        
        System.out.println(rslt);
	}
	
}



/**
 * 
 *  0 0
 *  0 1
 *  1 1
 *  2 0
 *  2 1
 *  2 2
 * 
 * 
 * 0 0
 * 0 1
 * 0 2
 * 1 1
 * 1 2
 * 2 2
 * 
 * 
 */