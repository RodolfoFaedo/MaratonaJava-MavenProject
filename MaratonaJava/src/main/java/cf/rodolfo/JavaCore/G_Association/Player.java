package cf.rodolfo.JavaCore.G_Association;

public class Player {
	private String name;
	private Team team;

	public void printInfo() {
		System.out.printf("Player's name: %s%n", this.name);
		if(team != null) {
			System.out.printf("Team's name: %s%n", team.getName());
		}
	}

	public Player(String name) {
		this.name = name;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
