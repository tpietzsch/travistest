import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest
{
	@Test
	public void testGet()
	{
		assertEquals( new Hello().get( 0 ), 101 );
	}
}
