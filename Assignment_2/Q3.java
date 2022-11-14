package World;

import java.util.Scanner;

class BubbleSort{
	Integer n;
	Integer[] arr;
	BubbleSort(Integer n,Integer[] arr){
		this.n=n;
		this.arr=arr;
	}
	
	public void bubbleSortFunction() {
		for(int i=0;i<n;++i) {
			for(int j=1;j<n-i;++j) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
	
	public void display() {
		System.out.println("Array after sorting:");
		for(int i=0;i<n;++i) {
			System.out.print(arr[i] + " ");
		}
	}
}

public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		Integer n=sc.nextInt();
		Integer[] arr=new Integer[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;++i)
			arr[i]=sc.nextInt();
		sc.close();
		BubbleSort b=new BubbleSort(n,arr);
		b.bubbleSortFunction();
		b.display();
	}

}
