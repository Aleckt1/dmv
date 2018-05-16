import java.io.*;
import java.util.ArrayList;

public class SaveObjects{

public static void main(String[] arg){

// Create some data objects for us to save.
ArrayList stuff = new ArrayList();
stuff.add("One");
stuff.add("Two");
stuff.add("Three");
stuff.add("Four");
stuff.add("Five");

try{  // Catch errors in I/O if necessary.
// Open a file to write to, named SavedObj.sav.
FileOutputStream saveFile=new FileOutputStream("SaveObj.txt");

// Create an ObjectOutputStream to put objects into save file.
ObjectOutputStream save = new ObjectOutputStream(saveFile);

// Now we do the save.

save.writeObject(stuff);

// Close the file.
save.close(); // This also closes saveFile.
}
catch(Exception exc){
exc.printStackTrace(); // If there was an error, print the info.
}
}
}