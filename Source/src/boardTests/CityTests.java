package boardTests;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import board.City;
class CityTests {

	private City underTest;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		this.underTest = new City();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNodeGetList() {
		ArrayList<City> adjacencies = this.underTest.getAdjacencies();
		CollectionAssertions.AssertEmpty(adjacencies);
	}
	
	@Test
	void testAddNode() {
		City newNode = new City();
		this.underTest.addNeighbor(newNode);
		Assertions.assertEquals(newNode, this.underTest.getAdjacencies().get(0));
	}
	
	@Test
	void testCannotAddNullNeighbor() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {this.underTest.addNeighbor(null);});
	}

}
