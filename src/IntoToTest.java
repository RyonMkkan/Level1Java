import static org.junit.Assert.*;

import org.junit.Test;

public class IntoToTest {

	@Test
	public void test() {
		// assertEquals(4,add(2,2));
		// assertEquals(20,add(5,15));
		// assertEquals(-3,add(-5,2));
		// assertEquals(25,squareNum(5));
		assertEquals(10, absoluteValue(-10));
		assertEquals(3, absoluteValue(3));
	}

	// int add(int x,int y){
	// return x + y;
	// int squareNum(int s){
	// return s*s;
	int absoluteValue(int val){
	if (val>=0) {
		return val;
	}else{
	val=val*-1;
			return val;
	}
	}
	
	}

//}
