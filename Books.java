class Library{

	int bookId;
	static String libraryName; 
	boolean isAvailable;

}

public class Books{
public static void main (String args[]){
	Library data = new Library();
	data.bookId = 111;
	Library.libraryName = "Michelle Memorial";
	data.isAvailable = true;


	System.out.println(data.bookId);
	System.out.println(Library.libraryName);
	System.out.println(data.isAvailable);

	Library math= new Library();
	math.bookId = 222;
	math.isAvailable = false;

	System.out.println(math.bookId);
	System.out.println(Library.libraryName);
	System.out.println(math.isAvailable);


}	
}