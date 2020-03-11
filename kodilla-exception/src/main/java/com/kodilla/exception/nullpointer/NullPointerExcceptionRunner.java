package com.kodilla.exception.nullpointer;

public class NullPointerExcceptionRunner {
    public static void main(String[] args) {
        User user = null;
        MessageSender messageSender = new MessageSender();
        try {
            messageSender.sendMessage(user, "Hello");
        } catch (MessageNotSentException e) {
            System.out.println("Message ist not send, but my program still running very well!");
        }

        System.out.println("Processing other logic");
    }
}
