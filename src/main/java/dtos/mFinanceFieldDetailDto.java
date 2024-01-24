package dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class mFinanceFieldDetailDto {
    @JsonProperty("description")
    String description;
    @JsonProperty("name")
    String name;
    @JsonProperty("value")
    Double value;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
