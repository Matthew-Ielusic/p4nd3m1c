package boardTests;

import org.junit.jupiter.api.Assertions;

import java.util.Collection;



public class CollectionAssertions {

	public static <E> void assertNonEmpty(Collection<E> underTest)
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
	
	public static <E> void assertEmpty(Collection<E> underTest)
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
	
	public static <E> void assertContains(Collection<E> underTest, E expected)
	{
		if (underTest == null)
		{
			Assertions.fail("The collection was null");
		}	
		else if (!underTest.contains(expected))
		{
			Assertions.fail("The collection was did not contain the expected item");
		}
	}
}
