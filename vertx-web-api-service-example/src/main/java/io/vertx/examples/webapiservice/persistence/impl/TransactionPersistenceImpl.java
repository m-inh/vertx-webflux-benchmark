package io.vertx.examples.webapiservice.persistence.impl;

import io.vertx.examples.webapiservice.models.Transaction;
import io.vertx.examples.webapiservice.persistence.TransactionPersistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * In memory implementation of transaction persistence
 *
 * @author Francesco Guardiani @slinkydeveloper
 */
public class TransactionPersistenceImpl implements TransactionPersistence {

    private Map<String, Transaction> transactions;

    public TransactionPersistenceImpl() {
        transactions = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < 1; i++) {
            String id = String.valueOf(i);
            Transaction transaction = new Transaction(id, "Message for txn " + id, "from", "to",
                    random.nextInt(100) / 10.0);
            transactions.put(id, transaction);
        }
    }

    @Override
    public List<Transaction> getFilteredTransactions(Predicate<Transaction> p) {
        return transactions.values().stream().filter(p).collect(Collectors.toList());
    }

    @Override
    public Optional<Transaction> getTransaction(String transactionId) {
      return Optional.ofNullable(transactions.get(transactionId));
    }

    @Override
    public Transaction addTransaction(Transaction t) {
      transactions.put(t.getId(), t);
      return t;
    }

    @Override
    public boolean removeTransaction(String transactionId) {
      Transaction t = transactions.remove(transactionId);
      if (t != null) return true;
      else return false;
    }

    @Override
    public boolean updateTransaction(String transactionId, Transaction transaction) {
      Transaction t = transactions.replace(transactionId, transaction);
      if (t != null) return true;
      else return false;
    }
}
