package tacos;

import lombok.Data;

/**
 * Created by Dreawalker on 18.03.2018.
 */
@Data
public class Order {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
}
