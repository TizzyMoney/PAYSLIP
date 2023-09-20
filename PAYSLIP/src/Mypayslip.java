import java.util.Scanner;
import java.util.scanner;
public class Mypayslip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employee number:");
		int employeenumber = scanner.nextInt();
		System.out.println("Enter employee name");
		String employeename = scanner.next();
		System.out.println("Enter designation");
		String designation = scanner.next();
		System.out.println("Enter days worked");
		int daysworked = scanner.nextInt();
		System.out.println("Enter pay rate");
		double payrate = scanner.nextDouble();
		System.out.println("Enter generation date");
		String generationdate = scanner.next();
		double basicpay = daysworked*payrate;
		double pf = basicpay/10;
		double proftax = 0.2*basicpay;
		double totaldeduct =pf+proftax;
		double netpay =basicpay-totaldeduct;
		System.out.println("\t\t\tSHREE KRISHNA CHEMIST AND DRGGIST");
		System.out.println("\t\t\tSALARY MONTH 9 2013");
		System.out.println(" ");
		System.out.println("EMP NO:" + employeenumber + "\tEMP .NAME:" + employeename + "\t\tDESIGNATION:" + designation);
		System.out.println("DAYS WORKED:" + daysworked + "\tPAY RATE:" + payrate + "\t\t\tGEN.DATE:" + generationdate);
		System.out.println("_________________________________________________________________________________________");
		System.out.println("EARNINGS\tAMOUNT(RS.)\tDEDUCTION\tAMOUNT(RS.)");
		System.out.println("_________________________________________________________________________________________");
		System.out.println("BASICPAY\t" + basicpay + "\t\tP.F.            " + pf);
		System.out.println("\t\t\t\tPROF.TAX        " + proftax);   
		System.out.println(" ");
		System.out.println("_________________________________________________________________________________________");
		System.out.println("GROSS EARN.\t" + basicpay + "\t\tTOTAL DEDUCT.   " + totaldeduct );
		System.out.println("\t\t\t\tNET PAY         " + netpay);
		
		
		
	

	}

}
