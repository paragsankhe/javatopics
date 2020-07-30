package javatopics;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Welcome";
	 String s2 = "To this world";
	 String s3 = "Welcome";
	 
	 System.out.println(s1.length());  //length()
	 System.out.println(s1.concat(s2)); //concat ()
	 System.out.println(s1.equals(s2)); // equals()
	 System.out.println(s1.equals(s3)); // equals()
	 System.out.println(s1.equalsIgnoreCase(s2)); // equalsIgnoreCase()
	 System.out.println(s1.contains("Wel"));
	 System.out.println(s1.replace("Wel","Babu"));
	 System.out.println(s1.subSequence(2, 5));
	 

	}

}
