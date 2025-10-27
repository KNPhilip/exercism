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
        return fighter.isVulnerable() ? 10 : 6;
    }
}

final class Wizard extends Fighter {
    private boolean hasPreparedSpell;
    
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    public boolean isVulnerable() {
        return !hasPreparedSpell;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        return hasPreparedSpell ? 12 : 3;
    }

    public void prepareSpell() {
        hasPreparedSpell = true;
    }
}
