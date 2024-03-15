package zadanie6.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import zadanie6.Main.*;

public class ExamTest {
    @ParameterizedTest
    @ValueSource(strings={"A;A;A;A;A;A;A;A;A;A;"})
    public void examTestidyTest(String answers){
        //Arrange
        Exam exam = new Exam();
        //Act 
        String result = exam.calculateExam(answers);
        //Assert
        assertEquals("bardzo dobry", result);

    }


    }
}
