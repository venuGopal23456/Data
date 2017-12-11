package DataStructures;

public class Arrays {

	public static void main(String[] args) {
		String[] alphabet= {"a","b","c","d","e"};
		for(int i=0;i<5;i++)
		{System.out.println(alphabet[i]+"");}
		
		for(int i=0;i<alphabet.length;i++)
		{System.out.print(alphabet[i]  +  " ");}
		
		for(String letter : alphabet)
		{System.out.print(letter +"");}

		
		String[] [] users= {{"venu","vajeravelu","3456","PG"},
				{"vv","gg","88888","ug"},
				{"hh","tt","ii","ii"}};
		int noofrows=users.length;
		int nooffiels=users[0].length;
		System.out.println("The no of rows"+noofrows);
		System.out.println("The no of fiels"+nooffiels);
		
		for(int i=0;i<noofrows;i++)
		{
			for(int j=0;j<nooffiels;j++)
			{
				System.out.println(users[i][j]);
			
			}
		}
		for(int i=0;i<noofrows;i++)
		{
		String fname=users[i][0];	
		String lname=users[i][1];
		String no=users[i][2];
		String lo=users[i][3];
		System.out.println("Firstname "+ fname +" Lastname " + lname +"  Number "+ no +"  lo "+ lo);
		
		}
		for(String[] user:users)
		{System.out.print("[");
		for(String fiels:user) {
			
			System.out.print(fiels);
		}
		System.out.print("]\n");	
		
		}
		
}
		}
	


