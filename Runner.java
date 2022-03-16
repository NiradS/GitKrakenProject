interface perfectSquare {
  boolean run(int num);
}

<<<<<<< HEAD
public class Runner {
  public static void main(String[] args)
  {
      perfectSquare isItSquare = x -> (Math.sqrt(x) == Math.round(Math.sqrt(x)));
      perfectChecker(35,isItSquare);
  }
  public static void perfectChecker(int num, perfectSquare perfect)
  {
    boolean result = perfect.run(num);
    System.out.println(result);
  }
=======
public class Runner
{

	public static void main(String[]args)
	{
		PrintQuotient printQuotient = (x, y) -> {float quotient a/b;
		quotient = Math.round(quotient*1000.0f)/1000.0f;
		System.out.printf("Quotient: %s%n", quotient); };

		printQuotient.run(2, 7);


	}



>>>>>>> Print_Quotient
}