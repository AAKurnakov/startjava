public class WolfTest {
    public static void main(String[] args) {
        Wolf firstWolf = new Wolf();
        firstWolf.sex = "Female";
        firstWolf.name = "Julie";
        firstWolf.weight = 40;
        firstWolf.age = 5;
        firstWolf.color = "Black";
        System.out.printf("Пол - %s%nКличка - %s%nВес - %d%nВозраст - %d%nОкрас - %s%n", 
                firstWolf.sex, firstWolf.name, firstWolf.weight, firstWolf.age, firstWolf.color);
        firstWolf.walk();
        firstWolf.sit();
        firstWolf.run();
        firstWolf.howl();
        firstWolf.hunt();
    }
}