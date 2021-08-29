import java.util.*;
public class MyStore1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	System.out.print("Enter product name:");
	String pname=scan.nextLine();
	System.out.print("Enter product ID:");
	String id=scan.nextLine();
	System.out.print("Enter transaction ID:");
	int tid=scan.nextInt();
	System.out.print("Enter product price:");
	int pprice=scan.nextInt();
	System.out.print("Enter how many unit purchased:");
	int unit=scan.nextInt();
	System.out.print("Enter amount of money paid:");
	float paid=scan.nextFloat();
	Receipt rcp=new Receipt();
	float subtotal=rcp.subtotal(pprice,unit);
	float salestax=rcp.salestax(subtotal);
	float total=rcp.total(subtotal, salestax);
	float balance=rcp.balance(paid, total);
	System.out.println("-----------------------------------------------------");
	System.out.println("                     MY STORE                        ");
	System.out.println("            123 MG RD BANGALORE KA IN 560001         ");
	System.out.println("                   STORE #: 22222                    ");
	System.out.println("             THANK YOU FOR YOUR SHOPPING             ");
	System.out.println("                  TRANSACTION #:  34                 ");
	System.out.println("                    Date: 08/23/2021                 ");
	System.out.println("-----------------------------------------------------");
	System.out.print("            "); 
	System.out.print(pname);  
	System.out.print("                ");   
    System.out.println(+unit );
	System.out.println("            Unit price:         "+pprice              );
	System.out.println("            Sub total:          "+subtotal            );
	System.out.println("            Tax(8.25%):         "+salestax);
	System.out.println("            Total:              "+total               );
	System.out.println("-----------------------------------------------------");
	System.out.println("            Cash:               "+paid                );
	System.out.println("            Change:             "+balance             );
	
	
	
	}

}
