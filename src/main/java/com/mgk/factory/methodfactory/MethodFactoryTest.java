package com.mgk.factory.methodfactory;

import com.mgk.factory.methodfactory.entity.DepaInterface;

public    class MethodFactoryTest {
    public static void main(String[] args) {
        DepaInterface mro = new MROFactory().createDepa();
        DepaInterface bl = new BLFactory().createDepa();
        mro.createDepa();
        bl.createDepa();
    }
}
