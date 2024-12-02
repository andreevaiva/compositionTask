public class Main {

    public static void main(String[] args){
        Wizard wizard = new Wizard("Merlin",100, 10,5);
        Warrior warrior = new Warrior("Ragnar",100,7,10);
        Archer archer = new Archer("Magnus", 100, 10, 8);
        // Task 5: Create an object/instance of your new character's class.

        System.out.println(wizard.getName() + "'s health: " + wizard.getHealth());
        System.out.println(warrior.getName()+"'s health: " + warrior.getHealth());
        System.out.println(archer.getName()+"'s health: " + archer.getHealth());
        System.out.println("Game is starting...");
        System.out.println();

        wizard.setHealth(warrior,true, archer, false);
        System.out.println( warrior.getName()+" attacks " + wizard.getName() + ". Health updated: " + wizard.getHealth());

        archer.setHealth(wizard,true, warrior, false);
        System.out.println( wizard.getName()+" attacks " + archer.getName() + ". Health updated: " + archer.getHealth());

        warrior.setHealth(wizard,false, archer, true);
        System.out.println( archer.getName()+" attacks " + warrior.getName() + ". Health updated: " + warrior.getHealth());

        // Task 6: make the wizard attack your new character.
        // Task 7: display the new stats


        // CHALLENGE: Update your program for all the characters to be able to attack each other.
    }
}


class Wizard {
    private String name;
    private int health;
    private int darkMagic;
    private int wizardArmor;

    public Wizard(String name, int health, int darkMagic, int wizardArmor){
        this.name = name;
        this.health = health;
        this.darkMagic = darkMagic;
        this.wizardArmor = wizardArmor;
    }

    public String getName() {
        return name;
    }

    public int getDarkMagic(){
        return darkMagic;
    }

    public void setHealth(Warrior warrior, boolean warriorAttack, Archer archer, boolean archerAttack) {
        if(warriorAttack){
            health = health - (warrior.getSword() - wizardArmor);
        }
        if(archerAttack){
            health = health - (archer.getPower() - wizardArmor);
        }
    }

    public int getHealth() {
        return health;
    }

}

class Warrior {
    private String name;
    private int health;
    private int sword;
    private int metalArmor;

    public Warrior(String name, int health, int sword, int metalArmor){
        this.name = name;
        this.health = health;
        this.sword = sword;
        this.metalArmor = metalArmor;
    }

    public String getName() {
        return name;
    }

    public int getSword() {
        return sword;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(Wizard wizard, boolean wizardAttack, Archer archer, boolean archerAttack) {
        if(wizardAttack){
            health = health - (wizard.getDarkMagic() - metalArmor);
        }
        if(archerAttack){
            health = health - (archer.getPower() - metalArmor);
        }
    }

}

class Archer{
    private String name;
    private int health;
    private int power;
    private int armor;

    public Archer(String name, int health, int power, int armor){
        this.name = name;
        this.health = health;
        this.power = power;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getPower() {
        return power;
    }
    public int getArmor() {
        return armor;
    }
    public void setHealth(Wizard wizard, boolean wizardAttack, Warrior warrior, boolean warriorAttack){
        if(wizardAttack){
            health=health - (wizard.getDarkMagic() - armor);
        }
        if(warriorAttack){
            health=health - (warrior.getSword() - armor);
        }
    }
}

// Task 1: Write another class here for a different type of character (e.g. archer)

// Task 2: Write instance variables

// Task 3: Write the constructor

// Task 4: Write the necessary getter(accessor) and setter(modifier) methods.
