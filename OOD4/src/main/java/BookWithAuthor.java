public class BookWithAuthor implements IBookPredicate {

	private String authorName;

	public BookWithAuthor(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public boolean test(Book b) {
		return b.getAuthor().contains(authorName);
	}
}
