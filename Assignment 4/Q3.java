package World;


public class Q3 {

	public static void main(String[] args) {
		String s = "2512";
		int l=0,r=s.length()-1;
		boolean flag=true;
		while(l<r) {
			if(s.charAt(l)!=s.charAt(r))
			{
				flag=false;
				break;
			}
			++l;
			--r;
		}
		if(flag)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}

}
