package testUtils;

import io.cucumber.java.After;

public class GlobalTeardown {
     IOSBaseTest baseClass=new IOSBaseTest();

    /*@After
    public void globalTeardown() {
        baseClass.tearDown();
        System.out.println("Global Teardown: Closing connections, releasing resources, etc.");
    }*/
}
