package _20190223;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main_20190223_3 {
	
	public static class BinaryTree {
		private int count;
		private int value;
		private BinaryTree left, right;
		
		public BinaryTree(int count, int param) {
			value = param;
			this.count = count + 1;
			left = null;
			right = null;
		}
		
		public BinaryTree add(int param) {
			
			BinaryTree curTree = this;
			count = count + 1;
			
			//X�� ��� N�� �ִ� ������ �۴ٸ�
			if(this.value > param) {
				//N�� ���� �ڽ��� ���ٸ�
				if(this.left == null) {
					//X�� �����ϴ� �� ��带 ���� ��, N�� ���� �ڽ����� �����
					curTree = new BinaryTree(count, param);
					this.left = curTree;
//					count = curTree.count;
				} else {
					//insert(X, N�� ���� �ڽ�)
					this.count = add(this.left.value).count;
				}
			} 
			//X�� ��� N�� �ִ� ������ ũ�ٸ�
			else if(this.value != param) {
				//N�� ������ �ڽ��� ���ٸ�
				//X�� �����ϴ� �� ��带 ���� ��, N�� ������ �ڽ����� �����
				if(this.right == null) {
					curTree = new BinaryTree(count, param);
					this.right = curTree;
//					count = curTree.count;
				} 
				//insert(X, N�� ������ �ڽ�)
				else {
					this.count = add(this.right.value).count;
				}
			}
			
			System.out.println("count = " + count);
			
			return curTree;
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		List<Integer> arr = new ArrayList<Integer>();
		String line;
		try {
			while ((line = br.readLine()) != null) {
			arr.add(Integer.parseInt(line));
			}
		} catch(Exception e) {
			
		}
		
		BinaryTree binaryTree = new BinaryTree(0, arr.get(0));
		boolean isFirst = true;
		BinaryTree curTree = binaryTree;
		for(int value : arr) {
			if(isFirst) {
				isFirst = false;
			}
			else {
				curTree = curTree.add(value);
			}
		}
		
        System.out.println(curTree.count);
	}
}
