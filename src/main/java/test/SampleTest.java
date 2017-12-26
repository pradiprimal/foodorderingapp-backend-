package test;

import org.junit.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SampleTest {

    /* TEST 1
    @Test
    public void myTestMethod() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("Nitish");
        nameList.add("Shrestha");
        Assert.assertTrue(nameList.contains("Nitish"));
        Assert.assertTrue(!nameList.contains("Sumin"));
        Assert.assertFalse(nameList.contains("Rowan"));
        Assert.assertFalse(!nameList.contains("Nitish"));
    }
*/

    /* TEST 2
    @Test(expected = ArithmeticException.class)
    public void myTestMethodOne() {
    int num = 1/0;
        System.out.println(num);
    }*/

    /* TEST 3
    @Test(timeout = 100)
    public void myTestMethodTwo(){
        *//**
         * The IO operation has to be done with in 100 milli seconds. If not,
         * the test should fail.
         *//*
        int num = 10;
        System.out.println(num);
    }*/

    /* TEST 4
    List<Integer> rollList ;

    @Before
    public  void init(){
        rollList = new ArrayList<Integer>();
    }

    @Test
    public void myTestMethodThree(){
        Assert.assertTrue("Test Failed! I repeat, test failed!!!",rollList.isEmpty());
    }*/


    /* TEST 5
     @BeforeClass
    public static void initGlobalResources(){
        System.out.println("This will be called only once!");
    }

    @Before
    public void initializeResources(){
        System.out.println("This will be called many times");
    }

    @Test
    public void testOne(){
        Assert.assertTrue(new ArrayList<String>().isEmpty());
    }

    @AfterClass
    public static void closeTest(){
        System.out.println("Finished");
    }

    @Test
    public void testTwo(){
        Assert.assertTrue(new String().length() == 0);
    }*/

    /*
     TEST 6
    String[] name = {"Nitish","Bikram","Rowan","Sumin"};
    String[] expectedName = {"Nitish`","Bikram","Rowan","Sumin"};

    @Test
    public void testMethod(){
        Assert.assertArrayEquals(name, expectedName);
    }*/
    @Test
    public void testMethod(){
        List<String> studentList = new ArrayList<String>();

        Assert.assertTrue(studentList.isEmpty());
    }


}