import java.util.List;
import java.util.*;

import org.junit.*;

public class itTester {
	@Test
	public void myTest(){
		IterativeMultiplier iM = new IterativeMultiplier();
		List<List<Integer>> mat1 = new ArrayList<List<Integer>>();
		mat1.add(new ArrayList<Integer>(){{add(1);add(1);}});
		mat1.add(new ArrayList<Integer>(){{add(2);add(2);}});
		

		List<List<Integer>> mat2 = new ArrayList<List<Integer>>();
		mat2.add(new ArrayList<Integer>(){{add(2);add(2);}});
		mat2.add(new ArrayList<Integer>(){{add(3);add(3);}});
		
		List<List<Integer>> mat3 = new ArrayList<List<Integer>>();
		mat3.add(new ArrayList<Integer>(){{add(5);add(5);}});
		mat3.add(new ArrayList<Integer>(){{add(10);add(10);}});
		
		List<List<Integer>> mat3 = new ArrayList<List<Integer>>();
		mat3.add(new ArrayList<Integer>(){{add(5);add(5);}});
		mat3.add(new ArrayList<Integer>(){{add(10);add(10);}});
		
		assertEquals(mat3, iM.multiply(mat1, mat2));
	}
}
