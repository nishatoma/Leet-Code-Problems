
public class NumberComplement
{
	public static int findComplement(int n)
	{
		StringBuilder sb = new StringBuilder();
		if (n >= 0)
		{
			String bin = Integer.toBinaryString(n);
			for (int i = 0; i < bin.length(); i++)
			{
				if (bin.charAt(i) == '0')
				{
					sb.append('1');
				} else if (bin.charAt(i) == '1')
				{
					sb.append('0');
				}
			}
			bin = sb.toString();
			return Integer.parseInt(bin, 2);
		}
		return -1;
	}
}
