package com.mgk.factory.methodfactory;

import com.mgk.factory.methodfactory.entity.BLDepa;
import com.mgk.factory.methodfactory.entity.DepaInterface;
import com.mgk.factory.methodfactory.entity.MroDepa;

public class BLFactory implements DepaFactoryInterface {

    public DepaInterface createDepa() {
        return new BLDepa();
    }
}
