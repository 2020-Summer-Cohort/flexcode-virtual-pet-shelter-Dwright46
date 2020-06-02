package com.virtual_pet;

import org.junit.Test;

import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class VirtualPetShelterTest {
    VirtualPetShelter virtualShelterUnderTest  = new VirtualPetShelter();
    VirtualPet testPet1 = new VirtualPet("name","description");
    @Test
    public void shouldReturnName(){
        virtualShelterUnderTest.addPet(testPet1);
        VirtualPet retrievedPet  = virtualShelterUnderTest.getPetByName("name");
        assertThat(retrievedPet, is(testPet1));
    }
    @Test
    public void shouldReturnAllPets() {
        virtualShelterUnderTest.addPet(testPet1);
        Collection<VirtualPet> retrievedCollection = virtualShelterUnderTest.getAllPets();
        assertThat(1, is(retrievedCollection.size()));
    }
    @Test
    public void shouldReturnThreePets() {
        virtualShelterUnderTest.addPet(testPet1);
        virtualShelterUnderTest.addPet(new VirtualPet("name2", "description2"));
        virtualShelterUnderTest.addPet(new VirtualPet("name3", "description3"));
        Collection<VirtualPet> retrievedCollection = virtualShelterUnderTest.getAllPets();
        assertThat(3, is(retrievedCollection.size()));
    }
    @Test
    public void shouldFeedAllPets() {
        virtualShelterUnderTest.addPet(testPet1);
        virtualShelterUnderTest.addPet(new VirtualPet("name2", "description2"));
        virtualShelterUnderTest.addPet(new VirtualPet("name2", "description3"));
        virtualShelterUnderTest.feedAllPets();
        VirtualPet retrievedPet = virtualShelterUnderTest.getPetByName("name");
        assertThat(retrievedPet.getHunger(), is(5));
        retrievedPet = virtualShelterUnderTest.getPetByName("name2");
        assertThat(retrievedPet.getHunger(), is(5));
        retrievedPet = virtualShelterUnderTest.getPetByName("name3");
        assertThat(retrievedPet.getHunger(), is(5));
    }
    @Test
    public void shouldAdoptPet() {
        virtualShelterUnderTest.addPet(testPet1);
        virtualShelterUnderTest.adopt("name");
        Collection<VirtualPet> retrievedCollection = virtualShelterUnderTest.getAllPets();
        assertThat(0, is(retrievedCollection.size()));
    }
}
