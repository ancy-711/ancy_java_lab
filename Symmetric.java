import java.util.Scanner;
public class Symmetric
{
public static void main(String[] args) 
{
Scanner cs=new Scanner(System.in);
		
int row_size,col_size;
		    
System.out.print("Enter the row Size Of the Matrix:");
row_size=cs.nextInt();
System.out.print("Enter the columns Size Of the Matrix:");
col_size=cs.nextInt();

int matrix[][] =new int[row_size][col_size];


 int i,j;
System.out.println("Enter the Matrix Element:");
for(i=0;i<row_size;i++)
{
 for(j=0;j<col_size;j++)
  {
   matrix[i][j]=cs.nextInt();
  }
}

 if(row_size!=col_size)
  {
   System.out.print("Given Matrix is not a Square Matrix.");
 }
else{

 int tran_matrix[][]=new int[col_size][row_size];

for(i=0;i<col_size;i++)
{
for(j=0;j<row_size;j++)
 {
  tran_matrix[i][j]=matrix[j][i];
 }
		  
}

int flag=0;
for(i=0;i<col_size;i++)
 {
  for(j=0;j<row_size;j++)
   {
    if(matrix[i][j]!=tran_matrix[i][j])
      {
	flag=1;
        break;
     }
  }
}
if(flag==1)
System.out.print("Given Matrix is not a symmetric Matrix.");
else
System.out.print("Given Matrix is a symmetric Matrix.");
}

cs.close();
}
}