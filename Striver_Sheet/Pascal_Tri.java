import java.util.*;



public class Pascal_Tri
{
	public static void main(String[] args) {
		System.out.println(printPascal(6));
	}
	
	
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
		 ArrayList<Long> pRow = new ArrayList<Long>(10);
		 pRow.add(0L);pRow.add(0L);
		 pRow.add(0L);pRow.add(0L);
		 pRow.add(0L);pRow.add(0L);
		 ArrayList<ArrayList<Long>> ans = new ArrayList<ArrayList<Long>>();
		 for(int i=1;i<=n;i++)
		 {
			 ArrayList<Long> cRow = new ArrayList<Long>();
			 for(int j = 1;j<=i;j++)
			 {
				 if(j == 1 || j == i)
				 {
					 long l = 1;
					 cRow.add(l);
				 }
				 else
				 {
					 long ele = (pRow.get(j-2) + pRow.get(j-1));
					 cRow.add(ele);
				 }
			 }
			 pRow = cRow;
			 ans.add(pRow);
		 }
		 return ans;
	}
}
