package com.virtual_pet;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VirtualPetTest {
    VirtualPet underTest = new VirtualPet("name", 5, 5, 5, 5, 5, 5, 5, 5);

    @Test
    public void shouldReturnHunger() {
        int check = underTest.getHunger();
        assertEquals(check, 5);
    }


    @Test
    public void shouldReturnThirst() {
        int check = underTest.getThirst();
        assertEquals(check, 5);
    }

    @Test
    public void shouldReturnWatered() {
        int check = underTest.getWatered();
        assertEquals(check, 5);
    }

    @Test
    public void shouldReturnBored() {
        int check = underTest.getBoredom();
        assertEquals(check, 5);
    }

    @Test
    public void shouldReturnTired() {
        int check = underTest.getTired();
        assertEquals(check, 5);
    }

    @Test
    public void shouldReturnRest() {
        int check = underTest.getRest();
        assertEquals(check, 5);
    }
}

