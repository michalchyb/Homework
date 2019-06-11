
package com.cognifide.homework.entity.jsonpojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.Valid;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "requestedUrl",
    "items"
})
public class Book {

    @JsonProperty("requestedUrl")
    private String requestedUrl;
    @JsonProperty("items")
    @Valid
    private List<Item> items = null;

    @JsonProperty("requestedUrl")
    public String getRequestedUrl() {
        return requestedUrl;
    }

    @JsonProperty("requestedUrl")
    public void setRequestedUrl(String requestedUrl) {
        this.requestedUrl = requestedUrl;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Book{" +
                "requestedUrl='" + requestedUrl + '\'' +
                ", items=" + items +
                '}';
    }
}
