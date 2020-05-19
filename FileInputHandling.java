import java.io.*;

class FileInputHandling{
public static void main(String args[]) throws IOException, FileNotFoundException{
FileInputStream file = new FileInputStream("file.txt");
int x = file.read();
System.out.println((char)x); 
}
}