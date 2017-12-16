package org.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

public class MathsTest {
private static final double a = 6;
private static final double b = 6;
private Maths math;

@Before
public void setup() {
	math = new Maths();
}
	
	@Test
	public void shouldAdd() {
		
		double result =  math.add(a,b);
		int res = (int) result; 
		
		assertEquals(12, res);
	}

	

}
