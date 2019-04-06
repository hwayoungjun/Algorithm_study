package _20190223;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_20190223_1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        
        int score1 = Integer.parseInt(st1.nextToken());
        int score2 = Integer.parseInt(st1.nextToken());
        int score3 = Integer.parseInt(st1.nextToken());
        int score4 = Integer.parseInt(st1.nextToken());
        
        int score5 = Integer.parseInt(st2.nextToken());
        int score6 = Integer.parseInt(st2.nextToken());
        int score7 = Integer.parseInt(st2.nextToken());
        int score8 = Integer.parseInt(st2.nextToken());
        
        int scoreSum1 = score1 + score2 + score3 + score4;
        int scoreSum2 = score5 + score6 + score7 + score8;
        
        System.out.println(scoreSum1 >= scoreSum2 ? scoreSum1 : scoreSum2);
	}
}
