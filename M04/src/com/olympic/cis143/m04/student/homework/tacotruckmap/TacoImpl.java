package com.olympic.cis143.m04.student.homework.tacotruckmap;

import java.util.UUID;

public class TacoImpl {

    public enum Protien {
        CHICKEN,
        BEEF,
        PORK,
        BEAN
    }

    private Protien protien;

    private boolean hasCheeze;

    public final UUID orderNumber = UUID.randomUUID();

    public TacoImpl(Protien protien, boolean hasCheeze) {
        this.protien = protien;
        this.hasCheeze = hasCheeze;
    }

    public boolean equals(TacoImpl tacoOrder) {
        return this.orderNumber.equals(tacoOrder.orderNumber);
    }
}
