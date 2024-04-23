public interface Entity {
    public void display();
    public void move();
    public void die();
}

public class Goomba implements Entity {
    public void display() { ... }

    public void move() { ... }

    public void die() { ... }
}

public class Koopa implements Entity {
    public void display() { ... }

    public void move() { ... }

    public void die() { ... }
}

public class Boo implements Entity {
    public void display() { ... }

    public void move() { ... }

    public void die() { ... }
}

public class ejemploFactory {
    public static void main(String[] args) {
        int variable = 1;

        Entity enemy = null;

        switch (variable) {
            case 1:
                enemy = new Goomba();
                break;

            case 2:
                enemy = new Koopa();
                break;

            case 3:
                enemy = new Boo();
                break;

            default:
                break;
        }
    }
}

public class ejemploFactory {
    public static void main(String[] args) {
        int variable = 1;

        Entity enemy = createEnemy(variable);
    }

    private static Entity createEnemy(int tipo) {
        switch (tipo) {
            case 1:
                return new Goomba();

            case 2:
                return new Koopa();

            case 3:
                return new Boo();

            default:
                return null;
    }
}
