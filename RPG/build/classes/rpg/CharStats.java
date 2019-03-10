package rpg;

/*
 * @author MichaelKaylor
 */
import java.util.Scanner;

public class CharStats
{

    /**
     * @param health increases character health
     * @param armor increases armor effectiveness
     * @param mana increases mana
     * @param strength increases damage with melee attacks
     * @param dexterity increases damage with ranged weapons
     * @param intelligence increases damage with magic attacks and gives access
     * to higher level spells
     * @param level we all know what this does
     */
    private int health, armor, mana, strength, dexterity, intelligence;
    private int level;
    private String charClass;

    public CharStats()
    {
       
        Scanner in = new Scanner(System.in);
        System.out.println("What class");
        charClass = in.next();
        System.out.println("What level");
        level = in.nextInt();
        switch (charClass)
        {
            case "Mage":
                health = 50;
                armor = 0;
                mana = 100;
                strength = 0;
                dexterity = 0;
                intelligence = 10;
                break;

            case "Knight":
                health = 100;
                armor = 5;
                mana = 10;
                strength = 10;
                dexterity = 0;
                intelligence = 0;
                break;

            case "Ranger":
                health = 75;
                armor = 2;
                mana = 20;
                strength = 0;
                dexterity = 10;
                intelligence = 0;
                break;

            default:
                break;
        }
        System.out.println("Health: " + (level * health) + "\n" + "Armor: " + (level * armor) + "\n" + "Mana: " + (level * mana)
                + "\n" + "Strength: " + (level * strength) + "\n" + "Dexterity: " + (level * dexterity) + "\n" + "Intelligence: " + (level * intelligence));

    }

}
