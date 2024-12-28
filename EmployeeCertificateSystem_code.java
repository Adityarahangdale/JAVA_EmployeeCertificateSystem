import java.util.Scanner;
public class Program2 {

        Scanner obj = new Scanner(System.in);

        String name, empId, depart, desig;
        double bS, hRA, tA, dA, gS, nS;
        int incent, dedu, lICdedu;

        public void getdata() {
            System.out.println("Enter Employee Details\n");

            System.out.print("Enter Employee Name: ");
            name = obj.nextLine();

            System.out.print("Enter Employee ID: ");
            empId = obj.nextLine();

            System.out.print("Enter Employee Department: ");
            depart = obj.nextLine();

            System.out.print("Enter Employee Designation: ");
            desig = obj.nextLine();

            System.out.print("Enter Employee Basic Salary: ");
            bS = obj.nextDouble();

            if (bS > 0) {
                hRA = (bS * 40) / 100;
                tA = (bS * 30) / 100;
                dA = (bS * 90) / 100;

                incent = 5000;
                dedu = 3000;
                lICdedu = 2500;

                gS = bS + hRA + tA + dA + incent;
                nS = gS - (dedu + lICdedu);
            } else {
                System.out.println("Invalid Basic Salary. Must be greater than 0.");
            }
        }

        public void display() {
            System.out.println("\n--------- SALARY CERTIFICATE ---------\n");
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + empId);
            System.out.println("Employee Department: " + depart);
            System.out.println("Employee Designation: " + desig);
            System.out.printf("Gross Salary: %.2f\n", gS);
            System.out.printf("Net Salary: %.2f\n", nS);
        }

        public static void main(String[] args) {
            Scanner obj1 = new Scanner(System.in);
            Program2 obj2 = new Program2();

            int input, choice = 1;

            do {
                System.out.println("\n--- LIST OF OPERATIONS ---\n");
                System.out.println("1: Enter Employee Details");
                System.out.println("2: Display Salary Certificate");
                System.out.println("3: EXIT");

                System.out.print("Enter your choice: ");
                input = obj1.nextInt();

                switch (input) {
                    case 1:
                        obj2.getdata();
                        break;
                    case 2:
                        obj2.display();
                        break;
                    case 3:
                        System.out.println("Exiting the application. Goodbye!");
                        choice = 0;
                        break;
                    default:
                        System.out.println("Invalid input! Please try again.");
                }

                if (choice == 1) {
                    System.out.print("\nDo you want to perform 1another operation? (1-Yes / 0-No): ");
                    choice = obj1.nextInt();
                }
            } while (choice == 1);

            obj1.close();
            obj2.obj.close();
        }
    }

