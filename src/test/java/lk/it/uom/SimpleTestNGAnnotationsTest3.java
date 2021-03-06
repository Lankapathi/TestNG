package lk.it.uom;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleTestNGAnnotationsTest3 {

    @BeforeClass
    public void beforClass() throws InterruptedException{
        System.out.println("Before class:");
        Thread.sleep(4000);
    }

    @BeforeMethod
    public void beforMethod() throws InterruptedException{
        System.out.println("Before method:");
        Thread.sleep(4000);
    }

    @Test
    public void test1() throws InterruptedException{
        System.out.println("Test 1:");
        Thread.sleep(4000);
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException{
        System.out.println("After method:");
        Thread.sleep(4000);
    }

    @AfterClass
    public void afterClass() throws InterruptedException{
        System.out.println("After class:");
        Thread.sleep(4000);
    }
}
