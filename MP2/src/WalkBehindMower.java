
public abstract class WalkBehindMower extends Mower {
	private double cutWidth;
	private double wheelDiameter;
	
	
	public WalkBehindMower() {
		super();
		setCutWidth(0.0);
		setWheelDiameter(0.0);
	}
	
	public WalkBehindMower(double cutWidth, double wheelDiameter) {
		super();
		this.getCutWidth();
		this.getWheelDiameter();
	}
	
	public WalkBehindMower(String manufacturer, int year, String serialNumber, String type, double cutWidth, double wheelDiameter) {
		super(manufacturer, year, serialNumber, type);
		setCutWidth(cutWidth);
		setWheelDiameter(wheelDiameter);
	}

	public double getCutWidth() {
		return cutWidth;
	}

	public void setCutWidth(double cutWidth) {
		this.cutWidth = cutWidth;
	}

	public double getWheelDiameter() {
		return wheelDiameter;
	}

	public void setWheelDiameter(double wheelDiameter) {
		this.wheelDiameter = wheelDiameter;
	}


	@Override
	public String toString() {
		return super.toString() + ", " + cutWidth + ", " + wheelDiameter;
	}
	

}
