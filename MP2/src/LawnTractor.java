
public class LawnTractor extends Mower {
	private Engine engine;
	private String model;
	private double deckWidth;
	
	public LawnTractor() {
		setEngine(engine);
		setModel("");
		setDeckWidth(0.0);
	}
	public LawnTractor(Engine engine, String model, double deckWidth) {
	super();
	this.getEngine();
	this.getModel();
	this.getDeckWidth();
	
	}
	
	public LawnTractor(String manufacturer, int year, String serialNumber, String type, Engine engine, String model, double deckWidth) {
		super(manufacturer, year, serialNumber, type);
		setEngine(engine);
		setModel(model);
		setDeckWidth(deckWidth);
	}
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getDeckWidth() {
		return deckWidth;
	}
	public void setDeckWidth(double deckWidth) {
		this.deckWidth = deckWidth;
	}
	public String toString() {
		return super.toString() + ", " + engine + ", " + model + ", " + deckWidth;
	}
}