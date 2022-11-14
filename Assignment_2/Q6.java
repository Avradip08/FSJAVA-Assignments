package World;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> m1 =new HashMap<Integer,Integer>();
		Map<Integer,Integer> m2 =new HashMap<Integer,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array1:");
		Integer n1=sc.nextInt();
		Integer[] arr1=new Integer[n1];
		System.out.println("Enter the elements in array1:");
		for(int i=0;i<n1;++i) {
			arr1[i]=sc.nextInt();
			if(m1.containsKey(arr1[i]))
				m1.put(arr1[i],m1.get(arr1[i])+1);
			else
				m1.put(arr1[i], 1);
		}
			
		
		System.out.println("Enter the number of elements in array2:");
		Integer n2=sc.nextInt();
		Integer[] arr2=new Integer[n2];
		System.out.println("Enter the elements in array2:");
		for(int i=0;i<n2;++i) {
			arr2[i]=sc.nextInt();
			if(m2.containsKey(arr2[i]))
				m2.put(arr1[i],m2.get(arr2[i])+1);
			else
				m2.put(arr2[i], 1);
		}
			
		
		sc.close();
		
		//checking whether arr2 is a subset of arr1
		boolean f=false;
		for(Integer key:m2.keySet()) {
			if(!m1.containsKey(key)) {
				f=true;
				break;
			}
			else if(m1.get(key)<m2.get(key)) {
				f=true;
				break;
			}
		}
		
		if(f)
			System.out.println("arr2 is not a subset of arr1");
		else
			System.out.println("arr2 is a subset of arr1");
		
	}

}
