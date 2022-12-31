/**
 * Copyright (c) 2016-2023 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.ezsp.structure;

import com.zsmartsystems.zigbee.dongle.ember.ezsp.structure.EmberGpAddress;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.structure.EmberGpSinkListEntry;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.structure.EmberKeyData;
import com.zsmartsystems.zigbee.dongle.ember.internal.serializer.EzspDeserializer;
import com.zsmartsystems.zigbee.dongle.ember.internal.serializer.EzspSerializer;

/**
 * Class to implement the Ember Structure <b>EmberGpProxyTableEntry</b>.
 * <p>
 * The internal representation of a proxy table entry.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class EmberGpProxyTableEntry {

    /**
     * The link key to be used to secure this pairing link.
     * <p>
     * EZSP type is <i>EmberKeyData</i> - Java type is {@link EmberKeyData}
     */
    private EmberKeyData securityLinkKey;

    /**
     * Internal status of the proxy table entry.
     * <p>
     * EZSP type is <i>EmberGpProxyTableEntryStatus</i> - Java type is {@link EmberGpProxyTableEntryStatus}
     */
    private EmberGpProxyTableEntryStatus status;

    /**
     * The tunneling options (this contains both options and extendedOptions from the spec).
     * <p>
     * EZSP type is <i>uint32_t</i> - Java type is {@link int}
     */
    private int options;

    /**
     * The GPD endpoint.
     * <p>
     * EZSP type is <i>EmberGpAddress</i> - Java type is {@link EmberGpAddress}
     */
    private EmberGpAddress gpd;

    /**
     * The assigned alias for the GPD.
     * <p>
     * EZSP type is <i>EmberNodeId</i> - Java type is {@link int}
     */
    private int assignedAlias;

    /**
     * The security options field.
     * <p>
     * EZSP type is <i>uint8_t</i> - Java type is {@link int}
     */
    private int securityOptions;

    /**
     * The security frame counter of the GPD.
     * <p>
     * EZSP type is <i>EmberGpSecurityFrameCounter</i> - Java type is {@link int}
     */
    private int gpdSecurityFrameCounter;

    /**
     * The key to use for GPD.
     * <p>
     * EZSP type is <i>EmberKeyData</i> - Java type is {@link EmberKeyData}
     */
    private EmberKeyData gpdKey;

    /**
     * The list of sinks (hardcoded to 2 which is the spec minimum).
     * <p>
     * EZSP type is <i>EmberGpSinkListEntry[2]</i> - Java type is {@link EmberGpSinkListEntry[]}
     */
    private EmberGpSinkListEntry[] sinkList;

    /**
     * The groupcast radius.
     * <p>
     * EZSP type is <i>uint8_t</i> - Java type is {@link int}
     */
    private int groupcastRadius;

    /**
     * The search counter.
     * <p>
     * EZSP type is <i>uint8_t</i> - Java type is {@link int}
     */
    private int searchCounter;

    /**
     * Default Constructor
     */
    public EmberGpProxyTableEntry() {
    }

    public EmberGpProxyTableEntry(EzspDeserializer deserializer) {
        deserialize(deserializer);
    }

    /**
     * The link key to be used to secure this pairing link.
     * <p>
     * EZSP type is <i>EmberKeyData</i> - Java type is {@link EmberKeyData}
     *
     * @return the current securityLinkKey as {@link EmberKeyData}
     */
    public EmberKeyData getSecurityLinkKey() {
        return securityLinkKey;
    }

    /**
     * The link key to be used to secure this pairing link.
     *
     * @param securityLinkKey the securityLinkKey to set as {@link EmberKeyData}
     */
    public void setSecurityLinkKey(EmberKeyData securityLinkKey) {
        this.securityLinkKey = securityLinkKey;
    }

    /**
     * Internal status of the proxy table entry.
     * <p>
     * EZSP type is <i>EmberGpProxyTableEntryStatus</i> - Java type is {@link EmberGpProxyTableEntryStatus}
     *
     * @return the current status as {@link EmberGpProxyTableEntryStatus}
     */
    public EmberGpProxyTableEntryStatus getStatus() {
        return status;
    }

    /**
     * Internal status of the proxy table entry.
     *
     * @param status the status to set as {@link EmberGpProxyTableEntryStatus}
     */
    public void setStatus(EmberGpProxyTableEntryStatus status) {
        this.status = status;
    }

    /**
     * The tunneling options (this contains both options and extendedOptions from the spec).
     * <p>
     * EZSP type is <i>uint32_t</i> - Java type is {@link int}
     *
     * @return the current options as {@link int}
     */
    public int getOptions() {
        return options;
    }

    /**
     * The tunneling options (this contains both options and extendedOptions from the spec).
     *
     * @param options the options to set as {@link int}
     */
    public void setOptions(int options) {
        this.options = options;
    }

    /**
     * The GPD endpoint.
     * <p>
     * EZSP type is <i>EmberGpAddress</i> - Java type is {@link EmberGpAddress}
     *
     * @return the current gpd as {@link EmberGpAddress}
     */
    public EmberGpAddress getGpd() {
        return gpd;
    }

    /**
     * The GPD endpoint.
     *
     * @param gpd the gpd to set as {@link EmberGpAddress}
     */
    public void setGpd(EmberGpAddress gpd) {
        this.gpd = gpd;
    }

    /**
     * The assigned alias for the GPD.
     * <p>
     * EZSP type is <i>EmberNodeId</i> - Java type is {@link int}
     *
     * @return the current assignedAlias as {@link int}
     */
    public int getAssignedAlias() {
        return assignedAlias;
    }

    /**
     * The assigned alias for the GPD.
     *
     * @param assignedAlias the assignedAlias to set as {@link int}
     */
    public void setAssignedAlias(int assignedAlias) {
        this.assignedAlias = assignedAlias;
    }

    /**
     * The security options field.
     * <p>
     * EZSP type is <i>uint8_t</i> - Java type is {@link int}
     *
     * @return the current securityOptions as {@link int}
     */
    public int getSecurityOptions() {
        return securityOptions;
    }

    /**
     * The security options field.
     *
     * @param securityOptions the securityOptions to set as {@link int}
     */
    public void setSecurityOptions(int securityOptions) {
        this.securityOptions = securityOptions;
    }

    /**
     * The security frame counter of the GPD.
     * <p>
     * EZSP type is <i>EmberGpSecurityFrameCounter</i> - Java type is {@link int}
     *
     * @return the current gpdSecurityFrameCounter as {@link int}
     */
    public int getGpdSecurityFrameCounter() {
        return gpdSecurityFrameCounter;
    }

    /**
     * The security frame counter of the GPD.
     *
     * @param gpdSecurityFrameCounter the gpdSecurityFrameCounter to set as {@link int}
     */
    public void setGpdSecurityFrameCounter(int gpdSecurityFrameCounter) {
        this.gpdSecurityFrameCounter = gpdSecurityFrameCounter;
    }

    /**
     * The key to use for GPD.
     * <p>
     * EZSP type is <i>EmberKeyData</i> - Java type is {@link EmberKeyData}
     *
     * @return the current gpdKey as {@link EmberKeyData}
     */
    public EmberKeyData getGpdKey() {
        return gpdKey;
    }

    /**
     * The key to use for GPD.
     *
     * @param gpdKey the gpdKey to set as {@link EmberKeyData}
     */
    public void setGpdKey(EmberKeyData gpdKey) {
        this.gpdKey = gpdKey;
    }

    /**
     * The list of sinks (hardcoded to 2 which is the spec minimum).
     * <p>
     * EZSP type is <i>EmberGpSinkListEntry[2]</i> - Java type is {@link EmberGpSinkListEntry[]}
     *
     * @return the current sinkList as {@link EmberGpSinkListEntry[]}
     */
    public EmberGpSinkListEntry[] getSinkList() {
        return sinkList;
    }

    /**
     * The list of sinks (hardcoded to 2 which is the spec minimum).
     *
     * @param sinkList the sinkList to set as {@link EmberGpSinkListEntry[]}
     */
    public void setSinkList(EmberGpSinkListEntry[] sinkList) {
        this.sinkList = sinkList;
    }

    /**
     * The groupcast radius.
     * <p>
     * EZSP type is <i>uint8_t</i> - Java type is {@link int}
     *
     * @return the current groupcastRadius as {@link int}
     */
    public int getGroupcastRadius() {
        return groupcastRadius;
    }

    /**
     * The groupcast radius.
     *
     * @param groupcastRadius the groupcastRadius to set as {@link int}
     */
    public void setGroupcastRadius(int groupcastRadius) {
        this.groupcastRadius = groupcastRadius;
    }

    /**
     * The search counter.
     * <p>
     * EZSP type is <i>uint8_t</i> - Java type is {@link int}
     *
     * @return the current searchCounter as {@link int}
     */
    public int getSearchCounter() {
        return searchCounter;
    }

    /**
     * The search counter.
     *
     * @param searchCounter the searchCounter to set as {@link int}
     */
    public void setSearchCounter(int searchCounter) {
        this.searchCounter = searchCounter;
    }

    /**
     * Serialise the contents of the EZSP structure.
     *
     * @param serializer the {@link EzspSerializer} used to serialize
     */
    public int[] serialize(EzspSerializer serializer) {
        // Serialize the fields
        serializer.serializeEmberKeyData(securityLinkKey);
        serializer.serializeEmberGpProxyTableEntryStatus(status);
        serializer.serializeUInt32(options);
        serializer.serializeEmberGpAddress(gpd);
        serializer.serializeUInt16(assignedAlias);
        serializer.serializeUInt8(securityOptions);
        serializer.serializeUInt32(gpdSecurityFrameCounter);
        serializer.serializeEmberKeyData(gpdKey);
        serializer.serializeEmberGpSinkListEntry(sinkList);
        serializer.serializeUInt8(groupcastRadius);
        serializer.serializeUInt8(searchCounter);
        return serializer.getPayload();
    }

    /**
     * Deserialise the contents of the EZSP structure.
     *
     * @param deserializer the {@link EzspDeserializer} used to deserialize
     */
    public void deserialize(EzspDeserializer deserializer) {
        // Deserialize the fields
        securityLinkKey = deserializer.deserializeEmberKeyData();
        status = deserializer.deserializeEmberGpProxyTableEntryStatus();
        options = deserializer.deserializeUInt32();
        gpd = deserializer.deserializeEmberGpAddress();
        assignedAlias = deserializer.deserializeUInt16();
        securityOptions = deserializer.deserializeUInt8();
        gpdSecurityFrameCounter = deserializer.deserializeUInt32();
        gpdKey = deserializer.deserializeEmberKeyData();
        sinkList = deserializer.deserializeEmberGpSinkListEntry(2);
        groupcastRadius = deserializer.deserializeUInt8();
        searchCounter = deserializer.deserializeUInt8();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(300);
        builder.append("EmberGpProxyTableEntry [securityLinkKey=");
        builder.append(securityLinkKey);
        builder.append(", status=");
        builder.append(status);
        builder.append(", options=");
        builder.append(options);
        builder.append(", gpd=");
        builder.append(gpd);
        builder.append(", assignedAlias=");
        builder.append(String.format("%04X", assignedAlias));
        builder.append(", securityOptions=");
        builder.append(securityOptions);
        builder.append(", gpdSecurityFrameCounter=");
        builder.append(gpdSecurityFrameCounter);
        builder.append(", gpdKey=");
        builder.append(gpdKey);
        builder.append(", sinkList=");
        builder.append('{');
        if (sinkList == null) {
            builder.append("null");
        } else {
            for (int cnt = 0; cnt < sinkList.length; cnt++) {
                if (cnt != 0) {
                    builder.append(' ');
                }
                builder.append(sinkList[cnt]);
            }
        }
        builder.append('}');
        builder.append(", groupcastRadius=");
        builder.append(groupcastRadius);
        builder.append(", searchCounter=");
        builder.append(searchCounter);
        builder.append(']');
        return builder.toString();
    }
}
