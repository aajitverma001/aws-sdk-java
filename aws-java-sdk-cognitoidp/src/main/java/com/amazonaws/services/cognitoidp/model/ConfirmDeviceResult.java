/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;

/**
 * <p>
 * Confirms the device response.
 * </p>
 */
public class ConfirmDeviceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether the user confirmation is necessary to confirm the device response.
     * </p>
     */
    private Boolean userConfirmationNecessary;

    /**
     * <p>
     * Indicates whether the user confirmation is necessary to confirm the device response.
     * </p>
     * 
     * @param userConfirmationNecessary
     *        Indicates whether the user confirmation is necessary to confirm the device response.
     */

    public void setUserConfirmationNecessary(Boolean userConfirmationNecessary) {
        this.userConfirmationNecessary = userConfirmationNecessary;
    }

    /**
     * <p>
     * Indicates whether the user confirmation is necessary to confirm the device response.
     * </p>
     * 
     * @return Indicates whether the user confirmation is necessary to confirm the device response.
     */

    public Boolean getUserConfirmationNecessary() {
        return this.userConfirmationNecessary;
    }

    /**
     * <p>
     * Indicates whether the user confirmation is necessary to confirm the device response.
     * </p>
     * 
     * @param userConfirmationNecessary
     *        Indicates whether the user confirmation is necessary to confirm the device response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfirmDeviceResult withUserConfirmationNecessary(Boolean userConfirmationNecessary) {
        setUserConfirmationNecessary(userConfirmationNecessary);
        return this;
    }

    /**
     * <p>
     * Indicates whether the user confirmation is necessary to confirm the device response.
     * </p>
     * 
     * @return Indicates whether the user confirmation is necessary to confirm the device response.
     */

    public Boolean isUserConfirmationNecessary() {
        return this.userConfirmationNecessary;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserConfirmationNecessary() != null)
            sb.append("UserConfirmationNecessary: ").append(getUserConfirmationNecessary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfirmDeviceResult == false)
            return false;
        ConfirmDeviceResult other = (ConfirmDeviceResult) obj;
        if (other.getUserConfirmationNecessary() == null ^ this.getUserConfirmationNecessary() == null)
            return false;
        if (other.getUserConfirmationNecessary() != null && other.getUserConfirmationNecessary().equals(this.getUserConfirmationNecessary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserConfirmationNecessary() == null) ? 0 : getUserConfirmationNecessary().hashCode());
        return hashCode;
    }

    @Override
    public ConfirmDeviceResult clone() {
        try {
            return (ConfirmDeviceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
