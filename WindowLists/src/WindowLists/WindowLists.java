package WindowLists;

import java.util.*;

public class WindowLists {
	public static void main(String args[]){
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(5);
		l.add(8);
		l.add(9);
		l.add(3);
		l.add(4);
		l.add(1);
		int window=2;
		int[] s=new int[l.size()];
		for(int i=0;i<window;i++){
			s[0]=s[0]+l.get(i);
		}
		int j=0, k=1, sum=0;
		for(int i=0;i<l.size(); i++){
			System.out.println("i="+i);
			if(j<=window){
				sum=sum+l.get(i);
				System.out.println("Sum="+sum);
				j++;
			}
			else{
				s[k]=sum-l.get(k-1);
				System.out.println("s[k]="+s[k]);
				i=k-1;
				k++;
				j=0;
				sum=0;
			}
			
		}
		for(int i=0;i<s.length; i++){
			System.out.println(s[i]);
		}
		/*
		int[] sum=new int[l.size()-window+1];
	
		for(int i=0;i<=l.size()-window; i++){
			 
		}
		for(int i=0;i<sum.length; i++){
			System.out.println(sum[i]);
		}*/
	}

}
