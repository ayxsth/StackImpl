package stackimplementation;

import java.util.Scanner;

/**
 *
 * @author ayxst
 */
public class StackImplementation {

    public static void main(String[] args) {
        
        int option;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the stack: ");
        int size = in.nextInt();
        Stack stack = new Stack(size);
        
        do {
            System.out.println("--------------------");
            System.out.println("|   1. Push        |");
            System.out.println("|   2. Pop         |");
            System.out.println("|   3. Peek        |");
            System.out.println("--------------------");
            switch (in.nextInt()) {
                case 1:
                    System.out.println("Enter a number: ");
                    try {
                        stack.push(in.nextInt());
                        stack.display();
                    } catch (RuntimeException e) {
                        System.out.println("Exception: " + e);
                    }
                    break;
                    
                case 2:
                    try {
                        System.out.println(stack.pop() + " has been popped.");
                        stack.display();
                    } catch (RuntimeException e) {
                        System.out.println("Exception: " + e);
                    }
                    break;
                    
                case 3:
                    try {
                        System.out.println(stack.peek() + " is in top of the stack.");
                    } catch (RuntimeException e) {
                        System.out.println("Exception: " + e);
                    }
                    break;
                    
                default:
                    System.out.println("Invalid opetion!");
                    break;
            }
            System.out.println("Enter Y or y to continue: ");
            option = in.next().charAt(0);
        } while (option == 'y' || option == 'Y');
        
    }
    
}
