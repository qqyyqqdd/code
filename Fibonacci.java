import java.math.BigDecimal;

public class Fibonacci {
	public static void main(String[] args) {
		for (int i = 1; i <= 200 ; i++){
			System.out.println("F["+i+"] = "+ of(i));
		}
	}

	public static BigDecimal of(int num) {
		if(num == 1 || num == 2){
			return new BigDecimal(1);
		}
		return of(num-1).add(of(num-2));
	}
}