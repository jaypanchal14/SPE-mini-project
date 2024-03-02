package com.spe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


class SpeMiniProjectApplicationTests {

    @Test
    void addition() {
        double res = SpeMiniProjectApplication.addition(10,2);
        Assertions.assertEquals(12, res);
    }

    @Test
    void subtraction() {
        double res = SpeMiniProjectApplication.subtract(10,2);
        Assertions.assertEquals(8, res);
    }

    @Test
    void multiply() {
        double res = SpeMiniProjectApplication.multiplication(10,2);
        Assertions.assertEquals(20, res);
    }

    @Test
    void division1() throws Exception {
        double res = SpeMiniProjectApplication.division(10,2);
        Assertions.assertEquals(5.0, res);
    }

    @Test
    void division2(){
        Assertions.assertThrows(Exception.class, ()->SpeMiniProjectApplication.division(10,0));
    }

    @Test
    void squareRoot(){
        double res = SpeMiniProjectApplication.squareRoot(16);
        Assertions.assertEquals(4.0, res);
    }

    @Test
    void factorial(){
        double res = SpeMiniProjectApplication.factorial(4);
        Assertions.assertEquals(24.0, res);
    }

    @Test
    void naturalLog(){
        double res = SpeMiniProjectApplication.naturalLog(1);
        Assertions.assertEquals(0, res);
    }

    @Test
    void power(){
        double res = SpeMiniProjectApplication.power(2, 3);
        Assertions.assertEquals(8.0, res);
    }

}
