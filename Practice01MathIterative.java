public class Practice01MathIterative implements Practice01Math {

	@Override
	public int fib (int n){
		if (n < 0){
			throw new IllegalArgumentException();
		} 
		while (n < 1) {
			return 1;
		}
		return 1;
	}


	@Override
	public int fact (int n) {
		int returnVal = 1;
		if (n < 0){
			throw new IllegalArgumentException();
		} 
		while (n > 1){
			returnVal = returnVal * n;
			 n = n - 1;
		}
		return returnVal;
	}
}