package Enum;

public enum Animal {
    DOG("sobaka"), CAT("koshka"), FROG("lagushka");
    private String translation;

    private Animal(String translation){
        this.translation = translation;
    }
    public String getTranslation(){
        return translation;
    }
    public String toString(){
        return "Perevod na russkiy yazik "+translation;
    }
}
