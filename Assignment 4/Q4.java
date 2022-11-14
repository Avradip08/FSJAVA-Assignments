package World;

public class Q4 {

	public static void main(String[] args) {
		String s="aa*7tdgi";
		int vowel=0,consonant=0,special=0;
		for(int i=0;i<s.length();++i) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				char f = s.charAt(i);
				if(f=='a' || f=='e' || f=='i' || f=='o' || f=='u')
					vowel++;
				else
					consonant++;
			}
			//considering numbers to be special characters
			else
			{
				special++;
			}
			
		}
		System.out.println("vowels: "+vowel);
		System.out.println("consonants: "+consonant);
		System.out.println("special characters: "+special);
	}

}
