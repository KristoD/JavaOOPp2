public class Wizard extends Human {

    public Wizard() {
        this.className = "Wizard";
        this.health = 50;
        this.intelligence = 8;
    }

    public String heal(Human human) {
        human.health += this.intelligence;
        return human.className + "'s health has been healed by " + Integer.toString(this.intelligence) + " points!";
    }

    public String fireball(Human human) {
        human.health -= this.intelligence * 3;
        return "The Wizard deals a massive blow to the " + human.className + " for " + Integer.toString(this.intelligence * 3) + " heath!";
    }
}