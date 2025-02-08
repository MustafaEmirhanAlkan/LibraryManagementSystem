public class Archive {
	String bookName;
	double exchangeTime;
	public Archive(String bookName, double exchangeTime) {
		this.bookName = bookName;
		this.exchangeTime = exchangeTime;
	}
	public String getCompanyName() {
		return bookName;
	}
	public double getExchangePrice() {
		return exchangeTime;
	}
	public void setCompanyName(String companyName) {
		this.bookName = bookName;
	}
	public void setExchangePrice(double exchangePrice) {
		this.exchangeTime = exchangeTime;
	}
}
