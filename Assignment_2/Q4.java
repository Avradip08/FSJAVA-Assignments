package World;

import java.util.Scanner;
class MergeSort{
	Integer n;
	Integer[] arr;
	MergeSort(Integer n,Integer[] arr){
		this.n=n;
		this.arr=arr;
	}
	
	public void mergeSortFunction(int l,int r) {
		if(l>=r)
			return;
		else {
			int mid = l + (r - l) / 2;
			mergeSortFunction(l,mid);
			mergeSortFunction(mid+1,r);
			mergeSortUtil(l,mid,r);
		}
	}
	
	public void mergeSortUtil(int l,int mid,int r) {
		int i=0,j=0;
		int n1=mid-l+1;
		int n2=r-mid;
		
		int[] lsub = new int[n1];
		int[] rsub = new int[n2];
		
		for(int a=0;a<n1;++a)
			lsub[a]=arr[l+a];
		
		for(int a=0;a<n2;++a)
			rsub[a]=arr[mid+a+1];
		
		int k=l;
		
		while(i<n1 && j<n2) {
			if(lsub[i]<rsub[j]) {
				arr[k++]=lsub[i++];
			}else {
				arr[k++]=rsub[j++];
			}
		}
		
		while(i<n1)
			arr[k++]=lsub[i++];
		
		while(j<n2)
			arr[k++]=rsub[j++];
		
	}
	
	public void display() {
		System.out.println("Array after sorting:");
		for(int i=0;i<n;++i) {
			System.out.print(arr[i] + " ");
		}
	}
}
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		Integer n=sc.nextInt();
		Integer[] arr=new Integer[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;++i)
			arr[i]=sc.nextInt();
		sc.close();
		MergeSort m=new MergeSort(n,arr);
		m.mergeSortFunction(0,n-1);
		m.display();
	}

}
