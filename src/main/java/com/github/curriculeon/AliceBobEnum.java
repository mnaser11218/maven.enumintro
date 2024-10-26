package com.github.curriculeon;

public enum AliceBobEnum {
    BOB, ALICE;


    public String getCatchPhrase() {
        return "Hey, my name is " + this + "!" ;
    }

    public boolean isAlice() {
        return this == ALICE;
    }

    public boolean isBob() {
        return this == BOB;
    }
}
