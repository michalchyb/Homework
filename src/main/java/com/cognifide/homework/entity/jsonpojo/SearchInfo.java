
package com.cognifide.homework.entity.jsonpojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "textSnippet"
})
public class SearchInfo {

    @JsonProperty("textSnippet")
    private String textSnippet;

    @JsonProperty("textSnippet")
    public String getTextSnippet() {
        return textSnippet;
    }

    @JsonProperty("textSnippet")
    public void setTextSnippet(String textSnippet) {
        this.textSnippet = textSnippet;
    }

    @Override
    public String toString() {
        return "SearchInfo{" +
                "textSnippet='" + textSnippet + '\'' +
                '}';
    }
}
