/**
 * This class represents a book. A book has a title, an author, a year
 * of publication and a price
 */
public class Book {
	private String title;
	private String author;
	private int year;
	private float price;


	public Book(String title, String author, int year, float price) {
		this.title=title;
		this.author=author;
		this.year=year;
		this.price=price;
	}


	public String getTitle() {
		return this.title;
	}


	public String getAuthor() {
		return this.author;
	}

	public float getPrice() {
		return this.price;
	}

	public int getYear() {
		return this.year;
	}

	public String toString() {
		return String.format("Title: %s Author: %s Year: %d Price: %.2f",
				this.title, this.author, this.year, this.price);
	}

	public boolean before(int year) {
		return this.year < year;
	}

	public boolean cheaperThan(Book book) {
		return this.price < book.getPrice();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof Book)) {
			return false;
		}
		Book other = (Book) o;
		return this.title.equals(other.getTitle())
				&& (this.year == other.getYear());
	}
}