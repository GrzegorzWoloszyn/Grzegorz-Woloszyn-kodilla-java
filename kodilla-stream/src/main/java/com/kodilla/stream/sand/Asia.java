package com.kodilla.stream.sand;

import java.math.BigDecimal;

public class Asia implements SandStorage {
    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("123456789987654321");
        return sandQuantity;
    }
}
