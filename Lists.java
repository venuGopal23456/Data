package DataStructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr=new <String>ArrayList();
		
		arr.add("Ireland");
		arr.add("Portsmouth");
		arr.add("Vellore");
		
		
		for(String a:arr)
		{System.out.println(arr);}
		
		int siz=arr.size();
		System.out.println(siz);
		
		System.out.println(arr.get(0));
		
		
		arr.remove(0);
		for(String a:arr)
		{System.out.println(arr);}
	}

}
