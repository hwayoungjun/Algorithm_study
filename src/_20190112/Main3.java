package _20190112;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main3 {

	public static void main(String[] args) { 
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(1);
		list.add(0);
		Collections.sort(list);
		
		List<Integer> rtn = new ArrayList<Integer>();
		rtn.add(0);
		rtn.add(0);
		rtn.add(0);
		rtn.add(0);
		
		int i = 0;
		for(Integer e : list) {
			if(e != 0) {
				if(i == e) {
					rtn.add(i, e);
				}
			}
			
			i++;
		}
		
		for(Integer r : rtn) {
			System.out.println(r);
		}
	} 
}
	
