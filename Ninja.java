public class Ninja extends Human {

    public Ninja() {
        this.className = "Ninja";
        this.stealth = 10;
    }

    public String steal(Human human) {
        human.health -= this.stealth;
        this.health += this.stealth;
        return human.className + "'s health has been leeched by " + Integer.toString(this.stealth) + " points!";
    }

    public String runAway() {
        this.health -= 10;
        return "The Ninja flees from combat! 10 health has been lost!";
    }
}