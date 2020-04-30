class Cars{
void types(){
System.out.println("Bentley Ferrari Mercedes");
}

void selectCars(String name){
System.out.println("Car selected is "+name);
}

void selectCars(String name, String name1){
System.out.println("Car selected is "+name+" and "+name1);
}

void selectCars(){
System.out.println("Car not Selected");
}

}

class CarUsers{
public static void main(String args[]){
Cars John = new Cars();
John.types();
John.selectCars();
John.selectCars("Bentley", "Ferrari");
John.selectCars("Mercedes");

}

}
