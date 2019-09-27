class SimpleIf
{
   public static double max(double x, double y)
   {
      /* TO DO: Write an if statement to determine which
         argument is larger and return that value.
      */
      double answer;
      if (x >= y) {
         answer = x;
      } else {
         answer = y;
      }
      return answer; // clearly not correct -- but testable
   }
}
