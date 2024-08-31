// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.io.IOException;
class HelloWorld {
    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        while (true) {
		            System.out.println("Ask me anything:- ");
		            String user = sc.nextLine();

		            if (user.equalsIgnoreCase("Hi!") || user.equalsIgnoreCase("Hi") || 
		                user.equalsIgnoreCase("Hello")) {
		                System.out.println("User Said: " + user);
		                System.out.println("Bot Said: Hello");
		            }

		            else if (user.equalsIgnoreCase("Who are you?") || 
		                     user.equalsIgnoreCase("Are you robot or human?") || 
		                     user.equalsIgnoreCase("Are you male or female?")) {
		                System.out.println("User Said: " + user);
		                System.out.println("Bot Said: I am a bot");
		            }

		            else if (user.equalsIgnoreCase("How are you?")) {
		                System.out.println("User Said: " + user);
		                System.out.println("Bot Said: I am fine, thank you for asking.");
		            }

		            else if (user.equalsIgnoreCase("Wanna be friends?")) {
		                System.out.println("User Said: " + user);
		                System.out.println("Bot Said: We are already friends");
		            }

		            else if (user.equalsIgnoreCase("Tell me a joke?")) {
		                System.out.println("User Said: " + user);
		                System.out.println("Bot Said: What's the best thing about Switzerland? " + 
		                                   "I don't know, but the flag is a big plus.");
		            }

		            else if (user.equalsIgnoreCase("Table")) {
		                System.out.println("User Said: " + user);
		                System.out.print("Enter any number: ");
		                int num = sc.nextInt();
		                sc.nextLine(); // Consume the leftover newline
		                for (int i = 1; i <= 10; i++) {
		                    System.out.println(num + " x " + i + " = " + (num * i));
		                }
		            }

		            else if (user.equalsIgnoreCase("Adding two numbers")) {
		                System.out.println("User Said: " + user);
		                System.out.print("First Number = ");
		                int num1 = sc.nextInt();
		                System.out.print("Second Number = ");
		                int num2 = sc.nextInt();
		                sc.nextLine(); // Consume the leftover newline
		                System.out.println("Bot Said: The sum of the two numbers is " + (num1 + num2));
		            }

		            else if (user.equalsIgnoreCase("Open Notepad")) {
		                Runtime rs = Runtime.getRuntime();
		                try {
		                    rs.exec("notepad");
		                } catch (IOException e) {
		                    System.out.println("Error: " + e.getMessage());
		                }
		            }

		            else if (user.equalsIgnoreCase("Exit")) {
		                System.out.println("User Said: " + user);
		                System.out.println("Bot Said: Goodbye!");
		                sc.close();
		                System.exit(0);
		            }

		            else {
		                System.out.println("User Said: " + user);
		                System.out.println("Bot Said: I didn't understand that.");
		            }
		        }
	
	

    }
}