/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.32.0-beta
 * Contact: tech@getlago.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.AddOn.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.AddOnInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.AddOnInputAddOn.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.AddOnObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.AddOnsPaginated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.ApiResponseBadRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.ApiResponseForbidden.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.ApiResponseNotAllowed.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.ApiResponseNotFound.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.ApiResponseUnauthorized.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.ApiResponseUnprocessableEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.AppliedAddOn.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.AppliedAddOnInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.AppliedAddOnInputAppliedAddOn.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.AppliedAddOnObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.AppliedCoupon.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.AppliedCouponInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.AppliedCouponInputAppliedCoupon.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.AppliedCouponObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.AppliedCouponObjectExtended.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.AppliedCouponObjectExtendedAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.AppliedCouponsPaginated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.BatchEventInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.BatchEventInputEvent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.BillableMetric.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.BillableMetricGroup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.BillableMetricGroupValuesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.BillableMetricInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.BillableMetricInputBillableMetric.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.BillableMetricObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.BillableMetricsPaginated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.BillingConfigurationCustomer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.BillingConfigurationOrganization.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.ChargeObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.ChargeUsageObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.ChargeUsageObjectBillableMetric.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.ChargeUsageObjectCharge.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.ChargeUsageObjectGroupsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.Coupon.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CouponInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CouponInputCoupon.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CouponInputCouponAppliesTo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CouponObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CouponsPaginated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CreditNote.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CreditNoteInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CreditNoteInputCreditNote.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CreditNoteInputCreditNoteItemsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CreditNoteItemObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CreditNoteObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CreditNoteUpdateInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CreditNoteUpdateInputCreditNote.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CreditNotes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CreditObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CreditObjectInvoice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CreditObjectItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.Customer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CustomerInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CustomerInputCustomer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CustomerInputCustomerMetadataInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CustomerMetadataObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CustomerObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CustomerUsage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CustomerUsageObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.CustomersPaginated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.Event.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.EventEstimateFeesInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.EventEstimateFeesInputEvent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.EventInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.EventInputEvent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.EventObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.FeeObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.FeeObjectItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.FeeUpdateInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.FeeUpdateInputInvoice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.Fees.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.FeesPaginated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.FeesPaginatedAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.GetCustomerPortalUrl200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.GetCustomerPortalUrl200ResponseCustomer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.GroupObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.GroupPropertiesObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.GroupsPaginated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.Invoice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.InvoiceInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.InvoiceInputInvoice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.InvoiceInputInvoiceMetadataInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.InvoiceMetadataObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.InvoiceObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.InvoiceObjectExtended.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.InvoiceObjectExtendedAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.InvoiceOneOffInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.InvoiceOneOffInputInvoice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.InvoiceOneOffInputInvoiceFeesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.InvoicesPaginated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.Organization.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.OrganizationInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.OrganizationInputOrganization.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.OrganizationObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.PaginationMeta.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.Plan.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.PlanInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.PlanInputPlan.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.PlanInputPlanChargesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.PlanInputPlanChargesInnerGroupPropertiesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.PlanObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.PlansPaginated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.Subscription.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.SubscriptionCreateInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.SubscriptionCreateInputSubscription.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.SubscriptionObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.SubscriptionUpdateInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.SubscriptionUpdateInputSubscription.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.SubscriptionsPaginated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.Wallet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.WalletInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.WalletInputWallet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.WalletObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.WalletTransactionInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.WalletTransactionInputWalletTransaction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.WalletTransactionObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.WalletTransactions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.WalletTransactionsPaginated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.WalletUpdateInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.WalletUpdateInputWallet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.openapitools.client.model.WalletsPaginated.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}