
public class CommercialMower extends LawnTractor{
	private double operatingHours;
	private boolean zeroTurnRadius;
	
	
	public CommercialMower() {
		super();
		setOperatingHours(0.0);
		setZeroTurnRadius(false);
	}
	
	public CommercialMower(double operatingHours, boolean zeroTurnRadius) {
		super();
		this.getOperatingHours();
		this.isZeroTurnRadius();
		
	}
	
	public CommercialMower(String manufacturer, int year, String serialNumber, String type, Engine engine, String model, double deckWidth, double operatingHours, boolean zeroTurnRadius) {
		super(manufacturer, year, serialNumber, type, engine, model, deckWidth);
		setOperatingHours(operatingHours);
		setZeroTurnRadius(zeroTurnRadius);
	}

	public double getOperatingHours() {
		return operatingHours;
	}

	public void setOperatingHours(double operatingHours) {
		this.operatingHours = operatingHours;
	}

	public boolean isZeroTurnRadius() {
		return zeroTurnRadius;
	}

	public void setZeroTurnRadius(boolean zeroTurnRadius) {
		this.zeroTurnRadius = zeroTurnRadius;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + operatingHours + ", " + zeroTurnRadius;
	}

}
