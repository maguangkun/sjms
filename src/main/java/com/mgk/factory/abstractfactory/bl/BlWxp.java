package com.mgk.factory.abstractfactory.bl;

import com.mgk.factory.abstractfactory.entity.Wxp;

public class BlWxp implements Wxp {
    public void createWxp() {
        System.out.println("标链危险品");
    }
}
