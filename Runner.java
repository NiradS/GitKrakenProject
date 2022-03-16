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

//Nirad Shah Comments
//I learned how to properly use github as I have never used it before and I learned how important it was to adapt to learn new softwares.
//I also refreshed interfaces and lamadas since it has been a while since I used them
