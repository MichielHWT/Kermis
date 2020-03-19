public class TaxInspector{
	private double randomNumber;
	
	public void visitKermis(Ride[] arrayOfRides, CashRegister cashregister){
		randomNumber = (Math.random()*15);
		if ((int)randomNumber == 14){
			System.out.println("The tax inspector visits the fair.");
			for (Ride ride : arrayOfRides){
//			for (int i = 0; i < arrayOfRides.length; ++i){
				//Get amount of taxes that has to be paid
				//Take taxes from cashregister
				if (ride instanceof GambleRide){
//				if (arrayOfRides[i] instanceof GambleRide){
					Class rideClass = ride.getClass();
					System.out.println(rideClass.getName());
					System.out.println("The tax inspector wants to collect the taxes over the revenue of " + ride.getRideName());					
					double gamblingTax = ((GambleRide)ride).payGamblingTax();
//					System.out.println("The tax inspector wants to collect the taxes over the revenue of " + arrayOfRides[i].getRideName
//					double gamblingTax = arrayOfRides[i].payGamblingTax();
					cashregister.takeGamblingTax(gamblingTax);
					System.out.println(gamblingTax + " euros of taxes were taken from the cash register.");
				}	
			}
		}
	}
}