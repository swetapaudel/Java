import java.util.Scanner;
class Multithreading extends Thread{
int x;
int y;
public void run(){
System.out.println("Enter x & y values");
Scanner sc = new Scanner(System.in);
x=sc.nextInt();
y=sc.nextInt();
}

public static void main(String args[])throws Exception{

Multithreading sum = new Multithreading();
sum.start();
sum.join();
int z;
z=sum.x + sum.y;
System.out.println("Sum = " + z);
}
}