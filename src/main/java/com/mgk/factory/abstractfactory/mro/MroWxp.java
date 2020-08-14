package com.mgk.factory.abstractfactory.mro;

import com.mgk.factory.abstractfactory.entity.StdJc;
import com.mgk.factory.abstractfactory.entity.Wxp;

public class MroWxp implements Wxp {
    public void createWxp() {
        System.out.println("MRO危险品");
    }
}
