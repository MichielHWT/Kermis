public class BumperCars extends Ride{
	
	public BumperCars(String rideName, double price, double area){
		super(rideName, price, area);
	}
	
	public void rides(CashRegister cashregister){
		System.out.println("1 " + getRideName() + " ticket");
		System.out.println(getRideName() + " is ready to start. Three. Two. One...Fire!");
		ticketSold(cashregister);
	}
}