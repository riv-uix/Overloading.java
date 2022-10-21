package pbo;

class Player {
	private String name;
	private static int jumlahPlayer;

	//overloading constructor
	public Player(String name) {
		this.name = name;
		Player.jumlahPlayer++;
	}
	Player() {
		Player.jumlahPlayer++;
		this.name = "Player" + Player.jumlahPlayer;
	}
	void show() {
		System.out.println("Player name: " + this.name);
	}
}
