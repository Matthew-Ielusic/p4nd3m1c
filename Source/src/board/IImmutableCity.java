package board;

import java.util.List;

public interface IImmutableCity {
	public List<IImmutableCity> getAdjacencyList();
	public String getName();
}
