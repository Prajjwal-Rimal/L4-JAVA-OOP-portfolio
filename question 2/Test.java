public class Test 
// while changing Test to test the problem that arose is:
// Exception in thread "main" java.lang.Error: Unresolved compilation problem: test.main(Test.java:6)
{
   public static void main (String[] args)
   // changing main to man returns no class found 
   {
      System.out.println ("An Emergency Broadcast");
      // removing the semicolon returns an incomplete code block
      // changing println to bogus gives compilation error as there is no method named bogus
      // no change while changing Emergency to emergency, string type made it lowercase
      // while removing the first quotation mark syntax error raised: String literal is not properly closed by a double-quote
   }
}
   // rmoving the last brace from the program returns syntax error 