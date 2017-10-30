import gnu.trove.list.array.TIntArrayList;

public class Hello
{
	private final TIntArrayList list;

	public Hello()
	{
		list = new TIntArrayList();
		list.add( 100 );
	}

	public int get( int i )
	{
		return list.get( i );
	}

	public static void main( String[] args )
	{
		System.out.println("hello");
	}
}
