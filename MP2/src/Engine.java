
public class Engine {
	private String manufacturer;
	private Double horsePower;
	private int cylinders;
	
	public Engine() {
		setManufacturer("");
		setHorsePower(0.0);
		setCylinders(0);
		
	}

	public Engine(String manufacturer, Double horsePower, int cylinders) {
		setManufacturer(manufacturer);
		setHorsePower(horsePower);
		setCylinders(cylinders);
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Double getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(Double horsePower) {
		this.horsePower = horsePower;
	}

	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	public String toString() {
		return  manufacturer + ", "  + horsePower + ", " + cylinders;
	}
}
