package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User adam = new Millenials("Adam Adam");
        User ewa = new YGeneration("Ewa Ewa");
        User mietek = new ZGeneration("Mietek Mietek");

        //When
        String adamUse = adam.sharePost();
        String ewaUse = ewa.sharePost();
        String mietekUse = mietek.sharePost();

        //Then
        Assert.assertEquals("Facebook.", adamUse);
        Assert.assertEquals("Twitter.", ewaUse);
        Assert.assertEquals("Snapchat.", mietekUse);
    }

   @Test
   public void testIndividualSharingStrategy() {
       //Given
       User adam = new Millenials("Adam Adam");
       //When
       String adamUse = adam.sharePost();
       adam.setSocialMedia(new SnapchatPublisher());
       adamUse = adam.sharePost();
       //Then
       Assert.assertEquals("Snapchat.", adamUse);
   }
}
