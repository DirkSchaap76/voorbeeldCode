package temporarayTestStuff;

public class LocalOrNot {

	static String str = "hello world";
	String pubStr = "my public string";

	public static void changeIt(String s) {
		s = "Good bye world";// this only change the local variable, but doesn't change any field that is
								// passed as an argument!
		System.out.println("this is changeIt's local s= " + s);
	}

	void nonStatChange(String s) {
		s = "I am a local variable"; // this only change the local variable, but doesn't change any field that is
										// passed as an argument!

		System.out.println("nonStatChange's local s= " + s); // prints local s, doesn't print any field
	}

	void someMoreChanges(String s) {
		this.pubStr = s;
		s = "lets change it"; // now any field passed as an argument is actually changed!
		System.out.println("someMoreChanges' String= " + s);
	}

	String evenMoreChanges(String s) {
		s = s;
		s = "evenMoreChanges!"; // argument that is passed is now actually changed!
		System.out.println("I am evenMoreChanges' String: " + s);
		return s;
	}

	public static void main(String[] args) {
		changeIt(str);
		System.out.println(str);

		// testing on objects from Class LocalOrNot
		LocalOrNot ts = new LocalOrNot();
		// ts.pubStr = "I am ts's String";
		System.out.println("What will ts's String be?: " + ts.pubStr);
		ts.nonStatChange(ts.pubStr);
		ts.someMoreChanges(str);
		ts.someMoreChanges(ts.pubStr);
		ts.evenMoreChanges(ts.pubStr);

	}

}
