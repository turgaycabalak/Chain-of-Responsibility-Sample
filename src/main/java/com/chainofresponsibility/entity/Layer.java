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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFieldN() {
        return fieldN;
    }

    public void setFieldN(String fieldN) {
        this.fieldN = fieldN;
    }

    public int getSelection1() {
        return selection1;
    }

    public void setSelection1(int selection1) {
        this.selection1 = selection1;
    }

    public int getSelection2() {
        return selection2;
    }

    public void setSelection2(int selection2) {
        this.selection2 = selection2;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }
}
