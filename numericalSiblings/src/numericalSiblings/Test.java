package numericalSiblings;

import org.junit.Assert;

class Test {

	private Solution solution;
	
	@org.junit.jupiter.api.Test
	void test() {
		solution.largestNumber(1983);
		Assert.assertEquals(9831, solution.largestNumber(1983));
		Assert.assertEquals(553, solution.largestNumber(553));
		Assert.assertEquals(553, solution.largestNumber(355));
		System.out.println(solution.largestNumber(1983));
	}

}
