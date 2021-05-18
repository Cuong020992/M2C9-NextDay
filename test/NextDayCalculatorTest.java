import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    @DisplayName("case1 : 1/1/2018")
    void testNextdayCalculatorCase1() {
        int day = 1;
        int month = 1;
        int year = 2018;

        int[] expected = {2,1,2018};

       int[] result = NextDayCalculator.findNextDayCalculator(day,month,year);
       assertArrayEquals(expected,result);
    }

    @Test
    @DisplayName("case2 : 31/1/2018")
    void testNextdayCalculatorCase2() {
        int day = 31;
        int month = 1;
        int year = 2018;

        int[] expected = {1,2,2018};

        int[] result = NextDayCalculator.findNextDayCalculator(day,month,year);
        assertArrayEquals(expected,result);
    }

    @Test
    @DisplayName("case3 : 30/4/2018")
    void testNextdayCalculatorCase3() {
        int day = 30;
        int month = 4;
        int year = 2018;

        int[] expected = {1,5,2018};

        int[] result = NextDayCalculator.findNextDayCalculator(day,month,year);
        assertArrayEquals(expected,result);
    }

    @Test
    @DisplayName("case4 : 28/2/2018")
    void testNextdayCalculatorCase4() {
        int day = 28;
        int month = 2;
        int year = 2018;

        int[] expected = {1,3,2018};

        int[] result = NextDayCalculator.findNextDayCalculator(day,month,year);
        assertArrayEquals(expected,result);
    }

    @Test
    @DisplayName("case5 : 29/2/2018")
    void testNextdayCalculatorCase5() {
        int day = 29;
        int month = 2;
        int year = 2020;

        int[] expected = {1,3,2020};

        int[] result = NextDayCalculator.findNextDayCalculator(day,month,year);
        assertArrayEquals(expected,result);
    }

    @Test
    @DisplayName("case6 : 31/12/2018")
    void testNextdayCalculatorCase6() {
        int day = 31;
        int month = 12;
        int year = 2018;

        int[] expected = {1,1,2019};

        int[] result = NextDayCalculator.findNextDayCalculator(day,month,year);
        assertArrayEquals(expected,result);
    }
}