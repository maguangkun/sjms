package com.mgk.factory.abstractfactory.mro;

import com.mgk.factory.abstractfactory.entity.AccessJc;
import com.mgk.factory.abstractfactory.entity.Wxp;

public class MroAccessJc implements AccessJc {
    public void createAccessJc() {
        System.out.println("MRO盖板工卡");
    }
}
