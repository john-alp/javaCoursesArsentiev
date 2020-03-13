package Clinic;

public class Pet {
    private String petName;
    private String petType;

    public Pet(String petName, String petType){
        this.petName = petName;
        this.petType = petType;
    }

    public void setPetName(String petName){
        this.petName = petName;
    }
    public String getPetName(){
        return petName;
    }
    public void setPetType(String petType){
        this.petType = petType;
    }
    public String getPetType(){
        return petType;
    }

    @Override
    public String toString() {
        return " " + petName + petType ;
    }
}
