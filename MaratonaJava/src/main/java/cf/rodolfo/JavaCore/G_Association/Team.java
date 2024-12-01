package cf.rodolfo.JavaCore.G_Association;

public class Team {
	private String name;
	private Player[] players;

	public Team(String name) {
		this.name = name;
	}

	public Team(String name, Player[] players) {
		this.name = name;
		this.players = players;
	}
	
	public void printInfo() {
		System.out.printf("Team's name: %s%n", this.name);
		if(players != null) {
			for (Player player : players) {
				System.out.printf("Player's name: %s%n", player.getName());
			}
		}
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
