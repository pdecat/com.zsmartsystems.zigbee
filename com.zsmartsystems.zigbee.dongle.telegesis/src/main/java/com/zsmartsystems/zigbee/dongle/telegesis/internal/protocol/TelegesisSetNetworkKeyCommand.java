/**
 * Copyright (c) 2016-2023 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.telegesis.internal.protocol;

import com.zsmartsystems.zigbee.security.ZigBeeKey;

/**
 * Class to implement the Telegesis command <b>Set Network Key</b>.
 * <p>
 * The network key which can be written using the password. The default password for R3xx is
 * “password”.
 * <p>
 * This class provides methods for processing Telegesis AT API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class TelegesisSetNetworkKeyCommand extends TelegesisFrame implements TelegesisCommand {
    /**
     * Command field
     */
    private ZigBeeKey networkKey;

    /**
     * Command field
     */
    private String password;

    /**
     *
     * @param networkKey the networkKey to set as {@link ZigBeeKey}
     */
    public void setNetworkKey(ZigBeeKey networkKey) {
        this.networkKey = networkKey;
    }

    /**
     *
     * @param password the password to set as {@link String}
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int[] serialize() {
        // Serialize the command fields
        serializeCommand("ATS08=");
        serializeZigBeeKey(networkKey);
        serializeDelimiter();
        serializeString(password);

        return getPayload();
    }

    @Override
    public boolean deserialize(int[] data) {
        // Handle standard status responses (ie. OK / ERROR)
        if (handleIncomingStatus(data)) {
            return true;
        }

        initialiseDeserializer(data);


        return false;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(299);
        // First present the command parameters...
        // Then the responses later if they are available
        builder.append("TelegesisSetNetworkKeyCommand [networkKey=");
        builder.append(networkKey);
        builder.append(", password=");
        builder.append(password);
        if (status != null) {
            builder.append(", status=");
            builder.append(status);
        }
        builder.append(']');
        return builder.toString();
    }
}
