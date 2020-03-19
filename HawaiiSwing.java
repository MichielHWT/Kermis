public class HawaiiSwing extends Ride{
	
	public HawaiiSwing(String rideName, double price, double area){
		super(rideName, price, area);
	}
	
	public void rides(CashRegister cashregister){
		System.out.println("1 " + getRideName() + " ticket");
		System.out.println(getRideName() + " is swinging. Attentiooooooon!!! HOOOOOOOOONK!");
		ticketSold(cashregister);
	}
}