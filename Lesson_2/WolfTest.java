public class WolfTest {
    public static void main(String[] args) {
        Wolf firstWolf = new Wolf();
        firstWolf.setSex("Female");
        firstWolf.setName("Julie");
        firstWolf.setWeight(38);
        firstWolf.setAge(5);
        firstWolf.setColor("Black");
        System.out.printf("Пол - %s%nКличка - %s%nВес - %d%nВозраст - %d%nОкрас - %s%n", 
                firstWolf.getSex(), firstWolf.getName(), firstWolf.getWeight(), 
                firstWolf.getAge(), firstWolf.getColor());
        firstWolf.walk();
        firstWolf.sit();
        firstWolf.run();
        firstWolf.howl();
        firstWolf.hunt();
    }
}