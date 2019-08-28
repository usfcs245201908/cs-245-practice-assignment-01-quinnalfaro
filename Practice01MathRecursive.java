public class Practice01MathRecursive implements Practice01Math {

	@Override
	public int fib (int n){
		if (n < 0){
			throw new IllegalArgumentException();
		} else if (n <= 1) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}


	@Override
	public int fact (int n) {
		if (n < 0){
			throw new IllegalArgumentException();
		} else if (n == 1) {
			return n;
		}
		return fib(n - 1) * fib(n - 2);
	}
}
// for (int coll = 0; col < n; col ++)