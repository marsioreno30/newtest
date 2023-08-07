package arrays;

public class Eg5 {

	public static void main(String[] args) {
		// Two dimensional array
		
		int a[][] = new int [3][2];
		
		a[0][0]=11;
		a[1][0]=12;
		a[2][0]=13;
		a[0][1]=14;
		a[1][1]=15;
		a[2][1]=16;
		
		/*//ForLoop
		for(int i=0;i<=2;i++)//for rows
		{
			for(int j=0;j<=1;j++)//for Column
			{
				//System.out.println(a[i][j]);
				System.out.print(a[i][j]+" ");//to print in single row
			}
			System.out.println();
		}*/
		//Enhanced for loop or for each loop
		for(int i[]:a) 
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		

	}

}










