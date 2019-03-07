package com.cg.mra.service;

import com.cg.mra.model.Account;

public interface AccountService {
 Account getAccountDetails(String mobileNo);
 int rechargeaccount(String mobileNo,double rechargeAmmount);
}
 