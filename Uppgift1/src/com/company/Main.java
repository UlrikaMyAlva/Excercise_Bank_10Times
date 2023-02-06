package com.company;

import java.util.Scanner;

public class Main {

    /* Uppgift 1A.
    AUTHOR
    Ulrika Eriksson, 2021-04-13

    INTRODUCTION
    A bank account where you deposit and/or withdraw money ten times.

    IMPLEMENTATION
    First the variables are initialized. I needed an int for the bank account, one for every time the user made
    a deposit, one for every time the user made a withdrawal and one that added all the deposits and
    withdrawals that was made. I made a for-loop that makes the user input an int variable ten times. If the user add
    a positive number, the counter deposit get +1 added. If the user add a negative number, the deposit counter get +1
    added. An IF statement checks if the number is positive or negative. If the user put in 0, they are asked to put
    in a number again and the for loop get -1 (one extra loop added). After the loop the sum of the deposits/withdrawals
    are added to the bank account. In the end everything is printed to the console.

    DISCUSSION
    First I needed to declare the different variables. I got stuck on how the program would
    recognize if it was a deposit or withdrawal. I decided to make an if-statement that checked if the
    value was positive or negative and add to a counter to determine the amount of deposits and withdrawals.
    In the end the bank account is calculated. I would like to improve the code by making it more clear
    that it's not only deposits but also withdrawals that are calculated in the end, now you can get confused
    by the code. In this exercise I learned about using the ++ to add one.

    */

    public static void main(String[] args) {

        //Variables are initialized.
        int bankAccount = 0;
        int addDeposit = 0;
        int addWithdrawal = 0;
        int deposit;

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome! Please make ten deposits or withdrawals to your bank account: ");

        //Counter for amount of deposits or withdrawals.
        for (int i = 0; i < 10; i++) {

            deposit = scan.nextInt();

            if (deposit > 0) {
                addDeposit++;
            }
            else if (deposit < 0) {
                addWithdrawal++;
            }
            else if (deposit == 0) {
                System.out.println("You can't deposit or withdraw zero. Please try again: ");
                i--;
            }

            //Deposits (and withdrawals) are added/subtracted to the bank account.
            bankAccount = bankAccount + deposit;

        }

        //The result is printed.
        System.out.println("You have made " + addDeposit + " deposits.");
        System.out.println("You have made " + addWithdrawal + " withdrawals.");
        System.out.println("Your current bank account status is: " + bankAccount);


    }
}
