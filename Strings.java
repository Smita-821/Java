//String methods
public class Main
{
	public static void main(String[] args) {
		String s="Welcome";
		String s1="Java";
        //int length=s.length();
        System.out.println(s.length());
        System.out.println(s.concat(s1));
        String s3 ="          Welcome      ";
        System.out.println("Before using trim method:" + s3);
        System.out.println("After using trim method:"+ s3.trim());
        //charAt
        String s2="Core java";
        System.out.println(s2.charAt(5));
        System.out.println(s2.contains("java"));//true
        System.out.println(s2.contains("core"));//false
           System.out.println(s2.contains("Core"));//true
        //equals method
        System.out.println(s.equals(s2));//false
         System.out.println(s.equals("Core java"));
         String s4="Phyton";
         System.out.println(s4.substring(1,4));//substring methid
          System.out.println(s4.substring(0,3));
        //uppecase and lowercase
        String s5="Stringmethods";
        System.out.println(s5.toLowerCase());
        System.out.println(s5.toUpperCase());
          
         
        
	}
	
}
