package Lesson7;

class Therapist extends Doctor {
    @Override
    public void heal() {
        System.out.println("Therapist is healing your desease");
    }


    public void healPlan(Patient patient)
    {
        switch (patient.getHealPlan()){
            case 1:
                Surgeon surgeon = new Surgeon();
                surgeon.heal();
                break;
            case 2:
                Dentist dentist = new Dentist();
                dentist.heal();
                break;
            default:
                Therapist therapist = new Therapist();
                therapist.heal();
                break;
        }
    }
}
