public class Samurai extends Human {
    private static int samuraiCount;
    public Samurai() {
        this.className = "Samurai";
        this.health = 200;
        samuraiCount += 1;
    }

    public String deathBlow(Human human) {
        human.health -= human.health;
        this.health -= this.health / 2;
        return "The Samurai one shots the " + human.className + ". The samurai has lost half their health.";
    }

    public String meditate() {
        this.health += this.health / 2;
        return "The Samurai meditates and heals back half their health.";
    }

    public static String howMany() {
        return "There are a total of " + Integer.toString(samuraiCount) + " Samurai's around.";
    }
}