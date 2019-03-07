package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;


public class MainUI {
	 static AccountService ai=new AccountServiceImpl();
	 static Scanner sc=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainUI ui=new MainUI();
		ui.choice();
	}

	public  void choice()
	{
System.out.println("entr ur choice");
int ch=sc.nextInt();
switch(ch)
{
case 1:System.out.println("enter mobile num");
String mobileNo=sc.next();
	ai.getAccountDetails(mobileNo);
	
	   break;
case 2:System.out.println("enter mobile num");
String mobileNo1=sc.next();
	System.out.println("enter recharge amount");
double amt=sc.nextDouble();

	ai.rechargeaccount(mobileNo1,amt);
	break;
case 3:System.exit(0);
}
	
}
}


