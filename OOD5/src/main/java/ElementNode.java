public class ElementNode implements ListNode {
	private Book data;
	private ListNode rest;

	public ElementNode(Book data, ListNode rest) {
		this.data = data;
		this.rest = rest;
	}

	public Book getBook() { return this.data;}
	public ListNode getRest() {return this.rest;}
}