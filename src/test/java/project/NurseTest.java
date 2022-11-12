package project;

import hospital.Nurse;
import hospital.Patient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NurseTest {
    Nurse underTest = new Nurse("2", "name", 5);
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthLevelOfPatientFrom10To15WhenProvidingCare() {
        underTest.careForPatient(sickPatient);
        int HealthLevel = sickPatient.getHealthLevel();
        assertEquals(15, HealthLevel);
    }

    @Test
    public void decreaseBloodLevelFrom20To15WhenDrawingBlood() {
        underTest.drawBloodLevel(sickPatient);
        int BloodLevel = sickPatient.getBloodLevel();
        assertEquals(15, BloodLevel);
    }

    @Test
    public void shouldExpectASalaryOf50k(){
        int salary = underTest.calculatePay();
        assertEquals(80000, salary);
    }
}
