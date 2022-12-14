package project;

import hospital.Patient;
import hospital.Surgeon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SurgeonTest {

    Surgeon underTest = new Surgeon("1", "name", "speciality",true);
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthLevelOfPatientFrom10To20WhenProvidingCare() {
        underTest.careForPatient(sickPatient);
        int patientHealthLevel = sickPatient.getHealthLevel();
        assertEquals(20, patientHealthLevel);
    }

    @Test
    public void decreaseBloodLevelFrom20To15WhenDrawingBlood(){
        underTest.drawBloodLevel(sickPatient);
        int BloodLevel = sickPatient.getBloodLevel();
        assertEquals(15,BloodLevel);
    }

    @Test
    public void shouldExpectASalaryOf100k() {
        int salary = underTest.calculatePay();
        assertEquals(100000, salary);
    }
}
