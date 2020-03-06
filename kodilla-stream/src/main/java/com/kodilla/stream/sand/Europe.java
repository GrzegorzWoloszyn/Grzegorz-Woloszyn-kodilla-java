package com.kodilla.stream.sand;

import java.math.BigDecimal;

public class Europe implements SandStorage {
    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("998877665544332211");
        return sandQuantity;
    }
}
