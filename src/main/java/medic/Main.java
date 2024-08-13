package medic;

import medic.models.Patient;

public class Main {
    public static void main(String[] args) {
        var patient = new Patient(0);
        patient.doctor.heal();
    }
}