package isrelationship;

class Defence{
    String cds;
    double budget;

    Defence(String cds, double budget){
        this.cds = cds;
        this.budget = budget;
    }

    void showDefenseDetails(){
        System.out.println("CDS: "+cds);
        System.out.println("Budget: "+budget);
    }
}

class Army extends Defence{
    String armyChief;
    String typeOfAttack;
    int jawan;

    Army(String cds, double budget, String armyChief, String typeOfAttack, int jawan){
        super(cds, budget);
        this.armyChief = armyChief;
        this.typeOfAttack = typeOfAttack;
        this.jawan = jawan;
    }

    void showArmyDetails(){
        showDefenseDetails();
        System.out.println("Chief of Army: "+armyChief);
        System.out.println("Type of Attack: "+typeOfAttack);
        System.out.println("Number of Jawan: "+jawan);
    }
}

class Navy extends Defence{
    String admiral;
    String typeOfAttack;
    int sailor;

    Navy(String cds, double budget, String admiral, String typeOfAttack, int sailor){
        super(cds, budget);
        this.typeOfAttack = typeOfAttack;
        this.admiral = admiral;
        this.sailor = sailor;
    }

    void showNavyDetails(){
        showDefenseDetails();
        System.out.println("Chief of Navy: "+admiral);
        System.out.println("Type of Attack: "+typeOfAttack);
        System.out.println("Number of Sailor: "+sailor);
    }
}
public class DefenceDriver {
    public static void main(String[] args) {
        Army army = new Army("Manoj Chauhan", 59370000, "Manoj Pandey", "land", 1700000);
        army.showArmyDetails();

        System.out.println("==================================");

        Navy navy = new Navy("Manoj Chauhan", 59370000, "R Hari Kumar", "Sea", 1200000);
        navy.showNavyDetails();
    }
}
