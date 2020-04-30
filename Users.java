class Netflix{
	void movies(){
	System.out.println("The Forest Gump-The Shawshank Redemption-Iron Man");
	}

	void selectMovie(String Name){
	System.out.println("Movie selected is "+Name);
	}

	String subscription(){
	return "14.99";
	}

	String pay(double price){
	return "Started subscription at: $"+price;
	}
}

class Users{
	public static void main(String args[]){
	Netflix usa = new Netflix();
	usa.movies();
	usa.selectMovie("Iron Man");
	System.out.println(usa.subscription());
	System.out.println(usa.pay(14.99));
	}
}