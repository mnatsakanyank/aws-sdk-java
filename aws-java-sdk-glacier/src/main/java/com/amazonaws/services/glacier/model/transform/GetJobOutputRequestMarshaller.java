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

package com.amazonaws.services.glacier.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * GetJobOutputRequest Marshaller
 */
public class GetJobOutputRequestMarshaller implements
        Marshaller<Request<GetJobOutputRequest>, GetJobOutputRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public GetJobOutputRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetJobOutputRequest> marshall(
            GetJobOutputRequest getJobOutputRequest) {

        if (getJobOutputRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<GetJobOutputRequest> request = new DefaultRequest<GetJobOutputRequest>(
                getJobOutputRequest, "AmazonGlacier");

        request.setHttpMethod(HttpMethodName.GET);

        if (getJobOutputRequest.getRange() != null) {
            request.addHeader("Range",
                    StringUtils.fromString(getJobOutputRequest.getRange()));
        }

        String uriResourcePath = "/{accountId}/vaults/{vaultName}/jobs/{jobId}/output";

        uriResourcePath = uriResourcePath.replace(
                "{accountId}",
                (getJobOutputRequest.getAccountId() != null) ? SdkHttpUtils
                        .urlEncode(StringUtils.fromString(getJobOutputRequest
                                .getAccountId()), false) : "");
        uriResourcePath = uriResourcePath.replace(
                "{vaultName}",
                (getJobOutputRequest.getVaultName() != null) ? SdkHttpUtils
                        .urlEncode(StringUtils.fromString(getJobOutputRequest
                                .getVaultName()), false) : "");
        uriResourcePath = uriResourcePath.replace(
                "{jobId}",
                (getJobOutputRequest.getJobId() != null) ? SdkHttpUtils
                        .urlEncode(StringUtils.fromString(getJobOutputRequest
                                .getJobId()), false) : "");
        request.setResourcePath(uriResourcePath);

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
