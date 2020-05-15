class ExceptionExample{
public static void main(String args[]){
int a = 20, b = 2;
String name = null;
System.out.println("Sum = " + (a + b));
try{
System.out.println("Division = " + (a/b));
	try{
	System.out.println("Length ="+name.length());
	}
	catch(NullPointerException np){
	np.printStackTrace();
	}
}
catch(ArithmeticException x){
x.printStackTrace();
}

}
}