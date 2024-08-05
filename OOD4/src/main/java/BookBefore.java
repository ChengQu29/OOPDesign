public class BookBefore implements IBookPredicate {

	private int year;

	public BookBefore(int year) {
		this.year = year;
	}

	@Override
	public boolean test(Book b) {
		return b.getYear() < year;
	}

}
