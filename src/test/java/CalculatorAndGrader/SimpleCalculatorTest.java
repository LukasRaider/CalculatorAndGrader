package CalculatorAndGrader;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void TwoPlusTwoShouldEqualFour(){
        var calculator = new SimpleCalculator();
        assertEquals(4,calculator.Addition(2,2));

    }

    @Test
    void ThreePlusSevenShouldEqualTen(){
        var calculator = new SimpleCalculator();
        assertEquals(10,calculator.Addition(3,7));
    }
    @Test
    void MinusThreePlusSevenShouldEqualFour(){
        var calculator = new SimpleCalculator();
        assertEquals(4,calculator.Addition(-3,7));
    }
    @Test
    void MinusThreePlusMinusSevenShouldEqualMinusTen(){
        var calculator = new SimpleCalculator();
        assertEquals(-10,calculator.Addition(-3,-7));
    }
    @Test
    void ThreePlusMinusSevenShouldEqualMinusFour(){
        var calculator = new SimpleCalculator();
        assertEquals(-4,calculator.Addition(3,-7));
    }
    @Test
    void MinusThreeMinusSevenShouldEqualMinusTen(){
        var calculator = new SimpleCalculator();
        assertEquals(-10,calculator.Subtraction(-3,7));
    }
    @Test
    void ThreeMinusSevenShouldEqualMinusFour(){
        var calculator = new SimpleCalculator();
        assertEquals(-4,calculator.Subtraction(3,7));
    }
    @Test
    void ThreeMinusMinusSevenShouldEqualTen(){
        var calculator = new SimpleCalculator();
        assertEquals(10,calculator.Subtraction(3,-7));
    }
    @Test
    void ThreeMinusThreeShouldEqualZero(){
        var calculator = new SimpleCalculator();
        assertEquals(0,calculator.Subtraction(3,3));
    }
    @Test
    void ThreeMultipleThreeShouldEqualNine(){
        var calculator = new SimpleCalculator();
        assertEquals(9,calculator.Multiplication(3,3));
    }
    @Test
    void ThreeMultipleMinusThreeShouldEqualMinusNine(){
        var calculator = new SimpleCalculator();
        assertEquals(-9,calculator.Multiplication(3,-3));
    }
    @Test
    void MinusThreeMultipleMinusThreeShouldEqualNine(){
        var calculator = new SimpleCalculator();
        assertEquals(9,calculator.Multiplication(-3,-3));
    }
    @Test
    void MinusThreeMultipleThreeShouldEqualMinusNine(){
        var calculator = new SimpleCalculator();
        assertEquals(-9,calculator.Multiplication(-3,3));
    }
    @Test
    void MinusThreeMultipleZeroShouldEqualZero(){
        var calculator = new SimpleCalculator();
        assertEquals(0,calculator.Multiplication(-3,0));
    }
    @Test
    void SixMultipleZeroShouldEqualZero(){
        var calculator = new SimpleCalculator();
        assertEquals(0,calculator.Multiplication(6,0));
    }
    @Test
    void PlusNineMultipleZeroShouldEqualZero(){
        var calculator = new SimpleCalculator();
        assertEquals(0,calculator.Multiplication(+9,0));
    }
    @Test
    void ThreeDividedMinusThreeShouldEqualMinusOne(){
        var calculator = new SimpleCalculator();
        assertEquals(-1,calculator.Division(3,-3));
    }
    @Test
    void MinusThreeDividedThreeShouldEqualMinusOne(){
        var calculator = new SimpleCalculator();
        assertEquals(-1,calculator.Division(-3,3));
    }
    @Test
    void ThreeDividedThreeShouldEqualOne(){
        var calculator = new SimpleCalculator();
        assertEquals(1,calculator.Division(3,3));
    }
    @Test
    void ThreeDividedMinusSixShouldEqualZero(){
        var calculator = new SimpleCalculator();
        assertEquals(0.0,calculator.Division(3,-6));
    }
    @Test
    void ThreeDividedOneShouldNotEqualZero() {
        var calculator = new SimpleCalculator();
        assertNotEquals(0,calculator.Division(3,1));
    }
    @Test
    void ThreeEmpowermentEqualNine(){
        var calculator = new SimpleCalculator();
        assertEquals(9,calculator.Empowerment(3));
    }
    @Test
    void MinusThreeEmpowermentEqualNine(){
        var calculator = new SimpleCalculator();
        assertEquals(9,calculator.Empowerment(-3));
    }
    @Test
    void MinusTwoEmpowermentEqualFour(){
        var calculator = new SimpleCalculator();
        assertEquals(4,calculator.Empowerment(-2));
    }
    @Test
    void TwoEmpowermentEqualFour(){
        var calculator = new SimpleCalculator();
        assertEquals(4,calculator.Empowerment(2));
    }
    @Test
    void FourEmpowermentEqualSixteen(){
        var calculator = new SimpleCalculator();
        assertEquals(16,calculator.Empowerment(4));
    }
    @Test
    void MinusFourEmpowermentEqualSixteen(){
        var calculator = new SimpleCalculator();
        assertEquals(16,calculator.Empowerment(-4));
    }
    @Test
    void MinusFourEmpowermentNotEqualMinusSixteen(){
        var calculator = new SimpleCalculator();
        assertNotEquals(-16,calculator.Empowerment(-4));
    }
    @Test
    void MinusTwoEmpowermentNotEqualMinusFour(){
        var calculator = new SimpleCalculator();
        assertNotEquals(-4,calculator.Empowerment(-2));
    }
}