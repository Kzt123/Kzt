import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	GradeBook Gb1;
	GradeBook Gb2;
	@BeforeEach
	void setUp() throws Exception {
		Gb1=new GradeBook(5);
		Gb2=new GradeBook(5);
		Gb1.addScore(52);
		Gb1.addScore(74);
		Gb2.addScore(98);
		Gb2.addScore(47);
	}

	@AfterEach
	void tearDown() throws Exception {
		Gb1=null;
		Gb2=null;
	}

	@Test
	void testAddScore() {
		assertTrue(Gb1.toString().equals("52.0 74.0 "));
		assertTrue(Gb2.toString().equals("98.0 47.0 "));
		
		assertEquals(2, Gb1.getScoreSize());
		assertEquals(2, Gb2.getScoreSize());
		
	}

	@Test
	void testSum() {
		assertEquals(126, Gb1.sum(), .0001);
		assertEquals(145, Gb2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(52, Gb1.minimum(), .001);
		assertEquals(47, Gb2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(74, Gb1.finalScore(), .001);
		assertEquals(98, Gb2.finalScore(), .001);
	}


}
