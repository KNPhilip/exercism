public class Fighter {
    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

final class Warrior extends Fighter {
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()) {
            return 10;
        }
        else {
            return 6;
        }
    }
}

final class Wizard extends Fighter {
    private boolean vulnerable = true;
    
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    public boolean isVulnerable() {
        return vulnerable;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        if (vulnerable) {
            return 3;
        }
        else {
            return 12;
        }
    }

    public void prepareSpell() {
        vulnerable = false;
    }
}
