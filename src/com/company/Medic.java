package com.company;

public class Medic extends Hero{
    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Medic применил суперспособность CRITICAL DAMAGE... И нанес боссу 250 урона";

    }

    @Override
    protected void applySuperAbility() {

    }
}
