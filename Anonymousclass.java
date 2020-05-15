abstract class Iphone{
abstract void apps();
}

class Anonymousclass{
public static void main(String args[]){
Iphone x = new Iphone(){
void apps(){
System.out.println("Iphone has so many apps");
}
};
x.apps();
}
}