/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.52.0-beta
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
import org.openapitools.client.model.Tax;
import org.openapitools.client.model.TaxCreateInput;
import org.openapitools.client.model.TaxUpdateInput;
import org.openapitools.client.model.TaxesPaginated;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for TaxesApi
 */
@Ignore
public class TaxesApiTest {

    private final TaxesApi api = new TaxesApi();

    
    /**
     * Create a tax
     *
     * This endpoint creates a new tax representing a customizable tax rate applicable to either the organization or a specific customer.
     */
    @Test
    public void createTaxTest()  {
        TaxCreateInput taxCreateInput = null;
        Tax response = api.createTax(taxCreateInput).block();

        // TODO: test validations
    }
    
    /**
     * Delete a tax
     *
     * This endpoint is used to delete a tax.
     */
    @Test
    public void destroyTaxTest()  {
        String code = null;
        Tax response = api.destroyTax(code).block();

        // TODO: test validations
    }
    
    /**
     * List all taxes
     *
     * This endpoint retrieves all existing taxes representing a customizable tax rate applicable to either the organization or a specific customer.
     */
    @Test
    public void findAllTaxesTest()  {
        Integer page = null;
        Integer perPage = null;
        TaxesPaginated response = api.findAllTaxes(page, perPage).block();

        // TODO: test validations
    }
    
    /**
     * Retrieve a Tax
     *
     * This endpoint retrieves an existing tax representing a customizable tax rate applicable to either the organization or a specific customer. The tax is identified by its unique code.
     */
    @Test
    public void findTaxTest()  {
        String code = null;
        Tax response = api.findTax(code).block();

        // TODO: test validations
    }
    
    /**
     * Update a tax
     *
     * This endpoint updates an existing tax representing a customizable tax rate applicable to either the organization or a specific customer.
     */
    @Test
    public void updateTaxTest()  {
        String code = null;
        TaxUpdateInput taxUpdateInput = null;
        Tax response = api.updateTax(code, taxUpdateInput).block();

        // TODO: test validations
    }
    
}