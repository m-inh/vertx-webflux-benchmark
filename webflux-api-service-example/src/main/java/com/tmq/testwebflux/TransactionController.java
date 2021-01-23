package com.tmq.testwebflux;

import com.tmq.testwebflux.model.Transaction;
import com.tmq.testwebflux.services.TransactionsManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * Author : Tran Minh Quy
 * Email: quy.tm@teko.vn
 * Jan 23, 2021
 */
@RestController
@RequestMapping(value = "/api/transactions")
public class TransactionController {

    @Autowired
    TransactionsManagerService transactionsManagerService;

    @GetMapping
    public Flux<Transaction> getAllEmployees() {
        return transactionsManagerService.getTransactionsList();
    }

}
