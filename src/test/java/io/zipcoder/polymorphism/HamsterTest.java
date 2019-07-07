package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class HamsterTest {

    @Test
    public void speakTest(){
        // Given
        Pet hamster = new Hamster();

        // When
        String actualSpeak = hamster.speak();
        String actualName = hamster.getName();

        // Assert

        String expectedSpeak = "Squeek";
        Assert.assertEquals(expectedSpeak, actualSpeak);
        String expectedName = "Default Name";
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void defaultConstructorTest(){
        // Given
        Pet Hamster = new Hamster();

        // When
        String actualName = Hamster.getName();

        // Assert
        String expectedName = "Default Name";
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void nameConstructorTest(){
        // Given
        String expected = "Jeff";
        Pet Hamster = new Hamster(expected);

        // When
        String actual = Hamster.getName();

        // Assert
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setNameTest(){
        // Given
        String expected = "Jeff";
        Pet hamster = new Hamster();

        // When
        hamster.setName(expected);
        String actual = hamster.getName();

        // Assert
        Assert.assertEquals(expected, actual);
    }
}