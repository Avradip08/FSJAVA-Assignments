package World;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdefgg";
		boolean f=true;
		int[] arr=new int[26];

		for(int i=0;i<s.length();++i) {
			int a=s.charAt(i) - 'a';
			arr[a]++;
			if(arr[a]>1) {
				f=false;
				break;
			}
		}
		if(f)
			System.out.println("string contains all unique characters");
		else
			System.out.println("String does not contain all unique characters");
	}

}
