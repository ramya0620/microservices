package com.vedget.accounts.mapper;

import com.vedget.accounts.dto.AccountsDto;
import com.vedget.accounts.dto.CustomerDto;
import com.vedget.accounts.entity.Accounts;
import com.vedget.accounts.entity.Customer;

public class CustomerMapper {

    public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto){
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }
    public static Customer mapToCustomer( CustomerDto customerDto,Customer customer){
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;
    }
}
