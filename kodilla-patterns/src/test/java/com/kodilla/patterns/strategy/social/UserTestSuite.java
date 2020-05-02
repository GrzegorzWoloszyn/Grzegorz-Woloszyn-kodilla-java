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
        System.out.println("Adam posts on " + adamUse);

        String ewaUse = ewa.sharePost();
        System.out.println("Ewa posts on " + ewaUse);

        String mietekUse = mietek.sharePost();
        System.out.println("Mietek posts on " + mietekUse);

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
       System.out.println("Adam posts on " + adamUse);
       adam.setSocialMedia(new SnapchatPublisher());
       adamUse = adam.sharePost();
       System.out.println("Adam posts on " + adamUse);
       //Then
       Assert.assertEquals("Snapchat.", adamUse);
   }
}
