package World;

public class Q5 {

	public static void main(String[] args) {
		String s1="aapdd";
		String s2="dadapa";
		
		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
		
		if(s1.length()!=s2.length()) {
			System.out.println("Not anagram");
		}
		else {
			for(int i=0;i<s1.length();++i) {
				arr1[s1.charAt(i)-'a']++;
				arr2[s2.charAt(i)-'a']++;
			}
			boolean f=true;
			for(int i=0;i<26;++i) {
				if(arr1[i]!=arr2[i])
				{
					f=false;
				}
			}
			if(f) {
				System.out.println("Anagram");
			}
			else
				System.out.println("Not Anagram");
		}
		
	}

}
