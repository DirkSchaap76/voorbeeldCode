package practiceStuff;

public class Primitve {

	float e;
	float f = 1;
	// float ff = 1.0; // won't compile. if there is no f at the end, the value will
	// automatically be a double!
	float g = (float) 1.0;
	float h = 1.0f;
	// value must be cast to float
	// Arithmetic operations are automatically changed to int/double
	float i = (float) (1.0 / 2.0);
	float j = (float) (1.0 + 2.0);

	// char a = a; // won't compile, needs single quotes
	char aa = 'a';
	char b = 1; // char can be a number
	char c;
	public char d = 2 - 1;
	{
		System.out.println("d is: " + d);
	}

}
