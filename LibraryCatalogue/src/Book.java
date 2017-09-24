/*
 * This Class contains book properties
 */

public class Book {

	String title;
	int pageCount;
	int ISBN;
	boolean isCheckedOut;// whether or not it is checkout
	int dayCheckedOut = -1;

	public Book(String bookTitle, int bookPageCount, int BookISBN) {
		this.title = bookTitle;
		this.pageCount = bookPageCount;
		this.ISBN = BookISBN;
		isCheckedOut = false;
	}
	//Getters --> Instance Method
	public String getTitle() {
		return this.title;
	}

	public int getpageCount() {
		return this.pageCount;
	}

	public int getISBN() {
		return this.ISBN;
	}
	
	public boolean getIsCheckedOut() {
		return this.isCheckedOut;
	}
	
	public int getDayCheckedOut() {
		return this.dayCheckedOut;
	}
	
	
	//SETTERS
	
	public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut) {
		this.isCheckedOut = newIsCheckedOut;
		setDayCheckedOut(currentDayCheckedOut);
	}
	
	private void setDayCheckedOut(int day) {
		this.dayCheckedOut = day;
	}
	
}
