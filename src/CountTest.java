import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class CountTest {
	

	 File filein = new File("input.txt");   	  
	public Count count=new Count(filein);
	
	@Test
	public void testCountcharacter() {
		
		assertEquals(17, count.Countcharacter());
	}

	@Test
	public void testCountline() {
	
		assertEquals(3, count.Countline());
	}

	@Test
	public void testCountword() {
		
		assertEquals(3, count.Countword());
	}

	

}
