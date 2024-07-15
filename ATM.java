package Classes;

import java.util.*;

public class ATM {
   static ArrayList<Integer> AvailBalance=new ArrayList<>();
    static int checkBalance( ArrayList<Integer>AvailBalance){
        return AvailBalance.get(0);
    }
  static  void withdraw(int balance, int amount){
        balance= balance- amount;
        AvailBalance.set(0,balance);
        System.out.printf("%d withdrawn successfully ", amount);
        System.out.println();
    }
 static   void deposit(int balance, int amount){
        balance = balance + amount;
        AvailBalance.set(0,balance);
        System.out.printf("%d deposited successfully ", amount);
        System.out.println();

    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ATM app=new ATM();
            int pin=1234;
            System.out.println("enter the pin code give to you");
            int inputPin=sc.nextInt();
            System.out.println("enter the balance");
            int balance=sc.nextInt();

            AvailBalance.add(balance);
            if(inputPin==pin){
                int c = 1;

                do{
                    System.out.println("Welcome to our ATM Machine");
                    System.out.println("Make your choice");
                    System.out.println("1.Check Balance");
                    System.out.println("2.Withdraw money");
                    System.out.println("3.Deposit money");
                    System.out.println("4.Exit");

                    int choice;
                    choice=sc.nextInt();

                    int amount;
                    switch(choice){
                        case 1 : int b = ATM.checkBalance(AvailBalance);
                            System.out.print("Available balance in your account is : ");
                            System.out.println(b);
                            break;
                        case 2:
                            System.out.println("enter the amount you want to withdraw");
                             amount=sc.nextInt();
                            if(balance<amount){
                                System.out.println("Insufficient balance");
                            }
                            else{
                                ATM.withdraw(AvailBalance.get(0), amount);
                            }
                             break;
                        case 3:
                            System.out.println("enter the amount you want to deposit");
                            amount=sc.nextInt();
                            ATM.deposit(AvailBalance.get(0), amount);
                            break;
                        case 4:
                            System.out.println("Thank you for visiting");
                            System.exit(0);
                    }

                }while(c>0);
            }
            else{
                System.out.println("Enter a valid pin code given to you");
            }

        }
    }

