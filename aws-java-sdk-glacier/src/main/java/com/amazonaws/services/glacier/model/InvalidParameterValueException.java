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

package com.amazonaws.services.glacier.model;

/**
 * <p>
 * Returned if a parameter of the request is incorrectly specified.
 * </p>
 */
public class InvalidParameterValueException extends
        com.amazonaws.services.glacier.model.AmazonGlacierException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Client
     * </p>
     */
    private String type;
    /**
     * <p>
     * 400 Bad Request
     * </p>
     */
    private String code;

    /**
     * Constructs a new InvalidParameterValueException with the specified error
     * message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidParameterValueException(String message) {
        super(message);
    }

    /**
     * <p>
     * Client
     * </p>
     * 
     * @param type
     *        Client
     */

    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Client
     * </p>
     * 
     * @return Client
     */

    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Client
     * </p>
     * 
     * @param type
     *        Client
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InvalidParameterValueException withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * 400 Bad Request
     * </p>
     * 
     * @param code
     *        400 Bad Request
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * 400 Bad Request
     * </p>
     * 
     * @return 400 Bad Request
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * 400 Bad Request
     * </p>
     * 
     * @param code
     *        400 Bad Request
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InvalidParameterValueException withCode(String code) {
        setCode(code);
        return this;
    }

}