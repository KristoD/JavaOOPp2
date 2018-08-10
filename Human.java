public class Human {
    public int strength = 3;
    public int intelligence = 3;
    public int stealth = 3;
    public int health = 100;
    public String className = "Human";

    public String attack(Human human) {
        human.health -= this.strength;
        return this.className + " has attacked " + human.className + " and dealt " + Integer.toString(this.strength) + " damage!";
    }

    public String displayHealth() {
        return this.className + "'s health is " + Integer.toString(this.health) + ".";
    }

}