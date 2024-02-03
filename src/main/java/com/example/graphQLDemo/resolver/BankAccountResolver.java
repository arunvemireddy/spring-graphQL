package com.example.graphQLDemo.resolver;

import com.example.graphQLDemo.resolver.domain.bank.BankAccount;
import com.example.graphQLDemo.resolver.domain.bank.Currency;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
@Slf4j
public class BankAccountResolver implements GraphQLQueryResolver {
    public BankAccount bankAccount(UUID id){
        log.info("retriving bank account {}",id);
        return  BankAccount.builder().id(id).currency(Currency.USD).name("arun").build();
    }
}
