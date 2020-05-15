class Iphone{
	static class Apps{
		void faceTime(){
		System.out.println("Facetime is a new app in an iPhone (Instance Method)");
		}
		
		static void iMessage(){
		System.out.println("iMessage is an app (Static Method)");
		}
        }
}

class Staticclass{
public static void main(String args[]){
Iphone x = new Iphone();
Iphone.Apps a = new Iphone.Apps();
a.faceTime();
Iphone.Apps.iMessage();
}
}