package editeur.model.geometry.memento;

public class MementoRectangle extends MementoShape {
	private int roundHeight, roundWidth;
	
	public MementoRectangle(int roundHeight, int roundWidth) {
		this.roundHeight  = roundHeight;
		this.roundWidth   = roundWidth;
	}


	public int getRoundHeight() {
		return roundHeight;
	}

	public int getRoundWidth() {
		return roundWidth;
	}
	
	
	
}
