package _20190504;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main_20190503_1465 {

	public static void main(String[] args) throws IOException {
		
		
//		System.out.println(Integer.toBinaryString(10));
//		System.out.println(Integer.toBinaryString(12));
//		System.out.println(10 ^ 12);
//		System.out.println(Integer.toBinaryString(10 ^ 12));
//		System.out.println(Integer.toBinaryString(5));
//		System.out.println(Integer.parseInt("101",2));
//		System.out.println(Integer.bitCount(10 ^ 12));
		
		String rtnStr = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st1.nextToken()); //A
//        st1.nextToken(); //A
        int low = Integer.parseInt(st1.nextToken()); //LOW
        int high = Integer.parseInt(st1.nextToken()); //HIGH
        
        int[] arr = new int[a];
        ArrayList<Integer> rtn = new ArrayList<Integer>();
        int c = 0;
        while(st2.hasMoreTokens()) {
        	arr[c] = Integer.parseInt(st2.nextToken());
        	c++;
        }
        
//        for(int e : arr) {
        for(int d=0; d<a; d++) {
        	boolean isSkip = false;
        	HashMap<Integer,Integer> out = new HashMap<Integer,Integer>();
        	
        	String strA = Integer.toBinaryString(arr[d]);
        	int x = strA.length();
        	for(int j=low; j<=high; j++) {
        		String strB = Integer.toBinaryString(j);
        		int y = strB.length();
        		if(y > x) {
        			strA = strA + String.join("", Collections.nCopies(Math.abs(x-y), "0"));
        		} else if(y < x) {
        			strB = strB + String.join("", Collections.nCopies(Math.abs(x-y), "0"));
        		}
//        		if(y > x) {
//        			while(x == y) {
//        				strB = "0" + strB;
//        				x = strB.length();
//        			}
//        			System.out.println(strB);
//        		} else if(y < x) {
//        			while(x == y) {
//        				strA = "0" + strA;
//        				y = strA.length();
//        			}
//        			System.out.println(strA);
//        		} else {
//        			int diff = 0;
//        			for(int z=0; z<strA.length(); z++) {
//        				int a1 = strA.charAt(z);
//        				int b1 = strB.charAt(z);
//        				diff += Math.abs(a1-b1);
//        			}
//        			out.put(j, diff);
//        			System.out.println(Integer.parseInt(strA, 2));
//        			System.out.println(Integer.parseInt(strB, 2));
//        			System.out.println(diff);
//        		}
        		
        		if(Integer.bitCount(Integer.parseInt(strA,2) ^ Integer.parseInt(strB, 2)) <=1) {
        			rtnStr += j+" ";
        			isSkip = true;
        			break;
        		} else {
        			out.put(j, Integer.bitCount(Integer.parseInt(strA,2) ^ Integer.parseInt(strB, 2)));
        		}
        	}

        	if(!isSkip) {
            Iterator it = sortByValue(out).iterator();
            rtnStr += it.next()+" ";
//            while(it.hasNext()) {
//            	System.out.print(it.next());
//            	rtn.add((int)it.next());
//            }
        	} else {
        		isSkip = false;
        	}
        }
        
//        for(int r=0; r<a; r++) {
//        	rtnStr += rtn.get(r);
//        	System.out.print(rtn.get(r));
//        	if(r == a-1) {
//        		rtnStr += " ";
//        		System.out.print(" ");
//        	}
//        }
        System.out.println(rtnStr.substring(0, rtnStr.length()-1));
//        System.out.println(a);
//        System.out.println(low);
//        System.out.println(high);
//        
//        for(int i : arrInput) {
//        	System.out.println(i);
//        }
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List sortByValue(final Map map){
        List<String> list = new ArrayList<>();
        list.addAll(map.keySet());
         
        Collections.sort(list,new Comparator(){
             
            public int compare(Object o1,Object o2){
                Object v1 = map.get(o1);
                Object v2 = map.get(o2);
                 
                return ((Comparable) v1).compareTo(v2);
            }
             
        });
//        Collections.reverse(list); // 주석시 오름차순
        return list;
    }
}