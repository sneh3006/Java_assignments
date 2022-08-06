/*Use the Account class created as above to simulate an ATM machine. 
Create 10 accounts with id AC001…..AC010 with initial balance 300₹. The 
system prompts the users to enter an id. If the id is entered incorrectly, ask the 
user to enter a correct id. Once an id is accepted, display menu with multiple 
choices. 
1. Balance inquiry 
2. Withdraw money [Maintain minimum balance 300₹] 
3. Deposit money 
4. Money Transfer 
5. Create Account 
6. Deactivate Account 
7. Exit 
21CE0042 Sneh Jani
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.NullPointerException;
class account_2
{ 
public static void main(String[] args)throws NullPointerException
{ 
int i;
ArrayList<Account> arrL=new ArrayList<Account>();
for(i=0;i<10;i++)
{ 
Account ac=null;
if(i<9)
ac=new Account("AC00"+(i+1));
else
ac=new Account("AC0"+(i+1));
arrL.add(ac);
}
Account ac=null;
Scanner sc=new Scanner(System.in);
int temp;
do
{ 
Account.menu();
System.out.print("\nEnter the choice : ");
temp=sc.nextInt();
if(temp==7)
System.exit(0);
if(temp==5)
{ 
System.out.print("\nEnter the Account id : ");
String id=sc.next();
ac=new Account(id);
arrL.add(ac);
System.out.println("Your account has been successfully created.");
continue;
}
if(temp==6)
{ 
System.out.print("\nEnter the Account id : ");
String id=sc.next();
for(i=0;i<arrL.size();i++)
{ 
ac=arrL.get(i);
if(id.equals(ac.getId()))
{ 
arrL.remove(i);
break;
}
}
System.out.println("Your account has been successfully deleted.");
continue;
}
do
{ 
System.out.print("\nEnter the Account id : ");
String id=sc.next();
for(i=0;i<arrL.size();i++)
{ 
ac=arrL.get(i);
if(id.equals(ac.getId()))
break;
}
if(i==arrL.size())
System.out.println("Enter valid id ");
else
break;
}while(true);
switch(temp)
{
case 1:
ac.balanceInquiry();
break;
case 2:
ac.withdrawMoney();
break;
case 3:
ac.depositMoney();
break;
case 4:
int j;
System.out.print("Enter the Transfered Account id : ");
String id1=sc.next();
System.out.print("Enter the Transfered amount : ");
double db=sc.nextDouble();
Account ac1=null;
for(j=0;j<10;j++)
{
ac1=arrL.get(j);
if((ac1.getId()).equals(id1))
break;
}
ac.moneyTransfer(ac1,db);
break;
default:
System.out.println("Please Enter the valid choice.");
}
}while(true); 
}
}
class Account
{ 
private Scanner sc=new Scanner(System.in);
private String id="";
private double balance=300;
public Account(String id)
{
this.id=id;
}
public Account(String id,double balance)
{ this.id=id;
this.balance=balance;
}
public Account()
{ 
System.out.print("\nEnter the Account id : ");
id=sc.next();
System.out.print("\nEnter the initial amount : ");
balance=sc.nextDouble();
}
public void balanceInquiry()
{ 
System.out.println("Your Bank balance is : "+balance); 
}
public void withdrawMoney()
{
int flag=0;
do
{ 
System.out.print("\nEnter the withdral amount : ");
double temp=sc.nextDouble();
if(temp<0)
System.out.println("Please enter the valid withdraw amount.");
else if(balance-temp>=300)
{ balance-=temp;
break; }
else
System.out.println("you are not able to withdraw money.");
}while(true);
System.out.println("Your available balance is : "+balance);
}
public void depositMoney()
{ 
do
{
System.out.print("\nEnter the deposit amount : ");
double temp=sc.nextDouble();
if(temp<0)
System.out.println("Please enter the valid deposit amount.");
else
{ balance+=temp;
break;
}
}while(true);
System.out.println("Your available balance is : "+balance);
}
public void moneyTransfer(Account ac1,double bal)
{
if(this.balance-bal>=300)
{ 
this.balance-=bal;
ac1.setBalance(ac1.getBalance()+bal);
System.out.println("Money Transfer is successfully completed.");
}
else
System.out.println("Money Transfer is not successfully completed.");
}
public void createAccount(Account ac)
{ ac=new Account();
System.out.println("Your Account has been successfully created.");
}
public static void menu()
{
System.out.println("\n 1. Balance inquiry \n 2. Withdraw money \n 3. Deposit money\n 4. Money Transfer\n 5. Create Account\n 6. Deactivate Account\n 7. Exit");
}
public void setBalance(double balance)
{
this.balance=balance;
}
public double getBalance()
{
return balance; 
}
public String getId()
{
return id;

}
}


