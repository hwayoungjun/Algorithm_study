package _20190112;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {

	private static List<int[]> arrs = new ArrayList<int[]>();
	
	public static void main(String[] args) { 
		int[] rtn = {};
		int[] arr = { 2, 1, 1, 0 }; perm(arr, 0, 4, 4);
		
		for(int[] a : arrs) {
			
			int i = 0;
			boolean isTrue = true;
			
			for(int e : a) {
				if(isTrue) {
					
					//���� ���� 0�̰� i�� 0�̸� ��
					if(e == 0 && i == 0) {
						isTrue = true;
					} 
					//�ƴ� ��� ���� �ε��� ���� �迭���� ���� ������ ���� ���� ������ ���� ���� �����ϸ� ��
					else {
						int cnt = 0;
						//���� �迭��� ���ϱ�
						for(int j=0; j<i; j++) {
							if(a[j] < e) {
								cnt++;
							}
						}
						
						if(cnt == e) {
							isTrue = true;
						} else {
							isTrue = false;
						}
						
					}
					 
				}
				
				i++;
			}
			
			//��� ���̸� ����
			if(isTrue) {
				rtn = a;
			} 
			//�ϳ��� �����̸� ����
			else {
				continue;
			}
		}
		
		System.out.println(Arrays.toString(rtn));
		
		int[] realRtn = new int[4];
		for(int x=0; x<arr.length; x++) {
			for(int y=0; y<rtn.length; y++) {
				if(arr[x] == rtn[y]) {
					realRtn[y] = x+1;
				}
			}
		}
		
		//�ߺ� �Է°��� ���� üũ
		
		
		
		System.out.println(Arrays.toString(realRtn));
	} 
	
	public static void perm(int[] arr, int depth, int n, int k) { 
		if (depth == k) {
			// �ѹ� depth �� k�� �����ϸ� ����Ŭ�� ������. �����. 
			print(arr,k); return; } 
			for (int i = depth; i < n; i++) { 
				swap(arr, i, depth); 
				perm(arr, depth + 1, n, k); 
				swap(arr, i, depth); 
		} 
	} // �ڹٿ����� �����Ͱ� ���� ������ �Ʒ��� ����, �ε��� i�� j�� ���� �ٲ���.
	
	public static void swap(int[] arr, int i, int j) { 
		int temp = arr[i]; 
		arr[i] = arr[j]; 
		arr[j] = temp; } 
	
	public static void print(int[] arr, int k) { 
		
		int[] a = new int[4];
		
		for (int i = 0; i < k; i++) { 
			if (i == k - 1) {
				a[i] = arr[i];
//				System.out.println(arr[i]); 
			}
			else { 
				a[i] = arr[i];
//				System.out.print(arr[i] + ","); 
			}
		}
		
		arrs.add(a);
	} 
}
	
