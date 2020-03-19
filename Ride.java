public abstract class Ride{
	private String rideName;
	private double price;
	private double area;
	private double revenue = 0;
	private int numberSoldTickets = 0;
	
	public Ride(String rideName, double price, double area){
		this.rideName = rideName;
		this.price = price;
		this.area = area;
	}
	
	public abstract void rides(CashRegister cashregister);
	
	public String getRideName(){
		return rideName;
	}
	public void setRideName(String rideName){
		this.rideName = rideName;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public double getArea(){
		return area;
	}
	public void setArea(double area){
		this.area = area;
	}
	public double getRevenue(){
		return revenue;
	}
	public int getNumberSoldTickets(){
		return numberSoldTickets;
	}
	
	public void ticketSold(CashRegister cashregister){
		revenue += price;
		++numberSoldTickets;
		cashregister.increaseTotalRevenue(price);
		cashregister.increaseTotalNumberSoldTickets();	
	}
}