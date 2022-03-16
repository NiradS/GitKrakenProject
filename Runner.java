interface perfectSquare {
  boolean run(int num);
}

interface PrintQuotient
{
	void run(float x, float y);
}

public class Runner {
  public static void main(String[] args)
  {
	  PrintQuotient printQuotient = (x, y) -> {float quotient a/b;
	  		quotient = Math.round(quotient*1000.0f)/1000.0f;
	  		System.out.printf("Quotient: %s%n", quotient); };

	  printQuotient.run(2, 7);

      perfectSquare isItSquare = x -> (Math.sqrt(x) == Math.round(Math.sqrt(x)));
      perfectChecker(35,isItSquare);
  }
  public static void perfectChecker(int num, perfectSquare perfect)
  {
    boolean result = perfect.run(num);
    System.out.println(result);
  }
}
/*

What Pranav learned:

I learned that GitKraken and Github is essentially a mutli-user coding platform that simply allows multiple collaborators to participate on one file

I also learned how to create interfaces and apply them into a self-made class.

I also learned what pushing and pulling does, which would definitely help me in the long run.

*/