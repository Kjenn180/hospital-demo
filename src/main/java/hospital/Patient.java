package hospital;

public class Patient {

    private int healthLevel;
    private int bloodLevel;

    public int getHealthLevel() {
        return healthLevel;
    }
    public int getBloodLevel(){
        return bloodLevel;
    }

    //default constructor for patient object
    public Patient() {
        healthLevel = 10; //default patient health level
        bloodLevel = 20; //default patent blood level
    }

    //overloaded constructor (constructors aver very popular areas to overload)
    public Patient(int healthLevel, int bloodLevel) {
        this.healthLevel = healthLevel;
        this.bloodLevel = bloodLevel;
    }
    public void increaseHealthLevel(int healthIncreaseAmount) {
        healthLevel += healthIncreaseAmount;
    }

    public void decreaseBloodLevel(int bloodDecreaseAmount) {
        bloodLevel -= bloodDecreaseAmount;
    }
}
