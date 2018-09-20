/**
 * Copyright (c) 2016-2023 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.prepayment;

import javax.annotation.Generated;

import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.field.ZigBeeUtcTime;
import com.zsmartsystems.zigbee.zcl.protocol.ZclCommandDirection;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;

/**
 * Get Prepay Snapshot value object class.
 * <p>
 * Cluster: <b>Prepayment</b>. Command ID 0x07 is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the Prepayment cluster.
 * <p>
 * FIXME: This command is used to request the cluster server for snapshot data.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZigBeeCodeGenerator", date = "2022-12-09T01:34:23Z")
public class GetPrepaySnapshot extends ZclPrepaymentCommand {
    /**
     * The cluster ID to which this command belongs.
     */
    public static int CLUSTER_ID = 0x0705;

    /**
     * The command ID.
     */
    public static int COMMAND_ID = 0x07;

    /**
     * Earliest Start Time command message field.
     */
    private ZigBeeUtcTime earliestStartTime;

    /**
     * Latest End Time command message field.
     */
    private ZigBeeUtcTime latestEndTime;

    /**
     * Snapshot Offset command message field.
     */
    private Integer snapshotOffset;

    /**
     * Snapshot Cause command message field.
     */
    private Integer snapshotCause;

    /**
     * Default constructor.
     *
     * @deprecated from release 1.3.0. Use the parameterised constructor instead of the default constructor and setters.
     */
    @Deprecated
    public GetPrepaySnapshot() {
        clusterId = CLUSTER_ID;
        commandId = COMMAND_ID;
        genericCommand = false;
        commandDirection = ZclCommandDirection.CLIENT_TO_SERVER;
    }

    /**
     * Constructor providing all required parameters.
     *
     * @param earliestStartTime {@link ZigBeeUtcTime} Earliest Start Time
     * @param latestEndTime {@link ZigBeeUtcTime} Latest End Time
     * @param snapshotOffset {@link Integer} Snapshot Offset
     * @param snapshotCause {@link Integer} Snapshot Cause
     */
    public GetPrepaySnapshot(
            ZigBeeUtcTime earliestStartTime,
            ZigBeeUtcTime latestEndTime,
            Integer snapshotOffset,
            Integer snapshotCause) {

        clusterId = CLUSTER_ID;
        commandId = COMMAND_ID;
        genericCommand = false;
        commandDirection = ZclCommandDirection.CLIENT_TO_SERVER;

        this.earliestStartTime = earliestStartTime;
        this.latestEndTime = latestEndTime;
        this.snapshotOffset = snapshotOffset;
        this.snapshotCause = snapshotCause;
    }

    /**
     * Gets Earliest Start Time.
     *
     * @return the Earliest Start Time
     */
    public ZigBeeUtcTime getEarliestStartTime() {
        return earliestStartTime;
    }

    /**
     * Sets Earliest Start Time.
     *
     * @param earliestStartTime the Earliest Start Time
     * @deprecated as of 1.3.0. Use the parameterised constructor instead to ensure that all mandatory fields are provided.
     */
    @Deprecated
    public void setEarliestStartTime(final ZigBeeUtcTime earliestStartTime) {
        this.earliestStartTime = earliestStartTime;
    }

    /**
     * Gets Latest End Time.
     *
     * @return the Latest End Time
     */
    public ZigBeeUtcTime getLatestEndTime() {
        return latestEndTime;
    }

    /**
     * Sets Latest End Time.
     *
     * @param latestEndTime the Latest End Time
     * @deprecated as of 1.3.0. Use the parameterised constructor instead to ensure that all mandatory fields are provided.
     */
    @Deprecated
    public void setLatestEndTime(final ZigBeeUtcTime latestEndTime) {
        this.latestEndTime = latestEndTime;
    }

    /**
     * Gets Snapshot Offset.
     *
     * @return the Snapshot Offset
     */
    public Integer getSnapshotOffset() {
        return snapshotOffset;
    }

    /**
     * Sets Snapshot Offset.
     *
     * @param snapshotOffset the Snapshot Offset
     * @deprecated as of 1.3.0. Use the parameterised constructor instead to ensure that all mandatory fields are provided.
     */
    @Deprecated
    public void setSnapshotOffset(final Integer snapshotOffset) {
        this.snapshotOffset = snapshotOffset;
    }

    /**
     * Gets Snapshot Cause.
     *
     * @return the Snapshot Cause
     */
    public Integer getSnapshotCause() {
        return snapshotCause;
    }

    /**
     * Sets Snapshot Cause.
     *
     * @param snapshotCause the Snapshot Cause
     * @deprecated as of 1.3.0. Use the parameterised constructor instead to ensure that all mandatory fields are provided.
     */
    @Deprecated
    public void setSnapshotCause(final Integer snapshotCause) {
        this.snapshotCause = snapshotCause;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(earliestStartTime, ZclDataType.UTCTIME);
        serializer.serialize(latestEndTime, ZclDataType.UTCTIME);
        serializer.serialize(snapshotOffset, ZclDataType.UNSIGNED_8_BIT_INTEGER);
        serializer.serialize(snapshotCause, ZclDataType.BITMAP_32_BIT);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        earliestStartTime = (ZigBeeUtcTime) deserializer.deserialize(ZclDataType.UTCTIME);
        latestEndTime = (ZigBeeUtcTime) deserializer.deserialize(ZclDataType.UTCTIME);
        snapshotOffset = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
        snapshotCause = (Integer) deserializer.deserialize(ZclDataType.BITMAP_32_BIT);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(157);
        builder.append("GetPrepaySnapshot [");
        builder.append(super.toString());
        builder.append(", earliestStartTime=");
        builder.append(earliestStartTime);
        builder.append(", latestEndTime=");
        builder.append(latestEndTime);
        builder.append(", snapshotOffset=");
        builder.append(snapshotOffset);
        builder.append(", snapshotCause=");
        builder.append(snapshotCause);
        builder.append(']');
        return builder.toString();
    }

}
