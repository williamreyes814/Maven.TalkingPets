package io.zipcoder.polymorphism;


import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void speakTest(){
        // Given
        Pet dog = new Dog();

        // When
        String actualSpeak = dog.speak();
        String actualName = dog.getName();

        // Assert
        String expectedSpeak = "Woof";
        Assert.assertEquals(expectedSpeak, actualSpeak);
        String expectedName = "Default name";
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void defaultConstructorTest(){
        // Given
        Pet dog = new Dog();

        // When
        String actualName = dog.getName();

        // Assert
        String expectedName = "Default name";
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void nameConstructorTest(){
        // Given
        String expected = "Jeff";
        Pet dog = new Dog(expected);

        // When
        String actual = dog.getName();

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        // Given
        String expected = "Jeff";
        Pet dog = new Dog();

        // When
        dog.setName(expected);
        String actual = dog.getName();

        // Assert
        Assert.assertEquals(expected, actual);
    }
}