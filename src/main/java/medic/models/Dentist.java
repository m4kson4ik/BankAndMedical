package medic.models;

public class Dentist extends Doctor{
    @Override
    public void heal() {
        System.out.println("Дантисит");
    }
}
