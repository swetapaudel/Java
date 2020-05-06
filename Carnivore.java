abstract class Animals{
abstract void lifespan();
void breathe(){
System.out.println("All living beings breathe");
}
}

class Tiger extends Animals{
void lifespan(){
System.out.println("Tiger Lives around 10 - 15 years");
}
void breathe(){
System.out.println("Tiger breathes");
}
}

class Lion extends Animals{
void lifespan(){
System.out.println("Lion Lives around 10 - 14 years");
}
void breathe(){
System.out.println("Lion breathes");
}
}

class Carnivore{
public static void main(String args[]){
Animals t = new Tiger();
t.lifespan();
t.breathe();
t = new Lion();
t.lifespan();
t.breathe();
}
}