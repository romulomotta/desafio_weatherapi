package citi.com.weatherapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsolidatedWeather implements Serializable {
    private static final long SerialVersionUID = 1L;

    @JsonProperty
    private Long id;

    @JsonProperty
    private String weather_state_name;

    @JsonProperty
    private String weather_state_abbr;

    @JsonProperty
    private String wind_direction_compass;

    @JsonProperty
    private String created;

    @JsonProperty
    private String applicable_date;

    @JsonProperty
    private Double min_temp;

    @JsonProperty
    private Double max_temp;

    @JsonProperty
    private Double the_temp;

    @JsonProperty
    private BigDecimal wind_speed;

    @JsonProperty
    private BigDecimal wind_direction;

    @JsonProperty
    private BigDecimal air_pressure;

    @JsonProperty
    private Integer humidity;

    @JsonProperty
    private BigDecimal visibility;

    @JsonProperty
    private Integer predictability;
}
