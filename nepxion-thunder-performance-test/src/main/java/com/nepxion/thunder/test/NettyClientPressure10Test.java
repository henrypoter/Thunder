package com.nepxion.thunder.test;

/**
 * <p>Title: Nepxion Thunder</p>
 * <p>Description: Nepxion Thunder For Distribution</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Company: Nepxion</p>
 * @author Neptune
 * @email 1394997@qq.com
 * @version 1.0
 */

import com.nepxion.thunder.test.service.EchoFactory;

public class NettyClientPressure10Test extends NettyClientPressureTest {

    @Override
    protected String getText() {
        return EchoFactory.bytes_10;
    }

    public static void main(String[] args) {
        new NettyClientPressure10Test().runTest(null);
    }
}