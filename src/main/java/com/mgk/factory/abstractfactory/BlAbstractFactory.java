package com.mgk.factory.abstractfactory;

import com.mgk.factory.abstractfactory.bl.BlAccessJc;
import com.mgk.factory.abstractfactory.bl.BlStdJc;
import com.mgk.factory.abstractfactory.bl.BlWxp;
import com.mgk.factory.abstractfactory.entity.AccessJc;
import com.mgk.factory.abstractfactory.entity.StdJc;
import com.mgk.factory.abstractfactory.entity.Wxp;
import com.mgk.factory.abstractfactory.mro.MroAccessJc;
import com.mgk.factory.abstractfactory.mro.MroStdJc;
import com.mgk.factory.abstractfactory.mro.MroWxp;

public class BlAbstractFactory extends XyAbstractFactory{
    AccessJc createAccessJc() {
        return new BlAccessJc();
    }

    StdJc creatdStdJc() {
        return new BlStdJc();
    }

    Wxp createWxp() {
        return new BlWxp();
    }
}
