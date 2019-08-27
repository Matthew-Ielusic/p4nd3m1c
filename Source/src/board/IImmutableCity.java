package board;

import java.util.List;

public interface IImmutableCity {
	public List<IImmutableCity> getNeighbors();
	public String getName();
}
