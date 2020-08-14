package com.mgk.factory.methodfactory;

import com.mgk.factory.methodfactory.entity.DepaInterface;
import com.mgk.factory.methodfactory.entity.MroDepa;

public class MROFactory implements DepaFactoryInterface {

    public DepaInterface createDepa() {
        return new MroDepa();
    }
}
