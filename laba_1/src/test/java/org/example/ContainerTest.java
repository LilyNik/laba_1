package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ContainerTest
    extends TestCase
{

    public ContainerTest(String testName)
    {
        super(testName);
    }

    public static Test suite()
    {
        return new TestSuite(ContainerTest.class);
    }

    public void testApp()
    {
        assertTrue( true );
    }
}
