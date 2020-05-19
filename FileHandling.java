import java.io.*;

class FileHandling{
public static void main(String args[]) throws IOException, FileNotFoundException{
FileOutputStream file = new FileOutputStream("file.txt");
String st = "Done Homework";
byte b[] = st.getBytes();
file.write(b); 
}
}