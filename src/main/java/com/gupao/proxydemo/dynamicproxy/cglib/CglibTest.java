package com.gupao.proxydemo.dynamicproxy.cglib;

import com.gupao.proxydemo.dynamicproxy.jdkproxy.SomeBody;
import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @author yiran
 */
public class CglibTest {
    public static void main(String[] args) {
        SomeBody someBody = (SomeBody) new GodCglibProxy().createClass(new SomeBody());
        someBody.findHouse();

        Nobody nobody = (Nobody) new GodCglibProxy().createClass(new Nobody());
        nobody.findNothing();

        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"E://cglib_proxy_class/");
    }
}
