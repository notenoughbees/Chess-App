package main;

//https://www.techiedelight.com/implement-pair-class-java/
public class Pair<U, V> {
	public U first;
	public V second;
	
	public Pair(U tempFirst, V tempSecond)
	{
		first = tempFirst;
		second = tempSecond;
	}
	
	
	@Override
	public boolean equals(Object o)
	{
	if(this == o)
	{
		return true;
	}
	
	//if they are not instances of the same class, return false
	if(o == null || getClass() != o.getClass())
	{
		return false;
	}
	
	//cast o to a Pair type
	Pair<?, ?> otherPair = (Pair<?, ?>) o;
	//call the equals() method on each item in the pairs
	if(!first.equals(otherPair.first))
	{
		return false;
	}
	return second.equals(otherPair.second);
	}
	
	
}
