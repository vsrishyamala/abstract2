package com.abb1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		String name,detail,owner;
		int n,nostall,noshow,noseat;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name of event");
		name=s.nextLine();
		System.out.println("Enter the details of event");
		detail=s.nextLine();
		System.out.println("Enter the owner name of the event");
		owner=s.nextLine();
		System.out.println("Enter the type of event");
		System.out.println("1.Exhibition");
		System.out.println("2.StageEvent");
		n=s.nextInt();
		if(n==1)
		{
			System.out.println("Enter the number of stalls");
			nostall=s.nextInt();
			Event e = new Exhibition(name,detail,owner,nostall);
			System.out.println("The projected revenue of the event is :"+e.calculateRevenue());
	
		}
		else
		{
			System.out.println("Enter the number of show");
			noshow=s.nextInt();
			System.out.println("Enter the number of detas per shaw");
			noseat =s.nextInt();
			Event ev=new StageEvent(name,detail,owner,noshow,noseat);
			System.out.println("The projected revenue of the event is :"+ev.calculateRevenue());
			
		}
		

	}

}
