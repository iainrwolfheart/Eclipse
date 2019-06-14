package Nationwide.Barren_Moor;

public class PlayerMove {

	int pns;
	int pwe;
	
	public PlayerMove() {
		pns = 11;
		pwe = 11;
	}
	public void NorthSouth(String M) {
		String mv = M;
		
		if(mv="north") {
			pns++;
		}
		if(mv="south") {
			pns--;
		}
	}	
	public void EastWest(String M) {
		if(mv="east") {
			pwe++;
		}
		if(mv="west") {
			pwe--;
		}
	}
}
