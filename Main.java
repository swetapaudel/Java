class Mammals{
void fourChamberedHeart(){
System.out.println("Mammals have four chambered Heart");
}
}

class Animals extends Mammals{
String Animal;
String isAnimal( String name){
System.out.println(name + " is an animal.");
return Animal;
}
}

class Tiger extends Animals{
void isDangerous(){
System.out.println("It is a dangerous Animal");

}
}

class Main{
public static void main(String args[]){
Tiger t = new Tiger();
t.isAnimal("Tiger");
t.fourChamberedHeart();
t.isDangerous();
}
}