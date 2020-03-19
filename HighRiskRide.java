import java.util.Scanner;

public abstract class HighRiskRide extends Ride{
	private int limitOfRides;
	private boolean needForMaintenance = false;
	
	public HighRiskRide(String rideName, double price, double area){
		super(rideName, price, area);
	}
	
	public void setLimitOfRides(int limitOfRides){
		this.limitOfRides = limitOfRides;
	}
	
	public void rideMaintenance() throws RuntimeException{
		if((getNumberSoldTickets() % limitOfRides) == 0){
			//The ride needs maintenance construction
			needForMaintenance = true;
		}
		
		if(needForMaintenance == true){
			try{
				throw new RuntimeException(getRideName() + " in need for maintenance construction. Send an engineer immediately!");
			}
			catch(RuntimeException e){
				System.out.println("Send an engineer by pressing 'm'");
				Scanner textInput = new Scanner(System.in);
				String textInputString = textInput.nextLine();
				if (textInput.equals("m")){
					needForMaintenance = false;
					System.out.println(getRideName() + " is fixed and can run again.");
				}
			}
			/*
			System.out.println("Send engineer by pressing 'm'");
			Scanner textInput = new Scanner(System.in);
			String textInputString = textInput.nextLine();
			if (textInput.equals("m")){
				needForMaintenance = false;
				System.out.println(getRideName() + " is fixed and can run again.");
			}
			*/
		}
	}
}