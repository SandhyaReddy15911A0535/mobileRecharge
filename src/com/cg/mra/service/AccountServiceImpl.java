package com.cg.mra.service;

import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.model.Account;
import com.cg.mra.ui.MainUI;

public class AccountServiceImpl  implements AccountService{
	
	AccountDao ai=new AccountDaoImpl();
	
		@Override
		public Account getAccountDetails(String mobileNo) {
			
			
			ai.getAccountDetails(mobileNo);
			
			return null;
			// TODO Auto-generated method stub
			
		}

		@Override
		public int rechargeaccount(String mobileNo, double rechargeAmmount) {
			// TODO Auto-generated method stub
			 return ai.rechargeaccount(mobileNo, rechargeAmmount);
			
		}
		
	}


