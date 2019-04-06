package _20190406;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_20190406_3_3004 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        
        int score1 = Integer.parseInt(st1.nextToken());

        int r = score1 / 2;
        int c = score1 - r;
        
        System.out.println((r+1)*(c+1));
	}

}