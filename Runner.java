interface perfectSquare {
  boolean run(int num);
}

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
}