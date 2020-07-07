package _20200708;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_20200708_9095 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		Integer T = Integer.parseInt(st1.nextToken()); //테스트 케이스

		int[] result = new int[T];
		
		for(int i=0; i<T; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int num = Integer.valueOf(Integer.parseInt(st2.nextToken())); //정수 n

			int[] box = new int[num];
			for(int j=0; j<box.length; j++) {
				int sum = 0;
				for(int z=1; z<4; z++) {
					box[num - 1] = z;
					int boxIdx = 0;
					while(true) {
						sum += box[boxIdx];

						if(sum == num) {
							result[i] += 1;
						} else if(sum < num) {
							boxIdx += 1;
						} else if(sum > num) {
							break;
						}
					}
				}
			}
		}
    }
}