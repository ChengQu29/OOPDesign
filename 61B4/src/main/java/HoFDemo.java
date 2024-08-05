
// see python version: Hof.py

/*
Old school java(Java 7 and earlier)
Fundamental issue: Memory boxes(variables) cannot contain pointers to functions
 */
public class HoFDemo {

	public static int do_twice(IntUnaryFunction f, int x) {

		// similar to f(f(x)) in python
		return f.apply(f.apply(x));
	}

	public static void main(String[] args) {
		int x =2;
		IntUnaryFunction tenX = new TenX();
		//System.out.println(do_twice(TenX,2)); // do_twice is expecting a instantiated object
		System.out.println(do_twice(tenX,2));
	}
}
