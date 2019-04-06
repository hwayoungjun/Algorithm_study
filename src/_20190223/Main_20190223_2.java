package _20190223;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_20190223_2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken()); //A
        int B = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken()); //B
        int C = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken()); //C
        int D = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken()); //D
        int P = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken()); //P

        int X = 0;
        int Y = 0;
        
        X = P * A;
        
        if(P <= C) {
        	Y = B;
        } else {
        	Y = B + ((P-C)*D);
        }
        
        System.out.println(X > Y ? Y : X);
	}
}
