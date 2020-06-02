package com.virtual_pet;

public class VirtualPet {
    private String name;
    private String description;
    // private String firstName;
    private int hunger;
    private int feed;
    private int thirst;
    private int water;
    private int boredom;
    private int play;
    private int tired;
    private int rest;



    public VirtualPet(String name, String description) {
        this.name = name;
        this.description = description;
    }



    public int feedPet() {
        setHunger(getHunger() + 5);
        return getHunger();
    }

    public int water() {
        setThirst(getThirst() - 5);
        return getThirst();
    }

    public int playWithPet() {
        setBoredom(getBoredom() - 5);
        return getBoredom();
    }

    public void tick() {
        setHunger(getHunger() - 5);
        setThirst(getThirst() - 5);
        setBoredom(getBoredom() - 5);
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }


    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }



    public int getWatered() {
        return water;
    }
    public int getTired() { return tired; }
    public int getRest() { return rest; }
    private void setName(String name) {
        this.name = name;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }


}



