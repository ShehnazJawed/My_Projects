package atm;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu extends Account{
   Scanner menuInput=new Scanner(System.in);
   DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
   HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
   /* Validate login informaion customer number and pin number*/
   public void getlogin() throws IOException{
     int x=1;
     do{
      try{
      data.put(9876543,9876);
      data.put(8989898,1890);
      System.out.println("Welcome to the ATM Project");
      System.out.print("Enter your customer Number: ");
      setCustomerNumber(menuInput.nextInt());
      System.out.print("Enter your pin Number: ");
      setPinNumber(menuInput.nextInt());
      }
      catch(Exception e){
      System.out.println("\n"+"Invalid character(S).Only numbers."+"\n");
      x=2;}
      for(Entry<Integer,Integer> entry : data.entrySet()){
        if(entry.getKey() == getCustomerNumber() && entry.getValue()==getPinNumber()){
        getAccountType();}}
      System.out.println("\n"+"Wrong Customer Number or Pin Number:"+"\n");
        }while(x==1);
}
/* Display Account Type menu With Selection */
public void getAccountType(){
  System.out.println("Select Account You want to Access:");
  System.out.println("Type 1 - Checking Account");
  System.out.println("Type 2 - saving Account");
  System.out.println("Type 3 - Exit");
  System.out.print("Choice: ");
  selection = menuInput.nextInt();
  switch(selection){
  case 1:
     getChecking();
  break;
  case 2:
     getSaving();
  break;
  case 3:
     System.out.println("Thank you for using this ATM,bye.");
     break;
  default:
     System.out.println("\n"+"Invalid choice."+"\n");
     getAccountType();}}

/*Display Checking Account menu with selections*/
public void getChecking(){
    System.out.println("Checking Account: ");
    System.out.println("Type 1 - view Balance");
    System.out.println("Type 2 - withdraw Funds");
    System.out.println("Type 3 - Deposit Funds");
    System.out.println("type 4  - Exit");
    System.out.print("Choice: ");
    
    selection= menuInput.nextInt();
    switch(selection){
    case 1:
       System.out.println("Checking Account Balance: "+ moneyFormat.format(getCheckingBalance()));
       getAccountType();
       break;
    case 2:
        getCheckingWithdrawInput();
        getAccountType();
        break;
    case 3:
        getCheckingDepositInput();
        getAccountType();
        break;
    
    case 4:
        System.out.println("Thank you for using this ATM, bye.");
        break;
    default:
        System.out.println("\n"+"Invalid Choice"+"\n");
        getChecking();
    }}

/*Display saving Account menu with selection*/
public void getSaving(){
   System.out.println("Saving Account:");
   System.out.println("Type 1- view Balance");
   System.out.println("Type 2- withdraw Funds");
   System.out.println("Type 3- Deposit Funds");
   System.out.println("Type 4- Exit");
   System.out.print("Choice: ");
   selection=menuInput.nextInt();
switch(selection){
case 1:
   System.out.println("Saving Account Balance:"+ moneyFormat.format(getSavingBalance()));
   getAccountType();
   break;
case 2:
   getSavingWithdrawInput();
   getAccountType();
   break;
case 3:
   getSavingDepositInput();
   getAccountType();
   break;
case 4:
   System.out.println("Thank you for using this ATM, bye.");
   break;
default:
   System.out.println("\n"+"Invalid choice."+"\n");
   getSaving();

}
}
int selection;

   
}

