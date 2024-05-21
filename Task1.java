package org.simple;
import java.util.Scanner;

public class Task1 {

			public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        String predefinedPassword = "JAVA";
		        int attempts = 3;

		        while (attempts > 0) {
		            System.out.print("Enter password: ");
		            String inputPassword = scanner.nextLine();

		            if (inputPassword.equals(predefinedPassword)) {
		                System.out.println("Password accepted.");
		                showMenu(scanner);
		                break;
		            } else {
		                attempts--;
		                System.out.println("Incorrect password. You have " + attempts + " attempts left.");
		            }
		        }

		        if (attempts == 0) {
		            System.out.println("You have been locked out due to too many incorrect attempts.");
		        }

		        scanner.close();
		    }

		    public static void showMenu(Scanner scanner) {
		        while (true) {
		            System.out.println("\nMenu:");
		            System.out.println("1. Factorial Calculation");
		            System.out.println("2. Fibonacci Sequence");
		            System.out.println("3. Prime Number Check");
		            System.out.println("4. Sum of Digits");
		            System.out.println("5. Reverse Number");
		            System.out.println("6. Exit");
		            System.out.print("Choose an option: ");

		            int choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    factorialCalculation(scanner);
		                    break;
		                case 2:
		                    fibonacciSequence(scanner);
		                    break;
		                case 3:
		                    primeNumberCheck(scanner);
		                    break;
		                case 4:
		                    sumOfDigits(scanner);
		                    break;
		                case 5:
		                    reverseNumber(scanner);
		                    break;
		                case 6:
		                    System.out.println("Exiting...");
		                    return;
		                default:
		                    System.out.println("Invalid option. Please try again.");
		            }
		        }
		    }

		    public static void factorialCalculation(Scanner scanner) {
		        System.out.print("Enter a non-negative integer: ");
		        int n = scanner.nextInt();
		        long factorial = 1;

		        for (int i = 1; i <= n; i++) {
		            factorial *= i;
		        }

		        System.out.println("Factorial of " + n + " is " + factorial);
		    }

		    public static void fibonacciSequence(Scanner scanner) {
		        System.out.print("Enter a non-negative integer: ");
		        int n = scanner.nextInt();
		        int a = 0, b = 1, c;

		        if (n == 0) {
		            System.out.println("The 0th Fibonacci number is 0");
		            return;
		        }

		        for (int i = 2; i <= n; i++) {
		            c = a + b;
		            a = b;
		            b = c;
		        }

		        System.out.println("The " + n + "th Fibonacci number is " + b);
		    }

		    public static void primeNumberCheck(Scanner scanner) {
		        System.out.print("Enter a positive integer: ");
		        int n = scanner.nextInt();
		        boolean isPrime = true;

		        if (n <= 1) {
		            isPrime = false;
		        } else {
		            for (int i = 2; i <= Math.sqrt(n); i++) {
		                if (n % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }
		        }

		        if (isPrime) {
		            System.out.println(n + " is a prime number.");
		        } else {
		            System.out.println(n + " is not a prime number.");
		        }
		    }

		    public static void sumOfDigits(Scanner scanner) {
		        
		       
		        System.out.print("Enter the first positive integer: ");
		        int firstNumber = scanner.nextInt();
		        
		        System.out.print("Enter the second positive integer: ");
		        int secondNumber = scanner.nextInt();
		        
		        int sum = firstNumber + secondNumber;
		        
		        System.out.println("The sum of the two numbers is " + sum);
		    }
		

		    public static void reverseNumber(Scanner scanner) {
		        System.out.print("Enter a positive integer: ");
		        int n = scanner.nextInt();
		        int reversed = 0;

		        while (n != 0) {
		            int digit = n % 10;
		            reversed = reversed * 10 + digit;
		            n /= 10;
		        }

		        System.out.println("The reversed number is " + reversed);
		    }
		}