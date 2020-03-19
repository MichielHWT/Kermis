public class LadderClimb extends Ride{
	
	public LadderClimb(String rideName, double price, double area){
		super(rideName, price, area);
	}
	
	public void rides(CashRegister cashregister){
		System.out.println("1 " + getRideName() + " ticket");
		System.out.println(getRideName() + " is ready. Are you a winner?! Better place a bet!");
		ticketSold(cashregister);
	}
}