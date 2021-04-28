import java.util.Scanner;
public class FruitDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int x = 7;
		int y = 10;
		x=y;
		y=y+1;
		
		Fruit apple = new Fruit();
			apple.name = "Apple";
			apple.color = "Green";
			apple.numberOfPieces = 2;
			
		Fruit mango = new Fruit();
			mango.name = "Mango";
			mango.color = "Yellow";
			mango.numberOfPieces = 4;
			
			mango = apple;
			mango.name ="Mango";
			System.out.println("Name: " + apple.name);
			System.out.println("Color: " + apple.color);
			System.out.println("Number of pieces: " + apple.numberOfPieces);
			mango = null;
			
			
		Fruit kiwi = new Fruit();
		kiwi.name = "Kiwi";
		kiwi.color = "Brown";
		kiwi.numberOfPieces = 2;
		System.out.println("Name:" + kiwi.name);
		System.out.println("Color:" + kiwi.color);
		System.out.println("number Of Pieces: " + kiwi.numberOfPieces);

	}

}
