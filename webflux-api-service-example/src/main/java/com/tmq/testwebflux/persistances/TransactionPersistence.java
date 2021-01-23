package com.tmq.testwebflux.persistances;


import com.tmq.testwebflux.model.Transaction;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * This interface represents a persistence layer of your application
 *
 * @author slinkydeveloper
 */
public interface TransactionPersistence {

    Flux<Transaction> getAll();

    List<Transaction> getFilteredTransactions(Predicate<Transaction> p);

    Optional<Transaction> getTransaction(String transactionId);

    Transaction addTransaction(Transaction t);

    boolean removeTransaction(String transactionId);

    boolean updateTransaction(String transactionId, Transaction transaction);
}
