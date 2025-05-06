/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankaccount;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount myAccount = new BankAccount("123456789", 1000.0);

        // Display initial account details
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Initial Balance: " + myAccount.getBalance());

        // Deposit money
        myAccount.deposit(500.0);
        System.out.println("Balance after deposit: " + myAccount.getBalance());

        // Withdraw money
        myAccount.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + myAccount.getBalance());

        // Attempt to withdraw more than the balance
        myAccount.withdraw(1500.0);
    }
}