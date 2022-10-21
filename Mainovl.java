package pbo;

public class Mainovl {
	public static void main(String[] args){
		// overloadding constructor
		System.out.println("===Overloading constructor===");
		Player player1 = new Player("Alucard");
		Player player2 = new Player();
		Player player3 = new Player();
		Player player4 = new Player("Zilong");

		player1.show();
		player2.show();
		player3.show();
		player4.show();

		//overloading method
		System.out.println("===Overloading method===");
		int a = Matematika.tambah(10, 4);
		System.out.println(a);
		int b = Matematika.tambah(10, 4, 2);
		System.out.println(b);
		double c = Matematika.tambah(10.5, 4.5);
		System.out.println(c);


	}

}
