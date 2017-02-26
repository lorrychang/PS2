package pkgShape;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRectangle {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestArea() {
	
		Rectangle recl = new Rectangle(10,40);
		double dExpectedArea = 400.0;
		double dExpectedPerm = 100.0;
		
		assertEquals(recl.area(),dExpectedArea,0.01);
		
		assertEquals(recl.perimeter(),dExpectedPerm,0.01);
	}

}
