package World;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q1 {
	public static void main(String[] args) {
		Set<Integer> s=new HashSet<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		Integer n=sc.nextInt();
		Integer[] arr=new Integer[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;++i)
			arr[i]=sc.nextInt();
		sc.close();
		boolean f = false;
		Integer duplicate = null;
		for(int i=0;i<n;++i) {
			if(s.contains(arr[i])) {
				f=true;
				duplicate = arr[i];
				break;
			}
			else {
				s.add(arr[i]);
			}
		}
		if(f)
			System.out.println("Contains Duplicate: " + duplicate);
		else
			System.out.println("Does not contain Duplicate");
		
	}
}
