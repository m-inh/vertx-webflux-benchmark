package com.tmq.testwebflux.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Data object that represents a persistence
 *
 * @author slinkydeveloper
 */
@Getter
@Setter
@AllArgsConstructor
public class Transaction {

    private String id;
    private String message;
    private String from;
    private String to;
    private Double value;

}
