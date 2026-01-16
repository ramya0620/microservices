package com.vedget.accounts.service;

import com.vedget.accounts.dto.CustomerDto;

public interface IAccountsService {

     /**
      *
      * @param customerDto -->CustomerDto Object
      */
     void createAccount(CustomerDto customerDto);
}
