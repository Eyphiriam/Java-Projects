
public class PushReelMower extends WalkBehindMower {
	private int numWheels;
	
	public PushReelMower() {
		super();
		setNumWheels(0);
	}

	public PushReelMower(int numWheels) {
		super();
		this.getNumWheels();
	}
	
	public PushReelMower(String manufactuerer, int year, String serialNumber, String type, double cutWidth, double wheelDiameter, int numWheels) {
		super(manufactuerer, year, serialNumber, type, cutWidth, wheelDiameter);
		setNumWheels(numWheels);
	}
	public int getNumWheels() {
		return numWheels;
	}


	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	


	@Override
	public String toString() {
		return super.toString() + ", " + numWheels;
	}
}
