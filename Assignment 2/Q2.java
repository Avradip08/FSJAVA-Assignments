package World;

import java.util.Scanner;

class QuickSort{
	Integer n;
	Integer[] arr;
	QuickSort(Integer n,Integer[] arr){
		this.n=n;
		this.arr=arr;
	}
	public void swap(int i, int j)
    {
        Integer temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	public void quickSortFunction(int l,int r) {
		if (l < r) {
			  
            int pivot = quickSortUtil(l,r);
            
            quickSortFunction(l, pivot - 1);
            quickSortFunction(pivot + 1, r);
        }
	}
	
	public int quickSortUtil(int l,int r) {
		int pivot = arr[r];
		int i = (l - 1);
        for (int j = l; j < r; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, r);
        return (i + 1);
	}
	
	public void display() {
		System.out.println("Array after sorting:");
		for(int i=0;i<n;++i) {
			System.out.print(arr[i] + " ");
		}
	}
}
public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		Integer n=sc.nextInt();
		Integer[] arr=new Integer[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;++i)
			arr[i]=sc.nextInt();
		sc.close();
		QuickSort q = new QuickSort(n,arr);
		q.quickSortFunction(0,n-1);
		q.display();
	}

}
