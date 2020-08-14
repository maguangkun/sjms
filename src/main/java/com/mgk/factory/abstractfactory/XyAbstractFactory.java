package com.mgk.factory.abstractfactory;

import com.mgk.factory.abstractfactory.entity.AccessJc;
import com.mgk.factory.abstractfactory.entity.StdJc;
import com.mgk.factory.abstractfactory.entity.Wxp;

public abstract class XyAbstractFactory {
    abstract AccessJc  createAccessJc();
    abstract StdJc creatdStdJc();
    abstract Wxp createWxp();

}
