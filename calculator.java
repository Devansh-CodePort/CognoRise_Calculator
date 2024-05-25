import java.util.Scanner;
class calculator 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        double num1,num2,result=0;
        boolean continueLoop=true;
        do 
        {
            System.out.print("Enter the first number: ");
            num1=sc.nextDouble();
            System.out.print("Enter the second number: ");
            num2=sc.nextDouble();

            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter your choice (1-4): ");
            choice=sc.nextInt();
            try 
            {
                switch (choice) 
                {
                    case 1:
                        result=num1+num2;
                        break;
                    case 2:
                        result=num1-num2;
                        break;
                    case 3:
                        result=num1*num2;
                        break;
                    case 4:
                        if (num2==0) 
                        {
                            throw new ArithmeticException("Cannot divide by zero");
                        }
                        result=num1/num2;
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        continue;
                }
                System.out.println("Result: "+result);
            } 
            catch(ArithmeticException e) 
            {
                System.out.println("Error: "+e.getMessage());
            }
            System.out.print("Do you want to perform another operation? (y/n): ");
            String choice2=sc.next();
            continueLoop=choice2.equalsIgnoreCase("y");
        } while(continueLoop);
    }
}