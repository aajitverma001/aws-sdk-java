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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the number of in-application streams to create for a given streaming source. For information about
 * parallellism, see <a
 * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application
 * Input</a>.
 * </p>
 */
public class InputParallelism implements Serializable, Cloneable {

    /**
     * <p>
     * Number of in-application streams to create. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html">Limits</a>.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * Number of in-application streams to create. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html">Limits</a>.
     * </p>
     * 
     * @param count
     *        Number of in-application streams to create. For more information, see <a
     *        href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html">Limits</a>.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * Number of in-application streams to create. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html">Limits</a>.
     * </p>
     * 
     * @return Number of in-application streams to create. For more information, see <a
     *         href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html">Limits</a>.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * Number of in-application streams to create. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html">Limits</a>.
     * </p>
     * 
     * @param count
     *        Number of in-application streams to create. For more information, see <a
     *        href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html">Limits</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputParallelism withCount(Integer count) {
        setCount(count);
        return this;
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputParallelism == false)
            return false;
        InputParallelism other = (InputParallelism) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public InputParallelism clone() {
        try {
            return (InputParallelism) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
