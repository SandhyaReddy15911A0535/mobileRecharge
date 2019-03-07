package com.cg.mra.dao;

import java.util.Map;
import java.util.Scanner;

import com.cg.mra.model.Account;

public interface AccountDao {
	Account getAccountDetails(String mobileNo);
	int rechargeaccount(String mobileNo,double rechargeAmmount);

}

