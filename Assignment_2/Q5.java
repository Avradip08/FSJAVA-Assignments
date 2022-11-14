package World;

import java.util.Scanner;
class SelectionSort{
	Integer n;
	Integer[] arr;
	SelectionSort(Integer n,Integer[] arr){
		this.n=n;
		this.arr=arr;
	}
	
	public void seclectionSortFunction() {
		for(int i=0;i<n;++i) {
			Integer mini=1000000000;
			Integer idx=-1;
			for(int j=i;j<n;++j) {
				if(arr[j]<mini) {
					mini=arr[j];
					idx=j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[idx];
			arr[idx]=temp;
		}
	}
	
	public void display() {
		System.out.println("Array after sorting:");
		for(int i=0;i<n;++i) {
			System.out.print(arr[i] + " ");
		}
	}
}

public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		Integer n=sc.nextInt();
		Integer[] arr=new Integer[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;++i)
			arr[i]=sc.nextInt();
		sc.close();
		SelectionSort s = new SelectionSort(n,arr);
		s.seclectionSortFunction();
		s.display();
	}

}
