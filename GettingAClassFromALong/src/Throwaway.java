
public class Throwaway {

	public static void main(String[] args) {
	
		// Always use L with long literals.
		long badLong  = 0x00000000FFFFFFFF;
		long goodLong = 0x00000000FFFFFFFFL;
		System.out.println(badLong);
		System.out.println(goodLong);

		// Java chars are utf16. Ascii a is 0x61. UTF16 a is 0x0061
		int i = 0x00000061;
		char a = (char)i; // grabs the last 2 bytes from i.
		System.out.println(a);
		
	
	}

}
 