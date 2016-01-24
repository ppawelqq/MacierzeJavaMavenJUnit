package pl.macierze.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;
import pl.macierze.method.MatrixMethods;
import pl.macierze.utils.Helpers;

/**
 *
 * @author root
 */
public class AllTests {

    public AllTests() {
    }

    @Test
    public void testParseInputCorrect() {
        System.out.println("pl.macierze.test.TestAdd.testParseInput()");

        int[] expecteds = {1, 2};

        int[] actuals = Helpers.parseInput("12");

        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testParseInputLongValue() {
        System.out.println("pl.macierze.test.AllTests.testParseInputLongValue()");

        int[] expecteds = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] actuals = Helpers.parseInput("123456789");

        assertArrayEquals(expecteds, actuals);

    }

    // TESTY DLA DODAWANIA
    @Test
    public void testAddFirst() {
        System.out.println("pl.macierze.test.AllTests.testAdd()");

        int[][] expected = {{5, 5}, {5, 5}};

        int[][] firstMatrix = {{1, 2}, {3, 4}};
        int[][] secondMatrix = {{4, 3}, {2, 1}};

        MatrixMethods matrixMethods = new MatrixMethods(firstMatrix, secondMatrix, 2, 2);
        int[][] actuals = matrixMethods.addT();

        int[] ele1 = expected[0];
        int[] ele2 = actuals[0];

        assertArrayEquals(ele1, ele2);
    }

    @Test
    public void testAddLast() {
        System.out.println("pl.macierze.test.AllTests.testAdd()");

        int[][] expected = {{5, 5}, {5, 5}};

        int[][] firstMatrix = {{1, 2}, {3, 4}};
        int[][] secondMatrix = {{4, 3}, {2, 1}};

        MatrixMethods matrixMethods = new MatrixMethods(firstMatrix, secondMatrix, 2, 2);
        int[][] actuals = matrixMethods.addT();

        int[] ele1 = expected[1];
        int[] ele2 = actuals[1];

        assertArrayEquals(ele1, ele2);
    }

    @Test
    public void testSizeArray() {
        System.out.println("pl.macierze.test.AllTests.testAdd()");

        int[][] expected = {{5, 5}, {5, 5}};

        int[][] firstMatrix = {{1, 2}, {3, 4}};
        int[][] secondMatrix = {{4, 3}, {2, 1}};

        MatrixMethods matrixMethods = new MatrixMethods(firstMatrix, secondMatrix, 2, 2);
        int[][] actuals = matrixMethods.addT();

        int[] expLenght = new int[1];
        int[] actLenght = new int[1];

        expLenght[0] = expected.length;
        actLenght[0] = actuals.length;

        assertArrayEquals(expLenght, actLenght);

    }

    // TEST DLA 
    @Test
    public void testDiv() {
        System.out.println("pl.macierze.test.AllTests.testDiv()");

        int[][] expected = {{0, 0}, {1, 4}};

        int[][] firstMatrix = {{1, 2}, {3, 4}};
        int[][] secondMatrix = {{4, 3}, {2, 1}};

        MatrixMethods matrixMethods = new MatrixMethods(firstMatrix, secondMatrix, 2, 2);
        int[][] actuals = matrixMethods.divT();

        int[] ele1 = expected[0];
        int[] ele2 = actuals[0];

        assertArrayEquals(ele1, ele2);

    }

    @Test
    public void testDivLast() {
        System.out.println("pl.macierze.test.AllTests.testDiv()");

        int[][] expected = {{0, 0}, {1, 4}};

        int[][] firstMatrix = {{1, 2}, {3, 4}};
        int[][] secondMatrix = {{4, 3}, {2, 1}};

        MatrixMethods matrixMethods = new MatrixMethods(firstMatrix, secondMatrix, 2, 2);
        int[][] actuals = matrixMethods.divT();

        int[] ele1 = expected[1];
        int[] ele2 = actuals[1];

        assertArrayEquals(ele1, ele2);
    }

    @Test
    public void testSizeDivArray() {
        System.out.println("pl.macierze.test.AllTests.testAdd()");

        int[][] expected = {{5, 5}, {5, 5}};

        int[][] firstMatrix = {{1, 2}, {3, 4}};
        int[][] secondMatrix = {{4, 3}, {2, 1}};

        MatrixMethods matrixMethods = new MatrixMethods(firstMatrix, secondMatrix, 2, 2);
        int[][] actuals = matrixMethods.divT();

        int[] expLenght = new int[1];
        int[] actLenght = new int[1];

        expLenght[0] = expected.length;
        actLenght[0] = actuals.length;

        assertArrayEquals(expLenght, actLenght);

    }

    // TESTY DLA DZIELENIA
    @Test
    public void testMulti() {
        System.out.println("pl.macierze.test.AllTests.testMulti()");

        int[][] expected = {{4, 6}, {6, 4}};

        int[][] firstMatrix = {{1, 2}, {3, 4}};
        int[][] secondMatrix = {{4, 3}, {2, 1}};

        MatrixMethods matrixMethods = new MatrixMethods(firstMatrix, secondMatrix, 2, 2);
        int[][] actuals = matrixMethods.multiT();

        int[] ele1 = expected[0];
        int[] ele2 = actuals[0];

        assertArrayEquals(ele1, ele2);

    }

    @Test
    public void testMultiLast() {
        System.out.println("pl.macierze.test.AllTests.testMulti()");

        int[][] expected = {{4, 6}, {6, 4}};

        int[][] firstMatrix = {{1, 2}, {3, 4}};
        int[][] secondMatrix = {{4, 3}, {2, 1}};

        MatrixMethods matrixMethods = new MatrixMethods(firstMatrix, secondMatrix, 2, 2);
        int[][] actuals = matrixMethods.multiT();

        int[] ele1 = expected[0];
        int[] ele2 = actuals[0];

        assertArrayEquals(ele1, ele2);
    }

    @Test
    public void testSizeMultiArray() {
        System.out.println("pl.macierze.test.AllTests.testMulti()");

        int[][] expected = {{5, 5}, {5, 5}};

        int[][] firstMatrix = {{1, 2}, {3, 4}};
        int[][] secondMatrix = {{4, 3}, {2, 1}};

        MatrixMethods matrixMethods = new MatrixMethods(firstMatrix, secondMatrix, 2, 2);
        int[][] actuals = matrixMethods.multiT();

        int[] expLenght = new int[1];
        int[] actLenght = new int[1];

        expLenght[0] = expected.length;
        actLenght[0] = actuals.length;

        assertArrayEquals(expLenght, actLenght);

    }

    @Test
    public void testSub() {
        System.out.println("pl.macierze.test.AllTests.testSub()");

        int[][] expected = {{-3, -1}, {1, 3}};

        int[][] firstMatrix = {{1, 2}, {3, 4}};
        int[][] secondMatrix = {{4, 3}, {2, 1}};

        MatrixMethods matrixMethods = new MatrixMethods(firstMatrix, secondMatrix, 2, 2);
        int[][] actuals = matrixMethods.subT();

        int[] ele1 = expected[0];
        int[] ele2 = actuals[0];

        assertArrayEquals(ele1, ele2);
    }

    @Test
    public void testSubLast() {
        System.out.println("pl.macierze.test.AllTests.testsub()");

        int[][] expected = {{-3, -1}, {1, 3}};

        int[][] firstMatrix = {{1, 2}, {3, 4}};
        int[][] secondMatrix = {{4, 3}, {2, 1}};

        MatrixMethods matrixMethods = new MatrixMethods(firstMatrix, secondMatrix, 2, 2);
        int[][] actuals = matrixMethods.subT();

        int[] ele1 = expected[1];
        int[] ele2 = actuals[1];

        assertArrayEquals(ele1, ele2);
    }

    @Test
    public void testSizeSubArray() {
        System.out.println("pl.macierze.test.AllTests.testMulti()");

        int[][] expected = {{5, 5}, {5, 5}};

        int[][] firstMatrix = {{1, 2}, {3, 4}};
        int[][] secondMatrix = {{4, 3}, {2, 1}};

        MatrixMethods matrixMethods = new MatrixMethods(firstMatrix, secondMatrix, 2, 2);
        int[][] actuals = matrixMethods.subT();

        int[] expLenght = new int[1];
        int[] actLenght = new int[1];

        expLenght[0] = expected.length;
        actLenght[0] = actuals.length;

        assertArrayEquals(expLenght, actLenght);

    }

    @Test
    public void testAssertionError() {
        System.out.println("pl.macierze.test.AllTests.testAdd()");

        int[] expecteds = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] actuals = Helpers.parseInput("1234");

        try {
             assertArrayEquals(expecteds, actuals);
        
        }
        catch (AssertionError uhOh) {
            System.out.println("Oczekiwany wyjątek" + uhOh);

        }

    }

}
