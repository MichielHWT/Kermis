public class GhostTrain extends Ride{
	
	public GhostTrain(String rideName, double price, double area){
		super(rideName, price, area);
	}
	
	public void rides(CashRegister cashregister){
		System.out.println("1 " + getRideName() + " ticket");
		System.out.println(getRideName() + " is ready. Shocker!!!");
		ticketSold(cashregister);
	}
}