package com.mgk.factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        XyAbstractFactory xyAbstractFactory = null;
        xyAbstractFactory = new MroAbstractFactory();
        xyAbstractFactory.creatdStdJc().createStdJc();
        xyAbstractFactory.createAccessJc().createAccessJc();
        xyAbstractFactory.createWxp().createWxp();
        ////////////////////////////////////////////
        xyAbstractFactory = new MroAbstractFactory();
        xyAbstractFactory.creatdStdJc().createStdJc();
        xyAbstractFactory.createAccessJc().createAccessJc();
        xyAbstractFactory.createWxp().createWxp();
    }
}
