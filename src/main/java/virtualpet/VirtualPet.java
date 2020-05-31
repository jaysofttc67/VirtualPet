package virtualpet;

public class VirtualPet {


    private String name;
    private int sleepy;
    private int hunger;
    private int boredom;
    private int thirsty;

    public VirtualPet(String name, int sleepy, int hunger, int boredom, int thirsty) {


        this.name = name;
        this.sleepy = sleepy;
        this.hunger = hunger;
        this.boredom = boredom;
        this.thirsty = thirsty;
    }


    public String getName() {
        return name;


    }

    public int getSleepy() {
        return sleepy;
    }

    public int getHunger() {
        return hunger;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getThirsty() {
        return thirsty;
    }


    public void tick() {
        sleepy += 1;
        hunger += 2;
        boredom += 2;
        thirsty += 1;
    }

    public void feed() {
        hunger -= 5;
        thirsty += 2;

    }

    public void playtime() {
        boredom += 3;

    }


}





