package com.kodilla.stream.sand;

import java.math.BigDecimal;

public class Africa implements SandStorage {
    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("123456789123456789");
        return sandQuantity;
    }
}
