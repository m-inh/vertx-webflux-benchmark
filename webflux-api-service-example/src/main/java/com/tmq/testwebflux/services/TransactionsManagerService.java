package com.tmq.testwebflux.services;


import com.tmq.testwebflux.model.Transaction;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * This interface describes the Transactions Manager Service. Note that all methods has same name of corresponding operation id
 */
public interface TransactionsManagerService {

//    void getTransactionsList(List<String> from, List<String> to, List<String> message);
    Flux<Transaction> getTransactionsList();

//    void createTransaction(Transaction body);
//
//    void getTransaction(String transactionId);
//
//    void updateTransaction(String transactionId, Transaction body);
//
//    void deleteTransaction(String transactionId);

}
