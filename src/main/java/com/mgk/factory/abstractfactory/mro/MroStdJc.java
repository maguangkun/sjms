package com.mgk.factory.abstractfactory.mro;

import com.mgk.factory.abstractfactory.entity.StdJc;

public class  MroStdJc implements StdJc {
    public void createStdJc() {
        System.out.println("MRO标准工卡");
    }
}
