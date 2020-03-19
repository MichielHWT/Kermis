public class LadderClimb extends Ride implements GambleRide{
	
	private double taxableRevenue = 0;
	
	public LadderClimb(String rideName, double price, double area){
		super(rideName, price, area);
	}
	
	public void rides(CashRegister cashregister){
		System.out.println("1 " + getRideName() + " ticket");
		System.out.println(getRideName() + " is ready. Are you a winner?! Better place a bet!");
		ticketSold(cashregister);
	}
	
	@Override
	public void ticketSold(CashRegister cashregister){
		setRevenue(getRevenue() + getPrice());
		setNumberSoldTickets(getNumberSoldTickets() + 1);
		cashregister.increaseTotalRevenue(getPrice());
		cashregister.increaseTotalNumberSoldTickets();	
		taxableRevenue += getPrice();
	}
	
	public double payGamblingTax(){
		//Return gamblingTax and reset taxableRevenue
		double gamblingTax = taxableRevenue*gamblingTaxRate;
		taxableRevenue = 0;
		return gamblingTax;
	}
}