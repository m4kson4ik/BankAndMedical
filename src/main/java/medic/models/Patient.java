package medic.models;

public class Patient {
    public Doctor doctor;
    public int planHeal;

    public Patient(int planHeal) {
        this.planHeal = planHeal;
         switch (planHeal) {
            case 1 :  doctor = new Surgeon();
            break;
            case 2 : doctor = new Dentist();
            break;
            default: doctor = new Therapist();
        };
    }
}
