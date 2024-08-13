package medic.models;

public class Therapist extends Doctor{
    @Override
    public void heal() {
        System.out.println("Терапевт");
    }
}
