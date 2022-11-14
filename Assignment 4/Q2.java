package World;

public class Q2 {
	public static void main(String[] args) {
		String s = "ssssassdd";
		String ans = "";
		int[] arr = new int[26];
		for(int i=0;i<s.length();++i) {
			arr[s.charAt(i)-'a']+=1;
		}
		for(int i=0;i<26;++i)
		{
			if(arr[i]>1)
				ans+=(char)(i+'a');
		}
		System.out.println(ans);
	}
}
