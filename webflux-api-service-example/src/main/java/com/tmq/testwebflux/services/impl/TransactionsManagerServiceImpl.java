package com.tmq.testwebflux.services.impl;


import com.tmq.testwebflux.model.Transaction;
import com.tmq.testwebflux.persistances.TransactionPersistence;
import com.tmq.testwebflux.services.TransactionsManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class TransactionsManagerServiceImpl implements TransactionsManagerService {

    @Autowired
    TransactionPersistence transactionPersistence;

    @Override
    public Flux<Transaction> getTransactionsList() {
        return transactionPersistence.getAll();
    }

}
