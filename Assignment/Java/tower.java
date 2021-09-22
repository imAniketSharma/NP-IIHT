import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int matrix[][];
		int col_len;
		int row_len;
		Scanner in =new Scanner(System.in);
		row_len=in.nextInt();
		col_len=in.nextInt();
		matrix=new int[row_len][col_len];
		int k=0;
		int mid=col_len/2;
		int sum=0;
		for(int i=0;i<2;i++)
		{
			for(int j=(mid-k);j<=(mid+k);j++)
			{
				int x=in.nextInt();
				sum=sum+x;
				matrix[i][j]=x;
				j++;
			}
			k++;
		}
		for(int i=2;i<row_len;i++)
		{
			int temp=0;
			for(int j=(mid-k);j<=(mid+k);j++)
			{
				matrix[i][j]=sum;
				temp=temp + matrix[i][j];
				j++;
			}
			sum=sum+temp;
			k++;
		}
		for(int i=0;i<row_len;i++)
		{
			for(int j=0;j<col_len;j++)
			{
				if(matrix[i][j]==0)
				{
					System.out.print(" ");
				}
				else
				{
				System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
