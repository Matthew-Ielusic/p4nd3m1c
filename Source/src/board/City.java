package board;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class City implements IImmutableCity {

	private String name;
	private ArrayList<City> adjacencyList = new ArrayList<City>();

	public List<City> getUnmodfiableAdjacencyList() {
		return Collections.unmodifiableList(this.adjacencyList);
	}

	public void addNeighbor(City newNode) {
		if (newNode == null)
		{
			throw new IllegalArgumentException("Argument was null");
		}
		else
		{
			this.adjacencyList.add(newNode);	
			newNode.adjacencyList.add(this);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public List<IImmutableCity> getNeighbors() {
		return Collections.unmodifiableList(this.getUnmodfiableAdjacencyList());
	}

}
