
public class Penalty extends Archive{
	public String bookName;
	double exchangeTime;
	public Penalty(String bookName, double exchangeTime) {
		super(bookName, exchangeTime);
	}
	public double totalPrice(int amount) {
		return (7 - exchangeTime) - exchangeTime;
	}
}