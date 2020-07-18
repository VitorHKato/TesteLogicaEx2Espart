
public class Solution 
{
	public int solution(int[] A)
	{
		int resposta = 0;
		
		for(int i = 0; i < A.length; i++)
		{
			int j;
			for(j = 0; j < i; j++)
			{
				if(A[j] == A[i])
					break;
			}
			
			if(i == j)
				resposta++;
		}
		
		return resposta;
	}
}
