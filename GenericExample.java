class DrinkingAge<T>{
void age(T x){
System.out.println(x);
}
}

class GenericExample{
public static void main(String args[]){
DrinkingAge<Integer> i = new DrinkingAge<Integer>();
i.age(new Integer(21));
DrinkingAge<String> s = new DrinkingAge<String>();
s.age("I am 21");
}
}