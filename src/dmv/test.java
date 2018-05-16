import java.io.FileWriter;

import java.io.IOException;

import java.io.PrintWriter;

 

 public class test {

 public static void main(String[] args)

  {logger("These are not the droids you are looking for. But we do have cookies.");}

  public static void logger (String message) {

  try

  /* Create object and file if it doesn't exist */

   {PrintWriter out = new PrintWriter(new FileWriter("test.txt", true /*Append*/), true /*AutoFlush*/);

  /* Append message */

   out.append(message);

   /* close file and stream */

   out.close();}

  catch(IOException e1)

    {System.out.println("Error during reading/writing");}

   }/* End Sub logger */ 

 }/* End Class */