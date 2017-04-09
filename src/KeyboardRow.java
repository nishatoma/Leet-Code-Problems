import java.util.stream.Stream;



public class KeyboardRow
{
	public static void main(String[] args)
	{
		String[] words = {"Hello", "Alaska", "Dad", "Peace"};
		String[] new1 = findWords(words); 
		System.out.println(new1);
	}
	public static String[] findWords(String[] words)
	{
		return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
	}
}
