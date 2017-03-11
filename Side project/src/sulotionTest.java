import static org.junit.Assert.*;
import org.junit.runner.Result;
import org.junit.Test;
import org.junit.runner.notification.Failure;
public class solutionTest {
		  
	@Test
	public final void testIsPrime() {
		Solution sol = new Solution();
		assert sol.isPrime(16) == false;
		assert sol.isPrime(1) == true;
		assert sol.isPrime(16) == false;
		assert sol.isPrime(40) == false;
		assert sol.isPrime(600) == false;
		assert sol.isPrime(15000) == false;
		assert sol.isPrime(23680) == false;
		assert sol.isPrime(1) == true;
		assert sol.isPrime(17) == true;
		assert sol.isPrime(59) == true;
		
		
	}

}
