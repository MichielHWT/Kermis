public class HallOfMirrors extends Ride{
	
	public HallOfMirrors(String rideName, double price, double area){
		super(rideName, price, area);
	}
	
	public void rides(CashRegister cashregister){
		System.out.println("1 " + getRideName() + " ticket");
		System.out.println(getRideName() + " is ready. Enter if you dare!");
		ticketSold(cashregister);
	}
}