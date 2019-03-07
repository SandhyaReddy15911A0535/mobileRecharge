package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.mra.model.Account;
import com.cg.mra.ui.MainUI;

public class AccountDaoImpl implements AccountDao {
	MainUI u=new MainUI();
		Scanner sc=new Scanner(System.in);
		Map<String,Account>m=new HashMap<String,Account>();

	
		public AccountDaoImpl()
		{
		
			m.put("9652573387",new Account("prepaid","sandhya",200.00));
			m.put("9951151430",new Account("prepaid","saritha",100.00));
			
		}
			Account a=new Account();
	
	
	@Override
	public Account getAccountDetails(String mobileNo) {
		// TODO Auto-generated method stub
		if(m.containsKey(mobileNo))
		{
			/*System.out.println("enter the amount for recharge");
			double rechargeAmount=sc.nextDouble();
			rechargeaccount(mobileNo,rechargeAmount);*/
			a=m.get(mobileNo);
			System.out.println(" your current balance is"+a.getAccountBalance());
			
			u.choice();
			
		}
		else 
			System.out.println("error acc id does not exists");
	return a;
		
	}

	@Override
	public int rechargeaccount(String mobileNo1, double amt) {
		// TODO Auto-generated method stub
		//System.out.println("enter mobile num");
		//String phnum=sc.next();
		//System.out.println("enter the amount for recharge");
		//double rechargeAmount=sc.nextDouble();
		//a=m.get(mobileNo);
	//double exbal=a.getAccountBalance();
	//int i=0;
		double nbal=0;
		if(m.containsKey(mobileNo1))
		{
			a=m.get(mobileNo1);
			 nbal=amt+a.getAccountBalance();
			 a.setAccountBalance(nbal);
			 m.replace(mobileNo1, a);
			 System.out.println("successfully recharged");
			System.out.println("hello"+" "+a.getCustomerName()+" "+" ur available bal is "+" "+nbal);
			u.choice();
		}
		else
		{
			System.out.println("unsuccessfull n try again");
		}
		
		return (int)nbal;
	}

}
