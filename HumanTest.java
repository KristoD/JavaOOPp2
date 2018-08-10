public class HumanTest {

    public static void main(String[] args) {
        Samurai jack = new Samurai();
        Samurai spam = new Samurai();
        Wizard gandolf = new Wizard();
        Ninja silent = new Ninja();
        System.out.println(jack.attack(gandolf));
        System.out.println(silent.attack(jack));
        System.out.println(gandolf.displayHealth());
        System.out.println(jack.displayHealth());

        System.out.println(gandolf.fireball(jack));
        System.out.println(jack.displayHealth());
        System.out.println(jack.deathBlow(gandolf));
        System.out.println(jack.displayHealth());
        System.out.println(gandolf.displayHealth());
        System.out.println(jack.meditate());
        System.out.println(jack.displayHealth());
        System.out.println(Samurai.howMany());
    }
}