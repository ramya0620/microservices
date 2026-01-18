package com.vedget.accounts.service;

import com.vedget.accounts.dto.CustomerDto;

public interface IAccountsService {

     /**
      *
      * @param customerDto -->CustomerDto Object
      */
     void createAccount(CustomerDto customerDto);

     /**
      *
      * @param mobileNumber -->Input mobile number
      * @return account details based on the mobile number
      */
     CustomerDto fetchAccount(String mobileNumber);

     /**
      *
      * @param customerDto
      * @return
      */
     boolean updateAccount(CustomerDto customerDto);

     /**
      *
      * @param mobileNumber --input mobile number
      * @return boolean indiacting the deletion of account is successful or not
      */
     boolean deleteAccount(String mobileNumber);
}
