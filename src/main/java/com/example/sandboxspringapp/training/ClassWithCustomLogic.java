package com.example.sandboxspringapp.training;

import org.springframework.context.annotation.Bean;


@Timed
public class ClassWithCustomLogic {
    int field1;
    int field2;

    public int getField1() {
        return field1;
    }

    public void setField1(int field1) {
        this.field1 = field1;
    }

    public int getField2() {
        return field2;
    }

    public void setField2(int field2) {
        this.field2 = field2;
    }

    public int sum() {
        return field1 + field2;
    }
}
