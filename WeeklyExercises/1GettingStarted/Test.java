public class Test
{
   //----------------------------------------------------
   //  Prints a statement.
   //----------------------------------------------------
   public static void main (String[] args)
   {
      System.out.bogus ("An Emergency Broadcast");
   }
}

// Changing "Test" to "test" the error that appears is "NoClassDefFoundError"
// Changing "Emergency" to "emergency" does not give an error because it is a print statement
// Removing the first quotation mark in the string gives the error "Syntax Error, insert"
// Changing "main" to "man" does not give an error because it is a function name hat the user can change
// Changing "println" to "bogus" does not give an error because it is meant to simulate real data
// Removing the semicolon at the end of the print statement no error appears because it marks the end of a statement, meaning there is no end yet so the code inside will stil function
// Removing the last bracket in the program does not give an error because it is not relying on that brace
