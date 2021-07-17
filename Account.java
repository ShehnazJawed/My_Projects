package atm;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Account {
    Scanner input=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");

    /*Set the Customer Number*/
    public int setCustomerNumber(int customer_Number){
      this.customerNumber=customer_Number;
      return customerNumber;}
    
      /*Get the Customer Number*/
      public int getCustomerNumber(){
         return customerNumber;}
      
      /*Set the pin number*/
      public int setPinNumber(int pinNumber){
         this.pinNumber=pinNumber;
         return pinNumber;}
    
      /*Get the pin Number*/
      public int getPinNumber(){
         return pinNumber;
      }
      
      /*Get Checking Account Balance*/
      public double getCheckingBalance(){
         return checkingBalance;
       }
     /*Get saving Account Balance*/
      public double getSavingBalance(){
        return savingBalance;}
      
     /*Calculate Checking Account Withdrawl*/
     public double calcCheckingWithdraw(double amount){
         checkingBalance=(checkingBalance - amount);
         return checkingBalance;
     }      
      /*Calculate saving Account Withdrawl*/
     public double calcSavingWithdraw(double amount){
         savingBalance=(savingBalance-amount);
         return savingBalance;
     }
      /*Calculate Checking Account deposit*/
       public double calcCheckingDeposit(double amount){
          checkingBalance=(checkingBalance+amount);
          return checkingBalance;
       }
     
     /*Calculate Saving Account deposit*/
       public double calcSavingDeposit(double amount){
          savingBalance=(savingBalance+amount);
          return savingBalance;
       }
       
     /*Customer Checking Account Withdraw Input*/
     public void getCheckingWithdrawInput(){
         System.out.println("Checcking Account Balance: " + moneyFormat.format(checkingBalance));
         System.out.println();
         System.out.print("Amount you want to withdraw from Checking Account: ");
         double amount = input.nextDouble();
         if((checkingBalance-amount)>=0){
            calcCheckingWithdraw(amount);
            System.out.println("New checking Account balance: "+moneyFormat.format(checkingBalance));
            System.out.println();
         }else{
            System.out.println("Balance cannot be Negative: "+"\n");
            }
     }
     
     
     /*Customer saving Account Withdraw Input*/
     public void getSavingWithdrawInput(){
         System.out.println("Saving Account Balance: "+moneyFormat.format(savingBalance));
         System.out.println();
         System.out.print("Amount you want to withdraw from saving Account: ");
         double amount= input.nextDouble();
         
         if((savingBalance-amount)>=0){
            calcSavingWithdraw(amount);
            System.out.println("New saving Account balance: "+ savingBalance+"\n"); 
            System.out.println();}
         else{
            System.out.println("Balance cannot be negative."+"\n");
         }}
     
    /*Customer Checking account deposit input*/
     public void getCheckingDepositInput(){
          System.out.println("Checking Account Balance: "+moneyFormat.format(checkingBalance));
          System.out.println();
          System.out.print("Amount you want to deposit from Checking Account: ");
          double amount=input.nextDouble();
          
          if((checkingBalance + amount)>=0){
             calcCheckingDeposit(amount);
             System.out.println("New Checking Account balance: "+moneyFormat.format(checkingBalance));
             System.out.println();
          }else{
             System.out.println("Balance cannot be negative."+"\n");
          }
     }
     /*Customer Saving Account Deposit Input*/
     public void getSavingDepositInput(){
         System.out.println("Saving Account Balance: "+ moneyFormat.format(savingBalance));
         System.out.println();
         System.out.print("Amount you want to deposit from saving Account: ");
         double amount= input.nextDouble();
         if((savingBalance+amount)>=0){
            calcSavingDeposit(amount);
            System.out.println("new saving Account balance: "+moneyFormat.format(savingBalance));
            System.out.println();}
         else{
            System.out.println("Balance cannot be negative."+"\n");}}
            private int customerNumber;
            private int pinNumber;
            private double checkingBalance=0;
            private double savingBalance=0;

}

