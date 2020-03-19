public class Spin extends Ride{
	
	public Spin(String rideName, double price, double area){
		super(rideName, price, area);
	}
	
	public void rides(CashRegister cashregister){
		System.out.println("1 " + getRideName() + " ticket");
		System.out.println(getRideName() + " is spinning. Let's go! Whooooooop!");
		ticketSold(cashregister);
	}
}