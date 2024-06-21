import java.io.FileInputStream;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MowerWareHouse {
	private String storeName;
	private ArrayList<Mower>mowers;

	public MowerWareHouse() {
		setStoreName("");
		mowers = new ArrayList<Mower>();	

		
	}
	
	public MowerWareHouse(String storeName, ArrayList<Mower> mowers) {
		this.getStoreName();
		this.mowers = mowers;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}


	public void setMowers(ArrayList<Mower> mowers) {
		this.mowers = mowers;
	}
	
	public void readMowerData(String inputFileName) throws FileNotFoundException {
		ArrayList<Mower> mowers = new ArrayList<>();
		for(int i =0; i< this.mowers.size(); i++) {
			if(this.mowers.get(i).getType().equalsIgnoreCase(inputFileName)) {
				System.out.println(this.mowers.get(i).toString());
			}
		}
	}
	
	public ArrayList<Mower> getMowers() {
		return mowers;
	}

	public void saveMowerData(String outputFileName) throws FileNotFoundException {
		FileInputStream file = new FileInputStream(outputFileName);
		Scanner scn = new Scanner(file);
		String storeName = scn.nextLine();
		ArrayList<Mower> mowers = new ArrayList<>();
		while(scn.hasNextLine()) {
			String manufacturer = scn.nextLine();
			int year = Integer.parseInt(scn.nextLine());
			String serialNumber = scn.nextLine();
			String choice = scn.nextLine();
			if(choice.equals("L")) {
				String e_manufacturer = scn.nextLine();
				double e_horsePower = Double.parseDouble(scn.nextLine());
				int e_cylinders = Integer.parseInt(scn.nextLine());
				Engine l_engine = new Engine(e_manufacturer, e_horsePower, e_cylinders);
				String l_model = scn.nextLine();
				double l_deckWidth = Double.parseDouble(scn.nextLine());
				Mower nextMower = new LawnTractor(manufacturer, year, serialNumber, choice, l_engine, l_model, l_deckWidth);
				this.mowers.add(nextMower);
			}
			else if(choice.equals("C")) {
				String e_manufacturer = scn.nextLine();
				double e_horsePower = Double.parseDouble(scn.nextLine());
				int e_cylinders = Integer.parseInt(scn.nextLine());
				Engine e_engine = new Engine(e_manufacturer, e_horsePower, e_cylinders);
				String l_model = scn.nextLine();
				double l_deckWidth = Double.parseDouble(scn.nextLine());
				double c_operatingHours = Double.parseDouble(scn.nextLine());
				boolean c_zeroTurnRadius = Boolean.parseBoolean(scn.nextLine());
				Mower nextMower = new CommercialMower(manufacturer, year, serialNumber, choice, e_engine, l_model, l_deckWidth, c_operatingHours, c_zeroTurnRadius);
				this.mowers.add(nextMower);
			}
			else if(choice.equals("G")) {
				double w_cutWidth = Double.parseDouble(scn.nextLine());
				double w_wheelDiameter = Double.parseDouble(scn.nextLine());
				String e_manufacturer = scn.nextLine();
				double e_horsePower = Double.parseDouble(scn.nextLine());
				int e_cylinders = Integer.parseInt(scn.nextLine());
				Engine e_engine = new Engine(e_manufacturer, e_horsePower, e_cylinders);
				boolean g_selfPropelled = Boolean.parseBoolean(scn.nextLine());
				Mower nextMower = new GasPoweredMower(manufacturer, year, serialNumber, choice, w_cutWidth, w_wheelDiameter, e_engine, g_selfPropelled);
				this.mowers.add(nextMower);
				}
			else if(choice.equals("P")) {
				double w_cutWidth = Double.parseDouble(scn.nextLine());
				double w_wheelDiameter = Double.parseDouble(scn.nextLine());
				int p_numWheels = Integer.parseInt(scn.nextLine());
				Mower nextMower = new PushReelMower(manufacturer, year, serialNumber, choice, w_cutWidth, w_wheelDiameter, p_numWheels);
				this.mowers.add(nextMower);
			}
			setStoreName(storeName);
			setMowers(this.mowers);
			}
		
	}

	public String toString() {
		return "MowerWareHouse [storeName=" + storeName + ", mowers=" + mowers + "]";
	}
	
	

}
