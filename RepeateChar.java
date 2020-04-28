package StringPgms;
/*Write a method that can take an uncompressed version of a string and return a compressed version.

	     Eg:
	     1. input aaaabbcc
	        output a4b2c2
	     2. input abcababc
	        output a3b3c2 
	     3. input "" or null
	        output IllegalArgumentException    
	     */


public class RepeateChar {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Example1: input aaaabbcc");
		countRepeatChar("aaaabbcc");

		
	}
	public static void countRepeatChar(String strRep){
		try {

			if (strRep.length() == 0 || strRep == null) {
				System.out.println("IllegalArgumentException");
			} else {
				int len = strRep.length();
				while (len > 0) {
					int count = 1;
					for (int j = 1; j < len; j++) {
						if (strRep.charAt(0) == strRep.charAt(j)) {
							count++;
						}
					}
					if (count >= 1) {
						System.out.print(strRep.charAt(0) + "" + count);
					}

					String character = String.valueOf(strRep.charAt(0)).trim();
					strRep = strRep.replaceAll(character, "");
					len -= count;
				}
			}
		} catch (Exception e) {
			System.out.println("IllegalArgumentException");
		}	
	}
}
