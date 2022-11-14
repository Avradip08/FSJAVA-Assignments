package World;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
		int[] arr=new int[26];
		for(int i=0;i<s.length();++i) {
			arr[s.charAt(i)-'a']++;
		}
		int ans=0;
		char x='*';
		for(int i=0;i<26;++i) {
			if(arr[i]>ans) {
				ans=arr[i];
				x=(char)(i+'a');
			}
		}
		if(x=='*')
			System.out.println("Empty string");
		else
			System.out.println("Max occuring character: " + x + " : " + ans + " times");
	}

}
