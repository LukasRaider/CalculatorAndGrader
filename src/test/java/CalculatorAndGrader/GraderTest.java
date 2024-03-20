package CalculatorAndGrader;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    void FiftyNineShouldReturnF(){
        var grader = new Grader();
        assertEquals('F',grader.determineLetterGrade(59));
    }
    @Test
    void SixtyNineShouldReturnD(){
        var grader = new Grader();
        assertEquals('D',grader.determineLetterGrade(69));
    }
    @Test
    void SeventyNineShouldReturnC(){
        var grader = new Grader();
        assertEquals('C',grader.determineLetterGrade(79));
    }
    @Test
    void EightyNineShouldReturnB(){
        var grader = new Grader();
        assertEquals('B',grader.determineLetterGrade(89));
    }
    @Test
    void NinetyNineShouldReturnA(){
        var grader = new Grader();
        assertEquals('A',grader.determineLetterGrade(99));
    }
    @Test
    void NinetyShouldReturnA(){
        var grader = new Grader();
        assertEquals('A',grader.determineLetterGrade(90));
    }
    @Test
    void EightyShouldReturnB(){
        var grader = new Grader();
        assertEquals('B',grader.determineLetterGrade(80));
    }
    @Test
    void SeventyShouldReturnC(){
        var grader = new Grader();
        assertEquals('C',grader.determineLetterGrade(70));
    }
    @Test
    void SixtyShouldReturnD(){
        var grader = new Grader();
        assertEquals('D',grader.determineLetterGrade(60));
    }
    @Test
    void FiftyShouldReturnF(){
        var grader = new Grader();
        assertEquals('F',grader.determineLetterGrade(50));
    }
    @Test
    void ZeroShouldReturnF(){
        var grader = new Grader();
        assertEquals('F',grader.determineLetterGrade(0));
    }
    @Test
    void NegativeOneShouldReturnIllegalArgumentException(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                ()-> {
                    grader.determineLetterGrade(-1);
                });
    }
}