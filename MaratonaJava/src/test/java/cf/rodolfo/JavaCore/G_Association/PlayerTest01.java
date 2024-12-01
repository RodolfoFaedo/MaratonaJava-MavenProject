package cf.rodolfo.JavaCore.G_Association;

public class PlayerTest01 {
	public static void main(String[] args) {
		Player player1 = new Player("Messi");
		Player player2 = new Player("Cristiano Ronaldo");
		Player player3 = new Player("Fernandão");
		Player[] players = {player1, player2, player3};
		for (Player player : players) {
			player.printInfo();
		}
	}
}
