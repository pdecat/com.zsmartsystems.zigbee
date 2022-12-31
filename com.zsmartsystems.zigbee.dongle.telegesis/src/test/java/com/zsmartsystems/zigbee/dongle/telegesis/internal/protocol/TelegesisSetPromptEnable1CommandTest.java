/**
 * Copyright (c) 2016-2023 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.telegesis.internal.protocol;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 *
 * @author Chris Jackson
 *
 */
public class TelegesisSetPromptEnable1CommandTest extends TelegesisFrameBaseTest {
    @Test
    public void test() {
        TelegesisSetPromptEnable1Command command = new TelegesisSetPromptEnable1Command();
        command.setConfiguration(0xfe12);
        System.out.println(command);
        assertEquals("ATS0E=FE12\r\n", intArrayToString(command.serialize()));
        assertEquals(null, command.getStatus());

        command.deserialize(stringToIntArray("OK\r\n"));
        System.out.println(command);
        assertEquals(TelegesisStatusCode.SUCCESS, command.getStatus());
    }
}
