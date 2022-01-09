package practice;

import java.util.*;



public class mon {

public static void main(String[] args) throws Exception {
	
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
	int n=sc.nextInt();
	
	int arr[]=new int[n];
	
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	
	
	int max=Arrays.stream(arr).max().getAsInt();
	boolean p1=false;
	for (int i = 2; i <max; i++) {
		
		if(i%max==0)
		{
			p1=true;
		}
	}

boolean p2=false;
	for (int i = 1; i < max; i++) {
		if(i*i==max)
		{
			p2=true;
			System.out.println("great");
		}
		
	}
	
	
	if(p1==false&&p2==false)
	{
		System.out.println(max);
	}
	
}
}
