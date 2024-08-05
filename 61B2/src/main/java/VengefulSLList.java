/*
List that never forgets the deleted items for fun
 */
public class VengefulSLList<Item> extends SLList<Item> {
	SLList<Item> deletedItems;

	public VengefulSLList() {
		//even if don't explicitly call super(), Java will call it for us
		//super();
		deletedItems = new SLList<Item>();
	}

	public VengefulSLList(Item x) {
		//If we don't explicitly call super(x), Java will call the default super() for us
		super(x);
		deletedItems = new SLList<Item>();
	}

	@Override
	public Item removeLast() {
		Item x = super.removeLast();
		deletedItems.addLast(x);
		return x;
	}

	/** Prints deleted items. */
	public void printLostItems() {
		deletedItems.print();
	}
}