package pl.macierze.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
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

        int[] expecteds = {1, 2, 3, 4};

        int[] actuals = Helpers.parseInput("1234");

        assertArrayEquals(expecteds, actuals);
    }


}
