/**
 * This class represents an element node in the list adt implementation.
 */
public class BookListADTElementNode implements BookListADTNode {
	private Book book;
	private BookListADTNode rest;

	public BookListADTElementNode(Book p, BookListADTNode rest) {
		this.book = p;
		this.rest = rest;
	}

	@Override
	public int count() { return 1+this.rest.count();}

	@Override
	public BookListADTNode addFront(Book book) {
		return new BookListADTElementNode(book,this);
	}

	/*
	Why must this.rest mutate in BookListADTElementNode? Consider that before adding, this.rest may be an BookListADTEmptyNode object.
	After adding, it will change to a BookListADTElementNode object as returned by the addBack method of the BookListADTEmptyNode class.
	This is also the reason this.head of BookListADTImpl must also mutate.
	 */
	@Override
	public BookListADTNode addBack(Book book) {
		this.rest = this.rest.addBack(book);
		return this;
	}

	/*
	Notice the critical line this.rest = this.rest.add(index - 1, book);.
	When index is 1 it will advance to the rest list which will add the book and return the updated list.
	Although the line looks confusing as it has recursion and mutation on it,
	expressing it in plain language helps us understand what it is actually accomplishing
	(add an element to the rest of the list, and let the result be the new rest of the list).
	 */
	@Override
	public BookListADTNode add(int index,Book book) {
		if (index==0) {
			return addFront(book);
		}
		else {
			this.rest = this.rest.add(index-1,book);
			return this;
		}
	}

	@Override
	public BookListADTNode remove(Book book) {
		if (this.book.equals(book)) {
			return this.rest;
		}
		else {
			this.rest = this.rest.remove(book);
			return this;
		}
	}

	@Override
	public Book get(int index) throws IllegalArgumentException{
		if (index==0) return this.book;
		return this.rest.get(index-1);
	}

	@Override
	public String toString() {
		return "("+this.book.toString()+")"+this.rest.toString();
	}
}