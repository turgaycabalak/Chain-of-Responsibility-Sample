package com.chainofresponsibility.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Layer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * it will be set for every condition
     */
    private String fieldN;

    /**
     * 1 -> field1 and field2 will be set. rest null
     * 2 -> field3 and field4 will be set. rest null
     */
    private int selection1;
    private int selection2;

    private String field1;
    private String field2;

    private String field3;
    private String field4;

}
