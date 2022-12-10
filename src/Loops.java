import javax.lang.model.element.NestingKind;

/**
 * 
 */

/**
 * @author LAP-8
 *
 */
public class Loops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//Question1
		for (int i =0 ; i< 4 ; i++)
		{
			System.out.println("* * * *");
		}
		
		System.out.println("--------------------------------------------------------------");
		//Question2
		String j = " ";   
		for (j="*";j.length()<=5;j=j+"*")  
		    System.out.println(j);
		
		System.out.println("--------------------------------------------------------------");
		//Question3
		for (int num = 1 ; num <= 5; num++)
		{
			{
			for (int i = 1 ; i < num ; i++)
		        System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------------------");
		//Question4
		for (int m = 1 ; m <5; m++) // control output per line 
		{
			for (int w = 5; w >= m; w--) // control spaces
			{
                System.out.print(" ");
            }
            for (int y = 1; y <= m; y++)// loop to print the number of stars in each row
            {
                System.out.print("* ");
            }
            System.out.println(); //print newline
		}
		System.out.println("--------------------------------------------------------------");
		//Question5 
		for (int num = 1 ; num <= 5; num++) // control output per line 
		{
			{
			    for (int i = 1 ; i < num+1 ; i++) // control output of 1 12 123 1234 
		        System.out.print(i);
			    for(int i = num -1; i >0 ; i= i-1) //control output of 1 21 321 4321
			    System.out.print(i);   
			}
			
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------------------");
		//Question6
		for (int k = 1 ; k <6; k++) // control output per line 
		{
			for (int v = 4; v >= k; v--) // control spaces
			{
                System.out.print(" ");
            }
            for (int o = 1; o <= k; o++)// loop to print the number of stars in each row
            {
                System.out.print("* ");
            }
            System.out.println(); //print newline
		}
		
	}//end of class

}
