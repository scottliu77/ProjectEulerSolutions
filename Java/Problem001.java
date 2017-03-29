/**
  * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
  *
  * Find the sum of all the multiples of 3 or 5 below 1000.
  */
public class Problem001 {
	public static int calculateSumForMultiplesOfThreeAndFiveLessThan(int number) {
		int sum = 0;
		for(int i = 0; i < number; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String args[]) {
		System.out.println(calculateSumForMultiplesOfThreeAndFiveLessThan(1000));
	}
}