import java.util.*;
class wordQueries 
{
		static String newString(String s, int k)
		{
		
		String X = "";
		while (s.length() > 0) 
		{
			char temp = s.charAt(0);
			for (int i = 1; i < k && i < s.length(); i++)
			{
				if (s.charAt(i) < temp)
				{
					temp = s.charAt(i);
				}
			}

			X = X + temp;

			for (int i = 0; i < k; i++) 
			{
				if (s.charAt(i) == temp)
				{

					s = s.substring(0, i) + s.substring(i + 1);
					
					break;
				}
			}
		}

		return X;
	}


	public static void main(String[] args)
	{
		String s = "abcdeacbde";
		int k = 3;

		System.out.println(newString(s, k));

	}
}


