package com;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator c=new Calculator();
    @BeforeEach
    public void printBefore(){
        System.out.println("This is executed before each test");
    }
    @Test
    public void twoPlusTwoEqualsFour(){

        assertEquals(4,c.add(2,2));
    }
    @Test
    public void twoPlusTwoNotEqualsFour(){

        assertNotEquals(4,c.add(0,2));
    }
    @Test
    public void checkEven(){
        assertTrue(c.isEven(22),"This will fail");
        assertTrue(c.add(2,2)==4);
    }
    @Test
    public void checkNotEven(){
        assertFalse(c.isEven(21),"This will fail");
    }
    @Test
    public void checkNull(){
        assertNull(null);
    }
    @Test
    public void checkNotNull(){
        assertNotNull(56);
    }
    @Test
    public void checkIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class,()->{
            c.add(-1,2);
        });
    }
    @ParameterizedTest
    @ValueSource(ints={23,45,90,45})
    public void checkOdd(int num){

        assertTrue(num%2!=0);
    }

    @ParameterizedTest
    @CsvSource({
            "2,2",
            "4,0",
            "0,4",
            "8,20"
    })
    public void checkAll(int a,int b){
        int res;
        res=a+b;
        assertEquals(4,res);
    }


    @AfterEach
    public void printAfter(){
        System.out.println("This is executed after each tests");
    }
    @BeforeAll
    public static void printBeforeAllTests(){
        System.out.println("Will be executed only once beffore all the tests");
    }
    @AfterAll
    public static void printAfterAllTests(){
        System.out.println("Will be executed only once after all the tests");
    }
    @ParameterizedTest
    @ValueSource(ints = {5,5,5,5})
    public void checkSumOfAllNaturalNumbers(int num){
        int res;
        res=c.sumOfNaturalNumbers(num);
        assertEquals(15,res);
    }




}