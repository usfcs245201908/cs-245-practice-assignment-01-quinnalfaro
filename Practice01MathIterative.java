public class Practice01MathIterative implements Practice01Math {

	@Override
	public int fib (int n){
		if (n < 0){
			throw new IllegalArgumentException();
		} else if (n <= 1){
			return n;
		} 
		
		int returnVal = 1;
		int previous = 1;

		for(int i = 2; i < n; i++) {
			int temp = returnVal;
			returnVal += previous;
			previous = temp;
		}

		return returnVal;


	}


	@Override
	public int fact (int n) {
		if (n <= 0){
			throw new IllegalArgumentException();
		} 

		int returnVal = 1;
		int i = 1;

		while(i <= n){
			returnVal = returnVal * i;
			i++;
		}
		
		return returnVal;
	}
}