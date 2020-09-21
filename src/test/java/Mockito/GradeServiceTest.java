package Mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import stub.GradeService;
import stub.GradeSystem;

import java.util.Arrays;

import static org.mockito.Mockito.when;

public class GradeServiceTest {
    GradeService gradeService;
    GradeSystem gradeSystem;

    @BeforeEach
    public void setup() {
        gradeSystem = Mockito.mock(GradeSystem.class);
        gradeService = new GradeService(gradeSystem);
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        int studentId = 1;
        when(gradeSystem.gradesFor(studentId)).thenReturn(Arrays.asList(80.0, 90.0, 100.0));
        double result = gradeService.calculateAverageGrades(studentId);
        Assertions.assertEquals(90.0, result);
    }
}
