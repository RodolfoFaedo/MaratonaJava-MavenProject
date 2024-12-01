package cf.rodolfo.JavaCore.G_Association;

public class PlayerTest02 {
	public static void main(String[] args) {
		Player player01 = new Player("Messi");
		Team team = new Team("Barcelona");
		player01.setTeam(team);
		player01.printInfo();
	}
}
