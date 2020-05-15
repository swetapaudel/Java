interface Electronics{
void charger();
void cost();
}

abstract class Phone implements Electronics{
void touchScreen(){
System.out.println("Almost all phones have touch screen feature.");
}
}

abstract class Laptop implements Electronics{
void processor(){
System.out.println("Almost every laptop has 62 bit processor.");
}
}

class Iphone extends Phone{
public void charger(){
System.out.println("iPhone Chargers are durable.");
}

public void cost(){
System.out.println("iPhone cost around $1100.");
}
}

class Samsung extends Phone{
public void charger(){
System.out.println("Samsung chargers are durable.");
}

public void cost(){
System.out.println("Samsung costs around $1000.");
}
}

class MacBook extends Laptop{
public void charger(){
System.out.println("MacBook charger is not very long.");
}

public void cost(){
System.out.println("MacBook costs around $1500.");
}
}

class Lenovo extends Laptop{
public void charger(){
System.out.println("Lenovo charger is quite long.");
}

public void cost(){
System.out.println("Lenovo costs around $900.");
}
}

class Interface{
public static void main(String args[]){
Phone a = new Iphone();
a.touchScreen();
a.charger();
a.cost();
a = new Samsung();
a.touchScreen();
a.charger();
a.cost();
Laptop b = new MacBook();
b.processor();
b.charger();
b.cost();
b = new Lenovo();
b.processor();
b.charger();
b.cost();
}
}