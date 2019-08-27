package boardTests;

import org.junit.jupiter.api.Assertions;

import java.util.Collection;



public class CollectionAssertions {

	public static <E> void AssertNonEmpty(Collection<E> underTest)
	{
		if (underTest == null)
		{
			Assertions.fail("The collection was null");
		}
		else if (underTest.isEmpty())
		{
			Assertions.fail("The collection was empty");
		}
	}
	
	public static <E> void AssertEmpty(Collection<E> underTest)
	{
		if (underTest == null)
		{
			Assertions.fail("The collection was null");
		}
		else if (!underTest.isEmpty())
		{
			Assertions.fail("The collection was not empty");
		}
	}
}
