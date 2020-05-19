import java.io.*;

class FileBuffering{
public static void main(String args[]) throws IOException, FileNotFoundException{
FileOutputStream file = new FileOutputStream("file.txt");
BufferedOutputStream bs = new BufferedOutputStream(file);
String s = "Hello...";
byte b[] = s.getBytes();
bs.write(b);
bs.flush();
}
}