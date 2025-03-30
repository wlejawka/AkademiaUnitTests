package Zadanie6.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import Zadanie6.Main.Exam;

public class ExamTest {
    @ParameterizedTest
    @CsvSource({
        "'B;B;_;B;B;B;B;B;_;B', 'ocena dobra (4,0)'",               // 4,0
        "'B;B;_;B;A;A;B;B;B;B', 'ocena niedostateczna (2,0)'",      // 2,0
        "'A;A;A;A;A;A;A;A;A;A', 'ocena niedostateczna (2,0)'",      // 2,0
        "'B;B;B;B;B;B;B;B;B;B', 'ocena bardzo dobra (5,0)'",        // 5,0
        "'_;_;_;_;_;_;_;_;_;_;', 'ocena niedostateczna (2,0)'",     // 2,0
        "'B;B;_;B;_;_;B;B;B;B', 'ocena dostateczna (3,0)'",         // 3,0
        "'B;B;B;B;B;B;B;B;B;_', 'ocena dobra plus (4,5)'",          // 4,5
        "'B;B;B;B;B;B;B;B;_;_', 'ocena dobra (4,0)'",               // 4,0
        "'B;B;B;B;B;B;B;B;A;_', 'ocena dostateczna plus (3,5)'",    // 3,5
        "'B;B;_;B;_;B;B;_;B;_', 'ocena niedostateczna (2,0)'"       // 2,0
    })
    public void examTestidyTest(String answers, String komunikat){
        //Arrange
        Exam exam = new Exam();
        //Act 
        String result = exam.calculateExam(answers);
        //Assert
        assertEquals(komunikat, result);

    }
}

