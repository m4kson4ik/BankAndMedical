package medic.models;

public class Surgeon extends Doctor{
    @Override
    public void heal() {
        System.out.println("Хирург");
    }
}
