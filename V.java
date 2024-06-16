import java.util.*;
class V
{
	public static void main(String[] arg) 
	{
		String s="hibroooo";
		char[] c=s.toCharArray();
		
		HashMap<Character,Integer> m=new HashMap<>();
		
		for(char i:c)
		{
			if(m.containsKey(i))
				m.put(i,m.get(i)+1);
			else
				m.put(i,1);
			
		}
		for(Map.Entry<Character,Integer> data:m.entrySet())
		{
			if(data.getValue()==1)
			{
				System.out.println(data);
			}
		}
		
				
		}
	}
