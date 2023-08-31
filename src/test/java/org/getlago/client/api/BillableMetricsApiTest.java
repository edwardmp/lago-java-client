/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.46.0-beta
 * Contact: tech@getlago.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.getlago.client.api;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.BillableMetric;
import org.openapitools.client.model.BillableMetricCreateInput;
import org.openapitools.client.model.BillableMetricUpdateInput;
import org.openapitools.client.model.BillableMetricsPaginated;
import org.openapitools.client.model.GroupsPaginated;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for BillableMetricsApi
 */
@Ignore
public class BillableMetricsApiTest {

    private final BillableMetricsApi api = new BillableMetricsApi();

    
    /**
     * Create a billable metric
     *
     * This endpoint creates a new billable metric representing a pricing component of your application.
     */
    @Test
    public void createBillableMetricTest()  {
        BillableMetricCreateInput billableMetricCreateInput = null;
        BillableMetric response = api.createBillableMetric(billableMetricCreateInput).block();

        // TODO: test validations
    }
    
    /**
     * Delete a billable metric
     *
     * This endpoint deletes an existing billable metric representing a pricing component of your application.
     */
    @Test
    public void destroyBillableMetricTest()  {
        String code = null;
        BillableMetric response = api.destroyBillableMetric(code).block();

        // TODO: test validations
    }
    
    /**
     * Find a billable metric&#39;s groups
     *
     * This endpoint retrieves all groups for a billable metric.
     */
    @Test
    public void findAllBillableMetricGroupsTest()  {
        String code = null;
        Integer page = null;
        Integer perPage = null;
        GroupsPaginated response = api.findAllBillableMetricGroups(code, page, perPage).block();

        // TODO: test validations
    }
    
    /**
     * List all billable metrics
     *
     * This endpoint retrieves all existing billable metrics that represent pricing components of your application.
     */
    @Test
    public void findAllBillableMetricsTest()  {
        Integer page = null;
        Integer perPage = null;
        BillableMetricsPaginated response = api.findAllBillableMetrics(page, perPage).block();

        // TODO: test validations
    }
    
    /**
     * Retrieve a billable metric
     *
     * This endpoint retrieves an existing billable metric that represents a pricing component of your application. The billable metric is identified by its unique code.
     */
    @Test
    public void findBillableMetricTest()  {
        String code = null;
        BillableMetric response = api.findBillableMetric(code).block();

        // TODO: test validations
    }
    
    /**
     * Update a billable metric
     *
     * This endpoint updates an existing billable metric representing a pricing component of your application.
     */
    @Test
    public void updateBillableMetricTest()  {
        String code = null;
        BillableMetricUpdateInput billableMetricUpdateInput = null;
        BillableMetric response = api.updateBillableMetric(code, billableMetricUpdateInput).block();

        // TODO: test validations
    }
    
}
