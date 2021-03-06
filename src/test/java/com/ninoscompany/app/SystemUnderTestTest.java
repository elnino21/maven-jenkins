package com.ninoscompany.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class SystemUnderTestTest {

    @Test
    void testGetterAndSetter() {
        //Arrange
        int parameter = 1;
        SystemUnderTest sut = new SystemUnderTest();
        // Act
        sut.setParameter(parameter);
        //Assume
        assertEquals(parameter, sut.getParameter());
    }

    @Test
    void testCalculatePower() {
        //Arrange
        int result = 16;
        SystemUnderTest sut = new SystemUnderTest();
        // Act
        sut.setParameter(4);
        //Assume
        assertEquals(result, sut.power());
    }

    @Test
    void testFailCalculatePower() {
        //Arrange
        SystemUnderTest sut = new SystemUnderTest();
        // Act
        int result = sut.power();
        //Assume
        assertEquals(0, result);
    }
}