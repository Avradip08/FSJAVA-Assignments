package World;

public class Q6 {

	public static void main(String[] args) {
		String s="abcdefghijklmnopqrstuvwxy";
		s.toLowerCase();
		int[] arr=new int[26];
		for(int i=0;i<s.length();++i) {
			int a=s.charAt(i)-'a';
			arr[a]++;
		}
		
		boolean f=true;
		for(int i=0;i<26;++i) {
			if(arr[i]==0)
			{
				f=false;
				break;
			}
		}
		
		if(f)
			System.out.println("Pangram");
		else
			System.out.println("Not Pangram");
	}

}
