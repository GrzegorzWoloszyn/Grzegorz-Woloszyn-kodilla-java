package com.kodilla.good.patterns.challenges;

import javax.swing.*;

public class MailService implements InformationService {
    @Override
    public void inform(User user) {
        new JOptionPane("Car has been rented");
    }
}
