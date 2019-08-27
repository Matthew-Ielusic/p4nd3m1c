package boardTests;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import board.City;
import board.IImmutableCity;
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
	void testName() {
		String expected = "Example";
		this.underTest.setName(expected);
		Assertions.assertEquals(expected, this.underTest.getName());
	}

	@Test
	void testNodeGetList() {
		List<City> adjacencies = this.underTest.getUnmodfiableAdjacencyList();
		CollectionAssertions.assertEmpty(adjacencies);
	}
	
	@Test
	void testAddNode() {
		City newNode = new City();
		this.underTest.addNeighbor(newNode);
		Assertions.assertEquals(newNode, this.underTest.getUnmodfiableAdjacencyList().get(0));
	}
	
	@Test
	void testNeighborsMutuallyAdjacent() {
		City newNode = new City();
		this.underTest.addNeighbor(newNode);
		
		CollectionAssertions.assertContains(this.underTest.getUnmodfiableAdjacencyList(), newNode);
		CollectionAssertions.assertContains(newNode.getUnmodfiableAdjacencyList(), this.underTest);
	}
	
	@Test
	void testUnmodifiableListImpl() {
		IImmutableCity immutable = this.underTest;
		Assertions.assertThrows(UnsupportedOperationException.class, () -> {immutable.getNeighbors().add(null);});
	}
	
	@Test
	void testCannotAddNullNeighbor() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {this.underTest.addNeighbor(null);});
	}

}
