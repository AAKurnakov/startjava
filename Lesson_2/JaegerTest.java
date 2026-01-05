public class JaegerTest {
    public static void main(String[] args) {
        Jaeger robot1 = new Jaeger();
        robot1.setName("Gipsy Danger");
        robot1.setHeight(79.25);
        robot1.setWeight(1.98);
        robot1.setSpeed(7);
        robot1.setArmor(6);
        robot1.setStrength(8);

        Jaeger robot2 = new Jaeger("Cherno Alpha", 85.34, 2.41, 3, 10, 10);
        if (robot1.getSpeed() > robot2.getSpeed()) {
            System.out.printf("Робот %s быстрее %s", robot1.getName(), robot2.getName());
        }

        if (robot1.getArmor() < robot2.getArmor()) {
            System.out.printf("%nРобот %s бронированнее %s", robot2.getName(), robot1.getName());
        }
    }
}