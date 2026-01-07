public class Player {
    private String name;
    
    public Player(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя игрока не может быть пустым");
        }
        this.name = name.trim();
    }

    public String getName() {
        return name;
    }
}