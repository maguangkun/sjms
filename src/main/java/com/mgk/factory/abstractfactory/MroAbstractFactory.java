package com.mgk.factory.abstractfactory;

import com.mgk.factory.abstractfactory.entity.AccessJc;
import com.mgk.factory.abstractfactory.entity.StdJc;
import com.mgk.factory.abstractfactory.entity.Wxp;
import com.mgk.factory.abstractfactory.mro.MroAccessJc;
import com.mgk.factory.abstractfactory.mro.MroStdJc;
import com.mgk.factory.abstractfactory.mro.MroWxp;

public class MroAbstractFactory extends XyAbstractFactory{
    AccessJc createAccessJc() {
        return new MroAccessJc();
    }

    StdJc creatdStdJc() {
        return new MroStdJc();
    }

    Wxp createWxp() {
        return new MroWxp();
    }
}
