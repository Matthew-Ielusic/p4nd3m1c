package board;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class City implements IImmutableCity {

	private String name;
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
			newNode.adjacencies.add(this);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public List<IImmutableCity> getAdjacencyList() {
		return Collections.unmodifiableList(this.getAdjacencies());
	}

}
