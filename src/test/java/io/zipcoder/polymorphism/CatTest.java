package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void speakTest(){
        // Given
        Pet cat = new Cat();

        // When
        String actualSpeak = cat.speak();
        String actualName = cat.getName();

        // Assert
        String expectedSpeak = "meow";
        Assert.assertEquals(expectedSpeak, actualSpeak);
        String expectedName = "Default Name";
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void defaultConstructorTest(){
        // Given
        Pet cat = new Cat();

        // When
        String actualName = cat.getName();

        // Assert
        String expectedName = "Default Name";
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void nameConstructorTest(){
        // Given
        String expected = "Jeff";
        Pet cat = new Cat(expected);

        // When
        String actual = cat.getName();

        // Assert
        Assert.assertEquals(expected, actual);
    }
}