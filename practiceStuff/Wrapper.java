package practiceStuff;

public class Wrapper {
	
	// String fields:
	static String myStr = "hallo";
	static String hallo = "hallo";
	static String halloToo = new String("hallo");
	static String myStr1 = "  spaced out   ";
	static String myStr2 = myStr + myStr1;
	static String myStr3 = myStr;

	public static void main(String[] args) {
		
		// fun with Strings:
		System.out.println("myStr char at 3 is: " + myStr.charAt(3));
		System.out.println("myStr indexOf(o) is: " + myStr.indexOf("o"));
		System.out.println("myStr1 is: " + myStr1);
		System.out.println("myStrr1 trim() is: " + myStr1.trim());
		System.out.println("myStr1 replace('a', 'b') is: " + myStr1.replace('a', 'b'));
		System.out.println("myStr length() is: " + myStr.length());
		System.out.println("myStr startsWith() is: " + myStr.startsWith(myStr, 'a'));
		System.out.println("myStr endsWith() is: " + myStr.endsWith(myStr1));
		System.out.println("myStr2 + myStr is: " + myStr2 + myStr);
		System.out.println("myStr2 trimmed + myStr is: " + myStr2.trim() + myStr);
		System.out.println("myStr3 == myStr is: " + (myStr == myStr3));
		System.out.println("myStr == hallo is: " + (myStr == hallo));
		System.out.println("hallo == halloToo is: " + (hallo == halloToo));
		System.out.println("hallo equals hallToo is: " + hallo.equals(halloToo));

		/*
		 * myStr == myStr3 is: true, because they both point to the same object 
		 * myStr == hallo is: true, because they both point to the same object 
		 * hallo == halloToo is: false, because they point to two different objects 
		 * hallo.equals(halloToo) is: true, because they have the same content
		 * 
		 * 
		 */
	}

}
