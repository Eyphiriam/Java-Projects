
public class GasPoweredMower extends WalkBehindMower {
	private Engine engine;
	private boolean selfPropelled;
	
	public GasPoweredMower() {
		super();
		setEngine(engine);
		setSelfPropelled(false);
	}
	
	public GasPoweredMower(Engine engine, boolean selfPropelled) {
		super();
		this.getEngine();
		this.isSelfPropelled();
	}
	
	public GasPoweredMower(String manufacturer, int year, String serialNumber, String type, double cutWidth, double wheelDiameter, Engine engine, boolean selfPropelled) {
		super(manufacturer, year, serialNumber, type, cutWidth, wheelDiameter);
		setEngine(engine);
		setSelfPropelled(selfPropelled);
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public boolean isSelfPropelled() {
		return selfPropelled;
	}

	public void setSelfPropelled(boolean selfPropelled) {
		this.selfPropelled = selfPropelled;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + engine + ", " + selfPropelled; 

	}
}
