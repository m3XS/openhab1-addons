/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.ecobee.messages;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * The Page object contains the response page information.
 *
 * @see <a href="https://www.ecobee.com/home/developer/api/documentation/v1/objects/Page.shtml">Page</a>
 * @author John Cocula
 * @since 1.7.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Page extends AbstractMessagePart {
    private Integer page;
    private Integer totalPages;
    private Integer pageSize;
    private Integer total;

    /**
     * Construct a Page.
     * 
     * @param page
     *            the specific page requested
     */
    public Page(@JsonProperty("page") final Integer page) {
        this.page = page;
    }

    /**
     * @return the page retrieved or, in the case of a request parameter, the specific page requested
     */
    @JsonProperty("page")
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return the total pages available
     */
    @JsonProperty("totalPages")
    public Integer getTotalPages() {
        return this.totalPages;
    }

    /**
     * @return the number of objects on this page
     */
    @JsonProperty("pageSize")
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return the total number of objects available
     */
    @JsonProperty("total")
    public Integer getTotal() {
        return this.total;
    }

    @Override
    public String toString() {
        final ToStringBuilder builder = createToStringBuilder();
        builder.appendSuper(super.toString());
        builder.append("page", this.page);
        builder.append("totalPages", this.totalPages);
        builder.append("pageSize", this.pageSize);
        builder.append("total", this.total);

        return builder.toString();
    }
}
