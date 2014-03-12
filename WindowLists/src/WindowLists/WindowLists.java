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
		int[] s=new int[l.size()-window+1];
		int temp;
		for(int i=0;i<window;i++){
			s[0]=s[0]+l.get(i);
		}
		temp=s[0];
		int j=0, k=1, sum=0;
		for(int i=1; i<l.size()-window+1; i++)
		{
			s[i]=temp+l.get(i+window-1)-l.get(i-1);
			temp=s[i];
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
