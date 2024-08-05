public class Dog {

	public void bark() {
		System.out.println("bark");
	}

	public void barkMany(int N) {
		for (int i = 0; i < N; i += 1) {
			bark();
		}
	}

	// If using the following code, will cause error in the implementation of this class
//	public void bark() {
//		barkMany(1);
//	}
//
//	public void barkMany(int N) {
//		for (int i = 0; i < N; i += 1) {
//			System.out.println("bark");
//		}
//	}

}
