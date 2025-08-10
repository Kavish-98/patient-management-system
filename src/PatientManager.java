import java.util.List;
import java.util.ArrayList;

public class PatientManager {
    private List<Patient> patients = new ArrayList<>();

public void addPatient(String name, int age, String gender, String diagnosis) {
    Patient patient = new Patient(name, age, gender, diagnosis);
    patients.add(patient);
    System.out.println("Patient added with ID: " + patient.getId());
}
public void viewAllPatients() {
    if (patients.isEmpty()) {
        System.out.println("Patient list is empty");
    }
    for (Patient patient : patients) {
        System.out.println(patient);
    }
}
public void searchPatientByID(String id) {
    for (Patient patient : patients) {
        if (patient.getId().equals(id)) {
            System.out.println(patient);
            return;
        }
    }
    System.out.println("Patient not found");
}
public void updatePatient(int id, String name, int age, String gender, String diagnosis) {
    Patient patient = patients.get(id);
    patient.setName(name);
    patient.setAge(age);
    patient.setGender(gender);
    patient.setDiagnosis(diagnosis);
    System.out.println("Patient updated");

}
public void deletePatient(int id) {
    Patient patient = patients.get(id);
    patients.remove(patient);
    System.out.println("Patient removed");
}

}
