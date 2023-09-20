import java.util.Scanner;

public class markshheet {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner input = new Scanner(System.in);

		


        System.out.println("Enter Student No: ");
        int sNo1 = input.nextInt();
        int sNo2 = input.nextInt();
        int sNo3 = input.nextInt();

        System.out.print("Enter Student Name: \n");
        String studentName1 = input.next();
        String studentName2 = input.next();
        String studentName3 = input.next();

        System.out.println("Enter sub1: ");
        int sub1One = input.nextInt();
        System.out.println("Enter sub2: ");
        int sub2One = input.nextInt();
        System.out.println("Enter sub3: ");
        int sub3One = input.nextInt();
        System.out.println("Enter sub4: ");
        int sub4One = input.nextInt();
        System.out.println("Enter sub5: ");
        int sub5One = input.nextInt();

        System.out.println("Enter sub1: ");
        int sub1Two = input.nextInt();
        System.out.println("Enter sub2: ");
        int sub2Two = input.nextInt();
        System.out.println("Enter sub3: ");
        int sub3Two = input.nextInt();
        System.out.println("Enter sub4: ");
        int sub4Two = input.nextInt();
        System.out.println("Enter sub5: ");
        int sub5Two = input.nextInt();

        System.out.println("Enter sub1: ");
        int sub1Three = input.nextInt();
        System.out.println("Enter sub2: ");
        int sub2Three = input.nextInt();
        System.out.println("Enter sub3: ");
        int sub3Three = input.nextInt();
        System.out.println("Enter sub4: ");
        int sub4Three = input.nextInt();
        System.out.println("Enter sub5: ");
        int sub5Three = input.nextInt();

        int total1 = sub1One + sub2One + sub3One + sub4One + sub5One;
        int total2 = sub1Two + sub2Two + sub3Two + sub4Two + sub5Two;
        int total3 = sub1Three + sub2Three + sub3Three + sub4Three + sub5Three;

        float avgSub1 = (sub1One + sub1Two + sub1Three)/3.0f;
        float avgSub2 = (sub2One + sub2Two + sub2Three)/3.0f;
        float avgSub3 = (sub3One + sub3Two + sub3Three)/3.0f;
        float avgSub4 = (sub4One + sub4Two + sub4Three)/3.0f;
        float avgSub5 = (sub5One + sub5Two + sub5Three)/3.0f;

        float avg1 = total1 / 5.0f;
        float avg2 = total2 / 5.0f;
        float avg3 = total3 / 5.0f;

        System.out.println("Welcome to Student Mark List Application");
        System.out.println("────────────────────────────────────────────────────────────────");
        System.out.println("SNo Student Name        Sub1   Sub2   Sub3   Sub4   Sub5   Total");
        System.out.println("────────────────────────────────────────────────────────────────");
        System.out.println(sNo1 + "   " + studentName1 + "              " + sub1One + "     " + sub2One + "     " + sub3One + "     " + sub4One + "     " + sub5One + "     " + total1);
        System.out.println(sNo2 + "   " + studentName2 + "             " + sub1Two + "     " + sub2Two + "     " + sub3Two + "     " + sub4Two + "     " + sub5Two + "    " + total2);
        System.out.println(sNo3 + "   " + studentName3 + "           " + sub1Three + "     " + sub2Three + "     " + sub3Three + "     " + sub4Three + "     " + sub5Three + "     " + total3);
        System.out.println("────────────────────────────────────────────────────────────────");
        System.out.println("Average:                " + String.format("%.0f",avgSub1) + "     " + String.format("%.0f",avgSub2) + "     " + String.format("%.0f",avgSub3) + "     " + String.format("%.0f",avgSub4) + "     " + String.format("%.0f",avgSub5));
        System.out.println("Student Average:\n" + avg1 + "\n" + avg2 + "\n" + avg3);


	}

}
