import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Arrays;
import java.lang.Math;

public final class DnDCharacter {
    public static String[] abilityNames = { "strength", "dexterity", "constitution", "intelligence", "wisdom", "charisma" };
    public HashMap<String, Integer> characterAbilities = new HashMap<String, Integer>();

    public DnDCharacter() {
        for (int i = 0; i < 6; i++) {
            List<Integer> diceList = rollDice();
            characterAbilities.put(abilityNames[i], ability(diceList));
        }
        characterAbilities.put("hp", 10 + modifier(getConstitution()));
    }

    public int ability(List<Integer> scores) {
        Integer[] abilityDiceList = scores.toArray(new Integer[0]);
        Arrays.sort(abilityDiceList);

        int abilityValue = 0;
        
        for (int j = 1; j < 4; j++) {
           abilityValue += abilityDiceList[j];
        }
        return abilityValue;
    }

    public List<Integer> rollDice() {
        List<Integer> diceList = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            diceList.add(rand.nextInt(6) + 1);
        }
        return diceList;
    }

    public int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
    }

    public int getStrength() {
        return characterAbilities.get("strength");
    }

    public int getDexterity() {
        return characterAbilities.get("dexterity");
    }

    public int getConstitution() {
        return characterAbilities.get("constitution");
    }

    public int getIntelligence() {
        return characterAbilities.get("intelligence");
    }

    public int getWisdom() {
        return characterAbilities.get("wisdom");
    }

    public int getCharisma() {
        return characterAbilities.get("charisma");
    }

    public int getHitpoints() {
        return characterAbilities.get("hp");
    }
}
