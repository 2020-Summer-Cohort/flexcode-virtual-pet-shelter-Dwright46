package com.virtual_pet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    String description;

    Map<String, VirtualPet> petList = new HashMap<>();
    public VirtualPet getPetByName(String petName) {
        return petList.get(petName); }

    public void addPet(VirtualPet pet) {
        petList.put(pet.getName(), pet); }

    public Collection<VirtualPet> getAllPets() {
        return petList.values(); }

    public void adopt(String petName) {
        petList.remove(petName); }

        public void feedAllPets() {
        petList.values().forEach(VirtualPet::feedPet); }
}
