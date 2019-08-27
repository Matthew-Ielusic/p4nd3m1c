package board;

import java.util.ArrayList;

public class City {

	private ArrayList<City> adjacencies = new ArrayList<City>();

	public ArrayList<City> getAdjacencies() {
		return adjacencies;
	}

	public void addNeighbor(City newNode) {
		if (newNode == null)
		{
			throw new IllegalArgumentException("Argument was null");
		}
		else
		{
			this.adjacencies.add(newNode);	
		}
	}
}
