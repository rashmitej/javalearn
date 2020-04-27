import java.util.Scanner;

public class RepeateChar {

	    public static void main(String[] args)throws Exception{
	   	
	        System.out.println("Enter the string: ");
	        Scanner sc = new Scanner(System.in);
	        try {
	        if (sc.hasNextInt()==false) {
	        String s1 = sc.nextLine();
	        int len = s1.length();
	        while(len > 0) {
	        int count = 1;            
	         for(int j=1;j<len;j++){
	            if(s1.charAt(0)==s1.charAt(j)){
	                count++;
	            }
	         }
	         if (count > 1) {
	            System.out.print(s1.charAt(0)+""+count);    
	         }

	         String character = String.valueOf(s1.charAt(0)).trim();
	         s1 = s1.replaceAll(character,"");
	         len -= count;

	       }
	       } 
	        
	    }
	    
catch(IllegalStateException e) { 
    System.out.println("Exception is: " + e);
	    }
	        finally {
	        	  if(sc!=null)
	        	    sc.close();
	        }
	}
}
	   


