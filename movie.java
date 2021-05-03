import java.util.*;
import java.lang.Exception;
class user extends Exception 
{
user(String message)
{
super(message);
}
}
class booking
{
int opt;
int b;
int person;
String date;
Scanner p=new Scanner(System.in);
void accept1()	
	{
	System.out.println("\nPlease Select Language \n 1. English \n 2. Hindi");
	opt=p.nextInt();
	System.out.println("\nEnter the number of persons");
	person=p.nextInt();
	System.out.println("\n Enter the booking date");
	date=p.next();
	switch(opt)
		{
		case 1:
		System.out.println("\n English Movies \n 1.How to train Dragon : Hidden World  \n 2.Captain Marvel  \n 3.Spiderman : Far from Home \n 4.Avengers : End Game");
		b=p.nextInt();
		switch(b)
			{
			case 1:System.out.println("\n How to train Dragon : Hidden World\n cost=Rs 340/- ");
			break;
			case 2:System.out.println("Captain Marvel\n cost=Rs 380/-");
			break;
			case 3:System.out.println("Spiderman : Far from Home\n cost=Rs 360/- ");
			break;
			case 4: System.out.println("Avengers : End Game\n cost=Rs 450/-");
			break;
			}

			break;
		case 2:
		System.out.println("Hindi Movies\n  1.URI : The Surgical Strike  \n 2.Kesari \n 3.Luka Chupi \n 4.Manikarnika : The Queen of Jhansi");
		b=p.nextInt();	
		switch(b)
			{
			case 1:System.out.println("URI : The Surgical Strike \n cost=Rs 240/-");
			break;
			case 2:System.out.println("Kesari \n cost=Rs 220/-");
			break;
			case 3:System.out.println("Luka Chupi \n cost=Rs 200/- ");
			break;
			case 4: System.out.println("Manikarnika : The Queen of Jhansi \n cost=Rs 3800/-");
			break;
			}
			break;
			
		}	
	}	
}
class seat extends booking
{
int no;
Scanner p=new Scanner(System.in);
void accept2()
{
System.out.println(" \nThe following seats are available for booking\n12A\t12B\n13A\t13B\t13C\n20D\t20E\t20F");
no=p.nextInt();
switch(no)
	{
	case 1:System.out.println("\n20A");
	break;
	case 2:System.out.println("\n14B");
	break;
	case 3:System.out.println("\n18A");
	break;
	case 4:System.out.println("\n12B");
	break;
	case 5:System.out.println("\n10C");
	break;
	case 6:System.out.println("\n26D");
	break;
	case 7:System.out.println("\n24E");
	break;
	case 8:System.out.println("\n28F");
	}
}
}
	
		

class payment extends seat
{

int pay;
String name;
String valid;
String num;
Scanner p=new Scanner(System.in);
void accept3()
	{
	System.out.println("\nmake a payment using\n 1. debit card \n 2. credit card");
	System.out.println("\nenter your option");
	pay=p.nextInt();
	switch(pay)
		{
		case 1:
		System.out.println("enter  your card number");
		num=p.next();
		System.out.println("\nvalid to");
		valid=p.next();
		System.out.println("\nenter cvv");
		pay=p.nextInt();
		System.out.println("\nenter the card Holder's name ");
		name=p.next();
		System.out.println("\nRS 3400/- have been successfully debited from your account");
		System.out.println("\n Thank you for using our Airline service!");
		System.out.println("\n Do you want to continue?\n 1.yes 2. no");
			
		
		break;
		case 2:
		System.out.println("enter  your card number");
		pay=p.nextInt();
		System.out.println("valid to");
		valid=p.next();
		System.out.println("enter cvv");
		pay=p.nextInt();
		System.out.println("enter the card holders name ");
		name=p.next();
		break;
		}
	}

} 
class movie
{
public static void main(String args[])
{
	
	System.out.println("\nenter email id");
	Scanner p1=new Scanner(System.in);
	String emailid=p1.next();

	System.out.println("\nenter password");
	Scanner p=new Scanner(System.in);

	String password=p.next();
	try
	{
	if(!password.equals("nemo123"))
	throw new user("Incorrect password");
	else
	{
	System.out.println("welcome user");
	}
	}
	catch(user e)
	{	
	System.out.println(e.getMessage());
	}

payment p2=new payment();

for(int i=0;i<=10;i++)
{
p2.accept1();
p2.accept2();
p2.accept3();
}
}
}

