
package com.cognifide.homework.entity.jsonpojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.Valid;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "country",
        "saleability",
        "isEbook",
        "buyLink",
        "listPrice",
        "retailPrice",
        "offers"
})
public class SaleInfo {

    @JsonProperty("country")
    private String country;
    @JsonProperty("saleability")
    private String saleability;
    @JsonProperty("isEbook")
    private Boolean isEbook;
    @JsonProperty("buyLink")
    private String buyLink;
    @JsonProperty("listPrice")
    @Valid
    private ListPrice listPrice;
    @JsonProperty("retailPrice")
    @Valid
    private RetailPrice retailPrice;
    @JsonProperty("offers")
    @Valid
    private List<Offer> offers = null;

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("saleability")
    public String getSaleability() {
        return saleability;
    }

    @JsonProperty("saleability")
    public void setSaleability(String saleability) {
        this.saleability = saleability;
    }

    @JsonProperty("isEbook")
    public Boolean getIsEbook() {
        return isEbook;
    }

    @JsonProperty("isEbook")
    public void setIsEbook(Boolean isEbook) {
        this.isEbook = isEbook;
    }

    @JsonProperty("buyLink")
    public String getBuyLink() {
        return buyLink;
    }

    @JsonProperty("buyLink")
    public void setBuyLink(String buyLink) {
        this.buyLink = buyLink;
    }

    @JsonProperty("listPrice")
    public ListPrice getListPrice() {
        return listPrice;
    }

    @JsonProperty("listPrice")
    public void setListPrice(ListPrice listPrice) {
        this.listPrice = listPrice;
    }

    @JsonProperty("retailPrice")
    public RetailPrice getRetailPrice() {
        return retailPrice;
    }

    @JsonProperty("retailPrice")
    public void setRetailPrice(RetailPrice retailPrice) {
        this.retailPrice = retailPrice;
    }

    @JsonProperty("offers")
    public List<Offer> getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }

    @Override
    public String toString() {
        return "SaleInfo{" +
                "country='" + country + '\'' +
                ", saleability='" + saleability + '\'' +
                ", isEbook=" + isEbook +
                ", buyLink='" + buyLink + '\'' +
                ", listPrice=" + listPrice +
                ", retailPrice=" + retailPrice +
                ", offers=" + offers +
                '}';
    }
}
