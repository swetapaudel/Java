class Tomato{

void name(){
System.out.println("Tomatoes are healthy.");

}
}

class Fruit extends Tomato{

void name(){
System.out.println("Tomato is a fruit.");
}
}

class Vegetable extends Tomato{

void name(){
System.out.println("Tomato is also a vegetable.");

}
}

class Spain{
public static void main(String Args[]){
Tomato t = new Tomato();
t.name();
t = new Fruit();
t.name();
t = new Vegetable();
t.name();
}
}