package com.lago.api.client.invoices.endpoints;

import com.lago.api.client.invoices.types.InvoiceInput;
import com.lago.api.core.BearerAuth;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public final class Update {
  private Update() {
  }

  public static final class Request {
    private final String id;

    private final InvoiceInput body;

    private final Optional<BearerAuth> authOverride;

    private int _cachedHashCode;

    Request(String id, InvoiceInput body, Optional<BearerAuth> authOverride) {
      this.id = id;
      this.body = body;
      this.authOverride = authOverride;
    }

    /**
     * @return ID of the existing Lago Invoice
     */
    public String getId() {
      return id;
    }

    public InvoiceInput getBody() {
      return body;
    }

    public Optional<BearerAuth> getAuthOverride() {
      return authOverride;
    }

    @Override
    public boolean equals(Object other) {
      if (this == other) return true;
      return other instanceof Request && equalTo((Request) other);
    }

    private boolean equalTo(Request other) {
      return id.equals(other.id) && body.equals(other.body) && authOverride.equals(other.authOverride);
    }

    @Override
    public int hashCode() {
      if (_cachedHashCode == 0) {
        _cachedHashCode = Objects.hash(this.id, this.body, this.authOverride);
      }
      return _cachedHashCode;
    }

    @Override
    public String toString() {
      return "Update.Request{" + "id: " + id + ", body: " + body + ", authOverride: " + authOverride + "}";
    }

    public static IdStage builder() {
      return new Builder();
    }

    public interface IdStage {
      BodyStage id(String id);

      Builder from(Request other);
    }

    public interface BodyStage {
      _FinalStage body(InvoiceInput body);
    }

    public interface _FinalStage {
      Request build();

      _FinalStage authOverride(Optional<BearerAuth> authOverride);

      _FinalStage authOverride(BearerAuth authOverride);
    }

    public static final class Builder implements IdStage, BodyStage, _FinalStage {
      private String id;

      private InvoiceInput body;

      private Optional<BearerAuth> authOverride = Optional.empty();

      private Builder() {
      }

      @Override
      public Builder from(Request other) {
        id(other.getId());
        body(other.getBody());
        authOverride(other.getAuthOverride());
        return this;
      }

      /**
       * <p>ID of the existing Lago Invoice</p>
       * @return Reference to {@code this} so that method calls can be chained together.
       */
      @Override
      public BodyStage id(String id) {
        this.id = id;
        return this;
      }

      @Override
      public _FinalStage body(InvoiceInput body) {
        this.body = body;
        return this;
      }

      @Override
      public _FinalStage authOverride(BearerAuth authOverride) {
        this.authOverride = Optional.of(authOverride);
        return this;
      }

      @Override
      public _FinalStage authOverride(Optional<BearerAuth> authOverride) {
        this.authOverride = authOverride;
        return this;
      }

      @Override
      public Request build() {
        return new Request(id, body, authOverride);
      }
    }
  }
}
