package World;

public class Q1 {
	public static void main(String[] args) {
		String s = "ssssassdd";
		String ans = "";
		int[] arr = new int[26];
		for(int i=0;i<s.length();++i) {
			if(arr[s.charAt(i)-'a']==0) {
				arr[s.charAt(i)-'a']=1;
				ans+=s.charAt(i);
			}
		}
		System.out.println(ans);
	}
}
