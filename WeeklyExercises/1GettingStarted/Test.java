public class Test
{
   //----------------------------------------------------
   //  Prints a statement.
   //----------------------------------------------------
   public static void main (String[] args)
   {
      System.out.println ("An Emergency Broadcast");
   }
}

// Changing "Test" to "test" the error that appears is "NoClassDefFoundError"
// Changing "Emergency" to "emergency" does not give an error because it is a print statement
// Removing the first quotation mark in the string gives the error "Syntax Error, insert"
// Changing 