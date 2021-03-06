/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <i>ModifyReplicationGroups</i> action.
 * </p>
 */
public class ModifyReplicationGroupRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the replication group to modify.
     * </p>
     */
    private String replicationGroupId;
    /**
     * <p>
     * A description for the replication group. Maximum length is 255
     * characters.
     * </p>
     */
    private String replicationGroupDescription;
    /**
     * <p>
     * If this parameter is specified, ElastiCache will promote the specified
     * cluster in the specified replication group to the primary role. The nodes
     * of all other clusters in the replication group will be read replicas.
     * </p>
     */
    private String primaryClusterId;
    /**
     * <p>
     * The cache cluster ID that will be used as the daily snapshot source for
     * the replication group.
     * </p>
     */
    private String snapshottingClusterId;
    /**
     * <p>
     * Whether a read replica will be automatically promoted to read/write
     * primary if the existing primary encounters a failure.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <note>
     * <p>
     * ElastiCache Multi-AZ replication groups are not supported on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * T1 and T2 cache node types.
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private Boolean automaticFailoverEnabled;
    /**
     * <p>
     * A list of cache security group names to authorize for the clusters in
     * this replication group. This change is asynchronously applied as soon as
     * possible.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing cache
     * clusters running outside of an Amazon Virtual Private Cloud (VPC).
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Must
     * not be "Default".
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> cacheSecurityGroupNames;
    /**
     * <p>
     * Specifies the VPC Security Groups associated with the cache clusters in
     * the replication group.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing cache
     * clusters running in an Amazon Virtual Private Cloud (VPC).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroupIds;
    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cache
     * cluster is performed. It is specified as a range in the format
     * ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window
     * is a 60 minute period. Valid values for <code>ddd</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sun</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tue</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>thu</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sat</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>sun:05:00-sun:09:00</code>
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     * notifications will be sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be same as the replication group owner.
     * </p>
     * </note>
     */
    private String notificationTopicArn;
    /**
     * <p>
     * The name of the cache parameter group to apply to all of the clusters in
     * this replication group. This change is asynchronously applied as soon as
     * possible for parameters when the <i>ApplyImmediately</i> parameter is
     * specified as <i>true</i> for this request.
     * </p>
     */
    private String cacheParameterGroupName;
    /**
     * <p>
     * The status of the Amazon SNS notification topic for the replication
     * group. Notifications are sent only if the status is <i>active</i>.
     * </p>
     * <p>
     * Valid values: <code>active</code> | <code>inactive</code>
     * </p>
     */
    private String notificationTopicStatus;
    /**
     * <p>
     * If <code>true</code>, this parameter causes the modifications in this
     * request and any pending modifications to be applied, asynchronously and
     * as soon as possible, regardless of the <i>PreferredMaintenanceWindow</i>
     * setting for the replication group.
     * </p>
     * <p>
     * If <code>false</code>, then changes to the nodes in the replication group
     * are applied on the next maintenance reboot, or the next failure reboot,
     * whichever occurs first.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean applyImmediately;
    /**
     * <p>
     * The upgraded version of the cache engine to be run on the cache clusters
     * in the replication group.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement"
     * >Selecting a Cache Engine and Version</a>), but you cannot downgrade to
     * an earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing replication group and create it anew with
     * the earlier engine version.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * The number of days for which ElastiCache will retain automatic node group
     * snapshots before deleting them. For example, if you set
     * <i>SnapshotRetentionLimit</i> to 5, then a snapshot that was taken today
     * will be retained for 5 days before being deleted.
     * </p>
     * <p>
     * <b>Important</b> If the value of SnapshotRetentionLimit is set to zero
     * (0), backups are turned off.
     * </p>
     */
    private Integer snapshotRetentionLimit;
    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache will begin taking
     * a daily snapshot of the node group specified by
     * <i>SnapshottingClusterId</i>.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, then ElastiCache will automatically
     * choose an appropriate time range.
     * </p>
     */
    private String snapshotWindow;
    /**
     * <p>
     * A valid cache node type that you want to scale this replication group to.
     * The value of this parameter must be one of the
     * <i>ScaleUpModifications</i> values returned by the
     * <code>ListAllowedCacheNodeTypeModification</code> action.
     * </p>
     */
    private String cacheNodeType;

    /**
     * <p>
     * The identifier of the replication group to modify.
     * </p>
     * 
     * @param replicationGroupId
     *        The identifier of the replication group to modify.
     */

    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The identifier of the replication group to modify.
     * </p>
     * 
     * @return The identifier of the replication group to modify.
     */

    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }

    /**
     * <p>
     * The identifier of the replication group to modify.
     * </p>
     * 
     * @param replicationGroupId
     *        The identifier of the replication group to modify.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyReplicationGroupRequest withReplicationGroupId(
            String replicationGroupId) {
        setReplicationGroupId(replicationGroupId);
        return this;
    }

    /**
     * <p>
     * A description for the replication group. Maximum length is 255
     * characters.
     * </p>
     * 
     * @param replicationGroupDescription
     *        A description for the replication group. Maximum length is 255
     *        characters.
     */

    public void setReplicationGroupDescription(
            String replicationGroupDescription) {
        this.replicationGroupDescription = replicationGroupDescription;
    }

    /**
     * <p>
     * A description for the replication group. Maximum length is 255
     * characters.
     * </p>
     * 
     * @return A description for the replication group. Maximum length is 255
     *         characters.
     */

    public String getReplicationGroupDescription() {
        return this.replicationGroupDescription;
    }

    /**
     * <p>
     * A description for the replication group. Maximum length is 255
     * characters.
     * </p>
     * 
     * @param replicationGroupDescription
     *        A description for the replication group. Maximum length is 255
     *        characters.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyReplicationGroupRequest withReplicationGroupDescription(
            String replicationGroupDescription) {
        setReplicationGroupDescription(replicationGroupDescription);
        return this;
    }

    /**
     * <p>
     * If this parameter is specified, ElastiCache will promote the specified
     * cluster in the specified replication group to the primary role. The nodes
     * of all other clusters in the replication group will be read replicas.
     * </p>
     * 
     * @param primaryClusterId
     *        If this parameter is specified, ElastiCache will promote the
     *        specified cluster in the specified replication group to the
     *        primary role. The nodes of all other clusters in the replication
     *        group will be read replicas.
     */

    public void setPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
    }

    /**
     * <p>
     * If this parameter is specified, ElastiCache will promote the specified
     * cluster in the specified replication group to the primary role. The nodes
     * of all other clusters in the replication group will be read replicas.
     * </p>
     * 
     * @return If this parameter is specified, ElastiCache will promote the
     *         specified cluster in the specified replication group to the
     *         primary role. The nodes of all other clusters in the replication
     *         group will be read replicas.
     */

    public String getPrimaryClusterId() {
        return this.primaryClusterId;
    }

    /**
     * <p>
     * If this parameter is specified, ElastiCache will promote the specified
     * cluster in the specified replication group to the primary role. The nodes
     * of all other clusters in the replication group will be read replicas.
     * </p>
     * 
     * @param primaryClusterId
     *        If this parameter is specified, ElastiCache will promote the
     *        specified cluster in the specified replication group to the
     *        primary role. The nodes of all other clusters in the replication
     *        group will be read replicas.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyReplicationGroupRequest withPrimaryClusterId(
            String primaryClusterId) {
        setPrimaryClusterId(primaryClusterId);
        return this;
    }

    /**
     * <p>
     * The cache cluster ID that will be used as the daily snapshot source for
     * the replication group.
     * </p>
     * 
     * @param snapshottingClusterId
     *        The cache cluster ID that will be used as the daily snapshot
     *        source for the replication group.
     */

    public void setSnapshottingClusterId(String snapshottingClusterId) {
        this.snapshottingClusterId = snapshottingClusterId;
    }

    /**
     * <p>
     * The cache cluster ID that will be used as the daily snapshot source for
     * the replication group.
     * </p>
     * 
     * @return The cache cluster ID that will be used as the daily snapshot
     *         source for the replication group.
     */

    public String getSnapshottingClusterId() {
        return this.snapshottingClusterId;
    }

    /**
     * <p>
     * The cache cluster ID that will be used as the daily snapshot source for
     * the replication group.
     * </p>
     * 
     * @param snapshottingClusterId
     *        The cache cluster ID that will be used as the daily snapshot
     *        source for the replication group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyReplicationGroupRequest withSnapshottingClusterId(
            String snapshottingClusterId) {
        setSnapshottingClusterId(snapshottingClusterId);
        return this;
    }

    /**
     * <p>
     * Whether a read replica will be automatically promoted to read/write
     * primary if the existing primary encounters a failure.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <note>
     * <p>
     * ElastiCache Multi-AZ replication groups are not supported on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * T1 and T2 cache node types.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param automaticFailoverEnabled
     *        Whether a read replica will be automatically promoted to
     *        read/write primary if the existing primary encounters a
     *        failure.</p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
     *        <note>
     *        <p>
     *        ElastiCache Multi-AZ replication groups are not supported on:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Redis versions earlier than 2.8.6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        T1 and T2 cache node types.
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setAutomaticFailoverEnabled(Boolean automaticFailoverEnabled) {
        this.automaticFailoverEnabled = automaticFailoverEnabled;
    }

    /**
     * <p>
     * Whether a read replica will be automatically promoted to read/write
     * primary if the existing primary encounters a failure.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <note>
     * <p>
     * ElastiCache Multi-AZ replication groups are not supported on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * T1 and T2 cache node types.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return Whether a read replica will be automatically promoted to
     *         read/write primary if the existing primary encounters a
     *         failure.</p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <note>
     *         <p>
     *         ElastiCache Multi-AZ replication groups are not supported on:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Redis versions earlier than 2.8.6.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         T1 and T2 cache node types.
     *         </p>
     *         </li>
     *         </ul>
     */

    public Boolean getAutomaticFailoverEnabled() {
        return this.automaticFailoverEnabled;
    }

    /**
     * <p>
     * Whether a read replica will be automatically promoted to read/write
     * primary if the existing primary encounters a failure.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <note>
     * <p>
     * ElastiCache Multi-AZ replication groups are not supported on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * T1 and T2 cache node types.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param automaticFailoverEnabled
     *        Whether a read replica will be automatically promoted to
     *        read/write primary if the existing primary encounters a
     *        failure.</p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
     *        <note>
     *        <p>
     *        ElastiCache Multi-AZ replication groups are not supported on:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Redis versions earlier than 2.8.6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        T1 and T2 cache node types.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyReplicationGroupRequest withAutomaticFailoverEnabled(
            Boolean automaticFailoverEnabled) {
        setAutomaticFailoverEnabled(automaticFailoverEnabled);
        return this;
    }

    /**
     * <p>
     * Whether a read replica will be automatically promoted to read/write
     * primary if the existing primary encounters a failure.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <note>
     * <p>
     * ElastiCache Multi-AZ replication groups are not supported on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * T1 and T2 cache node types.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return Whether a read replica will be automatically promoted to
     *         read/write primary if the existing primary encounters a
     *         failure.</p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <note>
     *         <p>
     *         ElastiCache Multi-AZ replication groups are not supported on:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Redis versions earlier than 2.8.6.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         T1 and T2 cache node types.
     *         </p>
     *         </li>
     *         </ul>
     */

    public Boolean isAutomaticFailoverEnabled() {
        return this.automaticFailoverEnabled;
    }

    /**
     * <p>
     * A list of cache security group names to authorize for the clusters in
     * this replication group. This change is asynchronously applied as soon as
     * possible.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing cache
     * clusters running outside of an Amazon Virtual Private Cloud (VPC).
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Must
     * not be "Default".
     * </p>
     * 
     * @return A list of cache security group names to authorize for the
     *         clusters in this replication group. This change is asynchronously
     *         applied as soon as possible.</p>
     *         <p>
     *         This parameter can be used only with replication group containing
     *         cache clusters running outside of an Amazon Virtual Private Cloud
     *         (VPC).
     *         </p>
     *         <p>
     *         Constraints: Must contain no more than 255 alphanumeric
     *         characters. Must not be "Default".
     */

    public java.util.List<String> getCacheSecurityGroupNames() {
        if (cacheSecurityGroupNames == null) {
            cacheSecurityGroupNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return cacheSecurityGroupNames;
    }

    /**
     * <p>
     * A list of cache security group names to authorize for the clusters in
     * this replication group. This change is asynchronously applied as soon as
     * possible.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing cache
     * clusters running outside of an Amazon Virtual Private Cloud (VPC).
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Must
     * not be "Default".
     * </p>
     * 
     * @param cacheSecurityGroupNames
     *        A list of cache security group names to authorize for the clusters
     *        in this replication group. This change is asynchronously applied
     *        as soon as possible.</p>
     *        <p>
     *        This parameter can be used only with replication group containing
     *        cache clusters running outside of an Amazon Virtual Private Cloud
     *        (VPC).
     *        </p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric
     *        characters. Must not be "Default".
     */

    public void setCacheSecurityGroupNames(
            java.util.Collection<String> cacheSecurityGroupNames) {
        if (cacheSecurityGroupNames == null) {
            this.cacheSecurityGroupNames = null;
            return;
        }

        this.cacheSecurityGroupNames = new com.amazonaws.internal.SdkInternalList<String>(
                cacheSecurityGroupNames);
    }

    /**
     * <p>
     * A list of cache security group names to authorize for the clusters in
     * this replication group. This change is asynchronously applied as soon as
     * possible.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing cache
     * clusters running outside of an Amazon Virtual Private Cloud (VPC).
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Must
     * not be "Default".
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCacheSecurityGroupNames(java.util.Collection)} or
     * {@link #withCacheSecurityGroupNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param cacheSecurityGroupNames
     *        A list of cache security group names to authorize for the clusters
     *        in this replication group. This change is asynchronously applied
     *        as soon as possible.</p>
     *        <p>
     *        This parameter can be used only with replication group containing
     *        cache clusters running outside of an Amazon Virtual Private Cloud
     *        (VPC).
     *        </p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric
     *        characters. Must not be "Default".
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyReplicationGroupRequest withCacheSecurityGroupNames(
            String... cacheSecurityGroupNames) {
        if (this.cacheSecurityGroupNames == null) {
            setCacheSecurityGroupNames(new com.amazonaws.internal.SdkInternalList<String>(
                    cacheSecurityGroupNames.length));
        }
        for (String ele : cacheSecurityGroupNames) {
            this.cacheSecurityGroupNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cache security group names to authorize for the clusters in
     * this replication group. This change is asynchronously applied as soon as
     * possible.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing cache
     * clusters running outside of an Amazon Virtual Private Cloud (VPC).
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Must
     * not be "Default".
     * </p>
     * 
     * @param cacheSecurityGroupNames
     *        A list of cache security group names to authorize for the clusters
     *        in this replication group. This change is asynchronously applied
     *        as soon as possible.</p>
     *        <p>
     *        This parameter can be used only with replication group containing
     *        cache clusters running outside of an Amazon Virtual Private Cloud
     *        (VPC).
     *        </p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric
     *        characters. Must not be "Default".
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyReplicationGroupRequest withCacheSecurityGroupNames(
            java.util.Collection<String> cacheSecurityGroupNames) {
        setCacheSecurityGroupNames(cacheSecurityGroupNames);
        return this;
    }

    /**
     * <p>
     * Specifies the VPC Security Groups associated with the cache clusters in
     * the replication group.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing cache
     * clusters running in an Amazon Virtual Private Cloud (VPC).
     * </p>
     * 
     * @return Specifies the VPC Security Groups associated with the cache
     *         clusters in the replication group.</p>
     *         <p>
     *         This parameter can be used only with replication group containing
     *         cache clusters running in an Amazon Virtual Private Cloud (VPC).
     */

    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
            securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroupIds;
    }

    /**
     * <p>
     * Specifies the VPC Security Groups associated with the cache clusters in
     * the replication group.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing cache
     * clusters running in an Amazon Virtual Private Cloud (VPC).
     * </p>
     * 
     * @param securityGroupIds
     *        Specifies the VPC Security Groups associated with the cache
     *        clusters in the replication group.</p>
     *        <p>
     *        This parameter can be used only with replication group containing
     *        cache clusters running in an Amazon Virtual Private Cloud (VPC).
     */

    public void setSecurityGroupIds(
            java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(
                securityGroupIds);
    }

    /**
     * <p>
     * Specifies the VPC Security Groups associated with the cache clusters in
     * the replication group.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing cache
     * clusters running in an Amazon Virtual Private Cloud (VPC).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSecurityGroupIds(java.util.Collection)} or
     * {@link #withSecurityGroupIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        Specifies the VPC Security Groups associated with the cache
     *        clusters in the replication group.</p>
     *        <p>
     *        This parameter can be used only with replication group containing
     *        cache clusters running in an Amazon Virtual Private Cloud (VPC).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyReplicationGroupRequest withSecurityGroupIds(
            String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(
                    securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the VPC Security Groups associated with the cache clusters in
     * the replication group.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing cache
     * clusters running in an Amazon Virtual Private Cloud (VPC).
     * </p>
     * 
     * @param securityGroupIds
     *        Specifies the VPC Security Groups associated with the cache
     *        clusters in the replication group.</p>
     *        <p>
     *        This parameter can be used only with replication group containing
     *        cache clusters running in an Amazon Virtual Private Cloud (VPC).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyReplicationGroupRequest withSecurityGroupIds(
            java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cache
     * cluster is performed. It is specified as a range in the format
     * ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window
     * is a 60 minute period. Valid values for <code>ddd</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sun</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tue</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>thu</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sat</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>sun:05:00-sun:09:00</code>
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        Specifies the weekly time range during which maintenance on the
     *        cache cluster is performed. It is specified as a range in the
     *        format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum
     *        maintenance window is a 60 minute period. Valid values for
     *        <code>ddd</code> are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sun</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mon</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tue</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>wed</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>thu</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fri</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sat</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>sun:05:00-sun:09:00</code>
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cache
     * cluster is performed. It is specified as a range in the format
     * ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window
     * is a 60 minute period. Valid values for <code>ddd</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sun</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tue</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>thu</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sat</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>sun:05:00-sun:09:00</code>
     * </p>
     * 
     * @return Specifies the weekly time range during which maintenance on the
     *         cache cluster is performed. It is specified as a range in the
     *         format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum
     *         maintenance window is a 60 minute period. Valid values for
     *         <code>ddd</code> are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>sun</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mon</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tue</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>wed</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>thu</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>fri</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sat</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>sun:05:00-sun:09:00</code>
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cache
     * cluster is performed. It is specified as a range in the format
     * ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window
     * is a 60 minute period. Valid values for <code>ddd</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sun</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tue</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>thu</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sat</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>sun:05:00-sun:09:00</code>
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        Specifies the weekly time range during which maintenance on the
     *        cache cluster is performed. It is specified as a range in the
     *        format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum
     *        maintenance window is a 60 minute period. Valid values for
     *        <code>ddd</code> are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sun</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mon</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tue</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>wed</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>thu</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fri</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sat</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>sun:05:00-sun:09:00</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyReplicationGroupRequest withPreferredMaintenanceWindow(
            String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     * notifications will be sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be same as the replication group owner.
     * </p>
     * </note>
     * 
     * @param notificationTopicArn
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     *        notifications will be sent.</p> <note>
     *        <p>
     *        The Amazon SNS topic owner must be same as the replication group
     *        owner.
     *        </p>
     */

    public void setNotificationTopicArn(String notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     * notifications will be sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be same as the replication group owner.
     * </p>
     * </note>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     *         notifications will be sent.</p> <note>
     *         <p>
     *         The Amazon SNS topic owner must be same as the replication group
     *         owner.
     *         </p>
     */

    public String getNotificationTopicArn() {
        return this.notificationTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     * notifications will be sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be same as the replication group owner.
     * </p>
     * </note>
     * 
     * @param notificationTopicArn
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     *        notifications will be sent.</p> <note>
     *        <p>
     *        The Amazon SNS topic owner must be same as the replication group
     *        owner.
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyReplicationGroupRequest withNotificationTopicArn(
            String notificationTopicArn) {
        setNotificationTopicArn(notificationTopicArn);
        return this;
    }

    /**
     * <p>
     * The name of the cache parameter group to apply to all of the clusters in
     * this replication group. This change is asynchronously applied as soon as
     * possible for parameters when the <i>ApplyImmediately</i> parameter is
     * specified as <i>true</i> for this request.
     * </p>
     * 
     * @param cacheParameterGroupName
     *        The name of the cache parameter group to apply to all of the
     *        clusters in this replication group. This change is asynchronously
     *        applied as soon as possible for parameters when the
     *        <i>ApplyImmediately</i> parameter is specified as <i>true</i> for
     *        this request.
     */

    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group to apply to all of the clusters in
     * this replication group. This change is asynchronously applied as soon as
     * possible for parameters when the <i>ApplyImmediately</i> parameter is
     * specified as <i>true</i> for this request.
     * </p>
     * 
     * @return The name of the cache parameter group to apply to all of the
     *         clusters in this replication group. This change is asynchronously
     *         applied as soon as possible for parameters when the
     *         <i>ApplyImmediately</i> parameter is specified as <i>true</i> for
     *         this request.
     */

    public String getCacheParameterGroupName() {
        return this.cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group to apply to all of the clusters in
     * this replication group. This change is asynchronously applied as soon as
     * possible for parameters when the <i>ApplyImmediately</i> parameter is
     * specified as <i>true</i> for this request.
     * </p>
     * 
     * @param cacheParameterGroupName
     *        The name of the cache parameter group to apply to all of the
     *        clusters in this replication group. This change is asynchronously
     *        applied as soon as possible for parameters when the
     *        <i>ApplyImmediately</i> parameter is specified as <i>true</i> for
     *        this request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyReplicationGroupRequest withCacheParameterGroupName(
            String cacheParameterGroupName) {
        setCacheParameterGroupName(cacheParameterGroupName);
        return this;
    }

    /**
     * <p>
     * The status of the Amazon SNS notification topic for the replication
     * group. Notifications are sent only if the status is <i>active</i>.
     * </p>
     * <p>
     * Valid values: <code>active</code> | <code>inactive</code>
     * </p>
     * 
     * @param notificationTopicStatus
     *        The status of the Amazon SNS notification topic for the
     *        replication group. Notifications are sent only if the status is
     *        <i>active</i>.</p>
     *        <p>
     *        Valid values: <code>active</code> | <code>inactive</code>
     */

    public void setNotificationTopicStatus(String notificationTopicStatus) {
        this.notificationTopicStatus = notificationTopicStatus;
    }

    /**
     * <p>
     * The status of the Amazon SNS notification topic for the replication
     * group. Notifications are sent only if the status is <i>active</i>.
     * </p>
     * <p>
     * Valid values: <code>active</code> | <code>inactive</code>
     * </p>
     * 
     * @return The status of the Amazon SNS notification topic for the
     *         replication group. Notifications are sent only if the status is
     *         <i>active</i>.</p>
     *         <p>
     *         Valid values: <code>active</code> | <code>inactive</code>
     */

    public String getNotificationTopicStatus() {
        return this.notificationTopicStatus;
    }

    /**
     * <p>
     * The status of the Amazon SNS notification topic for the replication
     * group. Notifications are sent only if the status is <i>active</i>.
     * </p>
     * <p>
     * Valid values: <code>active</code> | <code>inactive</code>
     * </p>
     * 
     * @param notificationTopicStatus
     *        The status of the Amazon SNS notification topic for the
     *        replication group. Notifications are sent only if the status is
     *        <i>active</i>.</p>
     *        <p>
     *        Valid values: <code>active</code> | <code>inactive</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyReplicationGroupRequest withNotificationTopicStatus(
            String notificationTopicStatus) {
        setNotificationTopicStatus(notificationTopicStatus);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, this parameter causes the modifications in this
     * request and any pending modifications to be applied, asynchronously and
     * as soon as possible, regardless of the <i>PreferredMaintenanceWindow</i>
     * setting for the replication group.
     * </p>
     * <p>
     * If <code>false</code>, then changes to the nodes in the replication group
     * are applied on the next maintenance reboot, or the next failure reboot,
     * whichever occurs first.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param applyImmediately
     *        If <code>true</code>, this parameter causes the modifications in
     *        this request and any pending modifications to be applied,
     *        asynchronously and as soon as possible, regardless of the
     *        <i>PreferredMaintenanceWindow</i> setting for the replication
     *        group.</p>
     *        <p>
     *        If <code>false</code>, then changes to the nodes in the
     *        replication group are applied on the next maintenance reboot, or
     *        the next failure reboot, whichever occurs first.
     *        </p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * If <code>true</code>, this parameter causes the modifications in this
     * request and any pending modifications to be applied, asynchronously and
     * as soon as possible, regardless of the <i>PreferredMaintenanceWindow</i>
     * setting for the replication group.
     * </p>
     * <p>
     * If <code>false</code>, then changes to the nodes in the replication group
     * are applied on the next maintenance reboot, or the next failure reboot,
     * whichever occurs first.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return If <code>true</code>, this parameter causes the modifications in
     *         this request and any pending modifications to be applied,
     *         asynchronously and as soon as possible, regardless of the
     *         <i>PreferredMaintenanceWindow</i> setting for the replication
     *         group.</p>
     *         <p>
     *         If <code>false</code>, then changes to the nodes in the
     *         replication group are applied on the next maintenance reboot, or
     *         the next failure reboot, whichever occurs first.
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * If <code>true</code>, this parameter causes the modifications in this
     * request and any pending modifications to be applied, asynchronously and
     * as soon as possible, regardless of the <i>PreferredMaintenanceWindow</i>
     * setting for the replication group.
     * </p>
     * <p>
     * If <code>false</code>, then changes to the nodes in the replication group
     * are applied on the next maintenance reboot, or the next failure reboot,
     * whichever occurs first.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param applyImmediately
     *        If <code>true</code>, this parameter causes the modifications in
     *        this request and any pending modifications to be applied,
     *        asynchronously and as soon as possible, regardless of the
     *        <i>PreferredMaintenanceWindow</i> setting for the replication
     *        group.</p>
     *        <p>
     *        If <code>false</code>, then changes to the nodes in the
     *        replication group are applied on the next maintenance reboot, or
     *        the next failure reboot, whichever occurs first.
     *        </p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyReplicationGroupRequest withApplyImmediately(
            Boolean applyImmediately) {
        setApplyImmediately(applyImmediately);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, this parameter causes the modifications in this
     * request and any pending modifications to be applied, asynchronously and
     * as soon as possible, regardless of the <i>PreferredMaintenanceWindow</i>
     * setting for the replication group.
     * </p>
     * <p>
     * If <code>false</code>, then changes to the nodes in the replication group
     * are applied on the next maintenance reboot, or the next failure reboot,
     * whichever occurs first.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return If <code>true</code>, this parameter causes the modifications in
     *         this request and any pending modifications to be applied,
     *         asynchronously and as soon as possible, regardless of the
     *         <i>PreferredMaintenanceWindow</i> setting for the replication
     *         group.</p>
     *         <p>
     *         If <code>false</code>, then changes to the nodes in the
     *         replication group are applied on the next maintenance reboot, or
     *         the next failure reboot, whichever occurs first.
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * The upgraded version of the cache engine to be run on the cache clusters
     * in the replication group.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement"
     * >Selecting a Cache Engine and Version</a>), but you cannot downgrade to
     * an earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing replication group and create it anew with
     * the earlier engine version.
     * </p>
     * 
     * @param engineVersion
     *        The upgraded version of the cache engine to be run on the cache
     *        clusters in the replication group.</p>
     *        <p>
     *        <b>Important:</b> You can upgrade to a newer engine version (see
     *        <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement"
     *        >Selecting a Cache Engine and Version</a>), but you cannot
     *        downgrade to an earlier engine version. If you want to use an
     *        earlier engine version, you must delete the existing replication
     *        group and create it anew with the earlier engine version.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The upgraded version of the cache engine to be run on the cache clusters
     * in the replication group.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement"
     * >Selecting a Cache Engine and Version</a>), but you cannot downgrade to
     * an earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing replication group and create it anew with
     * the earlier engine version.
     * </p>
     * 
     * @return The upgraded version of the cache engine to be run on the cache
     *         clusters in the replication group.</p>
     *         <p>
     *         <b>Important:</b> You can upgrade to a newer engine version (see
     *         <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement"
     *         >Selecting a Cache Engine and Version</a>), but you cannot
     *         downgrade to an earlier engine version. If you want to use an
     *         earlier engine version, you must delete the existing replication
     *         group and create it anew with the earlier engine version.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The upgraded version of the cache engine to be run on the cache clusters
     * in the replication group.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement"
     * >Selecting a Cache Engine and Version</a>), but you cannot downgrade to
     * an earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing replication group and create it anew with
     * the earlier engine version.
     * </p>
     * 
     * @param engineVersion
     *        The upgraded version of the cache engine to be run on the cache
     *        clusters in the replication group.</p>
     *        <p>
     *        <b>Important:</b> You can upgrade to a newer engine version (see
     *        <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement"
     *        >Selecting a Cache Engine and Version</a>), but you cannot
     *        downgrade to an earlier engine version. If you want to use an
     *        earlier engine version, you must delete the existing replication
     *        group and create it anew with the earlier engine version.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyReplicationGroupRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        This parameter is currently disabled.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     * 
     * @return This parameter is currently disabled.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        This parameter is currently disabled.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyReplicationGroupRequest withAutoMinorVersionUpgrade(
            Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     * 
     * @return This parameter is currently disabled.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * The number of days for which ElastiCache will retain automatic node group
     * snapshots before deleting them. For example, if you set
     * <i>SnapshotRetentionLimit</i> to 5, then a snapshot that was taken today
     * will be retained for 5 days before being deleted.
     * </p>
     * <p>
     * <b>Important</b> If the value of SnapshotRetentionLimit is set to zero
     * (0), backups are turned off.
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which ElastiCache will retain automatic
     *        node group snapshots before deleting them. For example, if you set
     *        <i>SnapshotRetentionLimit</i> to 5, then a snapshot that was taken
     *        today will be retained for 5 days before being deleted.</p>
     *        <p>
     *        <b>Important</b> If the value of SnapshotRetentionLimit is set to
     *        zero (0), backups are turned off.
     */

    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which ElastiCache will retain automatic node group
     * snapshots before deleting them. For example, if you set
     * <i>SnapshotRetentionLimit</i> to 5, then a snapshot that was taken today
     * will be retained for 5 days before being deleted.
     * </p>
     * <p>
     * <b>Important</b> If the value of SnapshotRetentionLimit is set to zero
     * (0), backups are turned off.
     * </p>
     * 
     * @return The number of days for which ElastiCache will retain automatic
     *         node group snapshots before deleting them. For example, if you
     *         set <i>SnapshotRetentionLimit</i> to 5, then a snapshot that was
     *         taken today will be retained for 5 days before being deleted.</p>
     *         <p>
     *         <b>Important</b> If the value of SnapshotRetentionLimit is set to
     *         zero (0), backups are turned off.
     */

    public Integer getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which ElastiCache will retain automatic node group
     * snapshots before deleting them. For example, if you set
     * <i>SnapshotRetentionLimit</i> to 5, then a snapshot that was taken today
     * will be retained for 5 days before being deleted.
     * </p>
     * <p>
     * <b>Important</b> If the value of SnapshotRetentionLimit is set to zero
     * (0), backups are turned off.
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which ElastiCache will retain automatic
     *        node group snapshots before deleting them. For example, if you set
     *        <i>SnapshotRetentionLimit</i> to 5, then a snapshot that was taken
     *        today will be retained for 5 days before being deleted.</p>
     *        <p>
     *        <b>Important</b> If the value of SnapshotRetentionLimit is set to
     *        zero (0), backups are turned off.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyReplicationGroupRequest withSnapshotRetentionLimit(
            Integer snapshotRetentionLimit) {
        setSnapshotRetentionLimit(snapshotRetentionLimit);
        return this;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache will begin taking
     * a daily snapshot of the node group specified by
     * <i>SnapshottingClusterId</i>.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, then ElastiCache will automatically
     * choose an appropriate time range.
     * </p>
     * 
     * @param snapshotWindow
     *        The daily time range (in UTC) during which ElastiCache will begin
     *        taking a daily snapshot of the node group specified by
     *        <i>SnapshottingClusterId</i>.</p>
     *        <p>
     *        Example: <code>05:00-09:00</code>
     *        </p>
     *        <p>
     *        If you do not specify this parameter, then ElastiCache will
     *        automatically choose an appropriate time range.
     */

    public void setSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache will begin taking
     * a daily snapshot of the node group specified by
     * <i>SnapshottingClusterId</i>.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, then ElastiCache will automatically
     * choose an appropriate time range.
     * </p>
     * 
     * @return The daily time range (in UTC) during which ElastiCache will begin
     *         taking a daily snapshot of the node group specified by
     *         <i>SnapshottingClusterId</i>.</p>
     *         <p>
     *         Example: <code>05:00-09:00</code>
     *         </p>
     *         <p>
     *         If you do not specify this parameter, then ElastiCache will
     *         automatically choose an appropriate time range.
     */

    public String getSnapshotWindow() {
        return this.snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache will begin taking
     * a daily snapshot of the node group specified by
     * <i>SnapshottingClusterId</i>.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, then ElastiCache will automatically
     * choose an appropriate time range.
     * </p>
     * 
     * @param snapshotWindow
     *        The daily time range (in UTC) during which ElastiCache will begin
     *        taking a daily snapshot of the node group specified by
     *        <i>SnapshottingClusterId</i>.</p>
     *        <p>
     *        Example: <code>05:00-09:00</code>
     *        </p>
     *        <p>
     *        If you do not specify this parameter, then ElastiCache will
     *        automatically choose an appropriate time range.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyReplicationGroupRequest withSnapshotWindow(
            String snapshotWindow) {
        setSnapshotWindow(snapshotWindow);
        return this;
    }

    /**
     * <p>
     * A valid cache node type that you want to scale this replication group to.
     * The value of this parameter must be one of the
     * <i>ScaleUpModifications</i> values returned by the
     * <code>ListAllowedCacheNodeTypeModification</code> action.
     * </p>
     * 
     * @param cacheNodeType
     *        A valid cache node type that you want to scale this replication
     *        group to. The value of this parameter must be one of the
     *        <i>ScaleUpModifications</i> values returned by the
     *        <code>ListAllowedCacheNodeTypeModification</code> action.
     */

    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    /**
     * <p>
     * A valid cache node type that you want to scale this replication group to.
     * The value of this parameter must be one of the
     * <i>ScaleUpModifications</i> values returned by the
     * <code>ListAllowedCacheNodeTypeModification</code> action.
     * </p>
     * 
     * @return A valid cache node type that you want to scale this replication
     *         group to. The value of this parameter must be one of the
     *         <i>ScaleUpModifications</i> values returned by the
     *         <code>ListAllowedCacheNodeTypeModification</code> action.
     */

    public String getCacheNodeType() {
        return this.cacheNodeType;
    }

    /**
     * <p>
     * A valid cache node type that you want to scale this replication group to.
     * The value of this parameter must be one of the
     * <i>ScaleUpModifications</i> values returned by the
     * <code>ListAllowedCacheNodeTypeModification</code> action.
     * </p>
     * 
     * @param cacheNodeType
     *        A valid cache node type that you want to scale this replication
     *        group to. The value of this parameter must be one of the
     *        <i>ScaleUpModifications</i> values returned by the
     *        <code>ListAllowedCacheNodeTypeModification</code> action.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyReplicationGroupRequest withCacheNodeType(String cacheNodeType) {
        setCacheNodeType(cacheNodeType);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: " + getReplicationGroupId() + ",");
        if (getReplicationGroupDescription() != null)
            sb.append("ReplicationGroupDescription: "
                    + getReplicationGroupDescription() + ",");
        if (getPrimaryClusterId() != null)
            sb.append("PrimaryClusterId: " + getPrimaryClusterId() + ",");
        if (getSnapshottingClusterId() != null)
            sb.append("SnapshottingClusterId: " + getSnapshottingClusterId()
                    + ",");
        if (getAutomaticFailoverEnabled() != null)
            sb.append("AutomaticFailoverEnabled: "
                    + getAutomaticFailoverEnabled() + ",");
        if (getCacheSecurityGroupNames() != null)
            sb.append("CacheSecurityGroupNames: "
                    + getCacheSecurityGroupNames() + ",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: "
                    + getPreferredMaintenanceWindow() + ",");
        if (getNotificationTopicArn() != null)
            sb.append("NotificationTopicArn: " + getNotificationTopicArn()
                    + ",");
        if (getCacheParameterGroupName() != null)
            sb.append("CacheParameterGroupName: "
                    + getCacheParameterGroupName() + ",");
        if (getNotificationTopicStatus() != null)
            sb.append("NotificationTopicStatus: "
                    + getNotificationTopicStatus() + ",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: " + getApplyImmediately() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: "
                    + getAutoMinorVersionUpgrade() + ",");
        if (getSnapshotRetentionLimit() != null)
            sb.append("SnapshotRetentionLimit: " + getSnapshotRetentionLimit()
                    + ",");
        if (getSnapshotWindow() != null)
            sb.append("SnapshotWindow: " + getSnapshotWindow() + ",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: " + getCacheNodeType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyReplicationGroupRequest == false)
            return false;
        ModifyReplicationGroupRequest other = (ModifyReplicationGroupRequest) obj;
        if (other.getReplicationGroupId() == null
                ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null
                && other.getReplicationGroupId().equals(
                        this.getReplicationGroupId()) == false)
            return false;
        if (other.getReplicationGroupDescription() == null
                ^ this.getReplicationGroupDescription() == null)
            return false;
        if (other.getReplicationGroupDescription() != null
                && other.getReplicationGroupDescription().equals(
                        this.getReplicationGroupDescription()) == false)
            return false;
        if (other.getPrimaryClusterId() == null
                ^ this.getPrimaryClusterId() == null)
            return false;
        if (other.getPrimaryClusterId() != null
                && other.getPrimaryClusterId().equals(
                        this.getPrimaryClusterId()) == false)
            return false;
        if (other.getSnapshottingClusterId() == null
                ^ this.getSnapshottingClusterId() == null)
            return false;
        if (other.getSnapshottingClusterId() != null
                && other.getSnapshottingClusterId().equals(
                        this.getSnapshottingClusterId()) == false)
            return false;
        if (other.getAutomaticFailoverEnabled() == null
                ^ this.getAutomaticFailoverEnabled() == null)
            return false;
        if (other.getAutomaticFailoverEnabled() != null
                && other.getAutomaticFailoverEnabled().equals(
                        this.getAutomaticFailoverEnabled()) == false)
            return false;
        if (other.getCacheSecurityGroupNames() == null
                ^ this.getCacheSecurityGroupNames() == null)
            return false;
        if (other.getCacheSecurityGroupNames() != null
                && other.getCacheSecurityGroupNames().equals(
                        this.getCacheSecurityGroupNames()) == false)
            return false;
        if (other.getSecurityGroupIds() == null
                ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null
                && other.getSecurityGroupIds().equals(
                        this.getSecurityGroupIds()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null
                ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null
                && other.getPreferredMaintenanceWindow().equals(
                        this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getNotificationTopicArn() == null
                ^ this.getNotificationTopicArn() == null)
            return false;
        if (other.getNotificationTopicArn() != null
                && other.getNotificationTopicArn().equals(
                        this.getNotificationTopicArn()) == false)
            return false;
        if (other.getCacheParameterGroupName() == null
                ^ this.getCacheParameterGroupName() == null)
            return false;
        if (other.getCacheParameterGroupName() != null
                && other.getCacheParameterGroupName().equals(
                        this.getCacheParameterGroupName()) == false)
            return false;
        if (other.getNotificationTopicStatus() == null
                ^ this.getNotificationTopicStatus() == null)
            return false;
        if (other.getNotificationTopicStatus() != null
                && other.getNotificationTopicStatus().equals(
                        this.getNotificationTopicStatus()) == false)
            return false;
        if (other.getApplyImmediately() == null
                ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null
                && other.getApplyImmediately().equals(
                        this.getApplyImmediately()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null
                ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null
                && other.getAutoMinorVersionUpgrade().equals(
                        this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getSnapshotRetentionLimit() == null
                ^ this.getSnapshotRetentionLimit() == null)
            return false;
        if (other.getSnapshotRetentionLimit() != null
                && other.getSnapshotRetentionLimit().equals(
                        this.getSnapshotRetentionLimit()) == false)
            return false;
        if (other.getSnapshotWindow() == null
                ^ this.getSnapshotWindow() == null)
            return false;
        if (other.getSnapshotWindow() != null
                && other.getSnapshotWindow().equals(this.getSnapshotWindow()) == false)
            return false;
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null)
            return false;
        if (other.getCacheNodeType() != null
                && other.getCacheNodeType().equals(this.getCacheNodeType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReplicationGroupId() == null) ? 0
                        : getReplicationGroupId().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationGroupDescription() == null) ? 0
                        : getReplicationGroupDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getPrimaryClusterId() == null) ? 0 : getPrimaryClusterId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshottingClusterId() == null) ? 0
                        : getSnapshottingClusterId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutomaticFailoverEnabled() == null) ? 0
                        : getAutomaticFailoverEnabled().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheSecurityGroupNames() == null) ? 0
                        : getCacheSecurityGroupNames().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredMaintenanceWindow() == null) ? 0
                        : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime
                * hashCode
                + ((getNotificationTopicArn() == null) ? 0
                        : getNotificationTopicArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheParameterGroupName() == null) ? 0
                        : getCacheParameterGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getNotificationTopicStatus() == null) ? 0
                        : getNotificationTopicStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getApplyImmediately() == null) ? 0 : getApplyImmediately()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoMinorVersionUpgrade() == null) ? 0
                        : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotRetentionLimit() == null) ? 0
                        : getSnapshotRetentionLimit().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotWindow() == null) ? 0 : getSnapshotWindow()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheNodeType() == null) ? 0 : getCacheNodeType()
                        .hashCode());
        return hashCode;
    }

    @Override
    public ModifyReplicationGroupRequest clone() {
        return (ModifyReplicationGroupRequest) super.clone();
    }
}