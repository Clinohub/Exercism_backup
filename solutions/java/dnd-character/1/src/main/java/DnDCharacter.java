import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

class DnDCharacter {
    private int strength = ability(rollDice());
    private int dexterity = ability(rollDice());
    private int constitution = ability(rollDice());
    private int intelligence = ability(rollDice());
    private int wisdom = ability(rollDice());
    private int charisma = ability(rollDice());

    int ability(List<Integer> scores) {
        List<Integer> scoreList = new ArrayList<> (scores);
        Collections.sort(scoreList);
        scoreList.remove(0);
        
        int abilityScore = 0;
        
        for (int score: scoreList) {
            abilityScore += score;
        }
        return abilityScore;
    }

    List<Integer> rollDice() {
        List<Integer> dice = new ArrayList<> ();
        
        for (int i = 0; i < 4; i++) {
            dice.add(roll());
        }

        return dice;
    }

    int modifier(int input) {
        return Math.floorDiv((input - 10), 2);
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return modifier(getConstitution()) + 10;
    }

    private static int roll() {
        return (int)(Math.random()*6) + 1;
    }
}
