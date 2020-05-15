class Iphone{
	void cost(){
	System.out.println("iPhone costs $1100");
	}
	class Apps{
		void appleMaps(){
		System.out.println("Apple Map is a default app in an iPhone");
		}
	}
}

class Innerclass{
public static void main(String args[]){
Iphone x = new Iphone();
x.cost();
Iphone.Apps amaps = x.new Apps();
amaps.appleMaps();

}
}