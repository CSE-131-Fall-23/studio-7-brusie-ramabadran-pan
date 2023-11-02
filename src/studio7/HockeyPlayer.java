package studio7;

public class HockeyPlayer {
	
	private String handedness;
	private int goals;
	private int assists;
	private String name;
	private int jerseynum;
	private int games;
	
	public HockeyPlayer(String ahand, int agoals, int aassists,String aname, int jerz, int agames){
		handedness = ahand;
		goals = agoals;
		assists = aassists;
		name = aname;
		jerseynum = jerz;
		games = agames;
	}
	public String completegame(int go, int assist) {
		return "Goals" + go + "Scored" + "and Assists" + assist + "Scored";
		
	}
	public int totalStats() {
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
