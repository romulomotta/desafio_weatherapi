package citi.com.weatherapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City implements Serializable {
    private static final long SerialVersionUID = 1L;

    private String title;
    private String location_type;
    private Integer woeid;
    private String latt_long;
}
