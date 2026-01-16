package com.vedget.accounts.service.impl;

import com.vedget.accounts.controller.constants.AccountsConstants;
import com.vedget.accounts.dto.CustomerDto;
import com.vedget.accounts.entity.Accounts;
import com.vedget.accounts.entity.Customer;
import com.vedget.accounts.mapper.CustomerMapper;
import com.vedget.accounts.repository.AccountsRepository;
import com.vedget.accounts.repository.CustomerRepository;
import com.vedget.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service @AllArgsConstructor
public class AccountsService implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {
        Customer customer= CustomerMapper.mapToCustomer(customerDto,new Customer());
        Customer savedCustomer=customerRepository.save(customer);
        accountsRepository.save(createNewAccount(savedCustomer));
    }

    private Accounts createNewAccount(Customer customer) {
        Accounts newAccount =new Accounts();
        newAccount.setCustomerId(customer.getCustomerId());
        long accountNumber =1000_000_000+new Random().nextInt(9_000_000_00);
        newAccount.setAccountNumber(accountNumber);
        newAccount.setAccountType(AccountsConstants.SAVINGS);
        return newAccount;
    }
}
