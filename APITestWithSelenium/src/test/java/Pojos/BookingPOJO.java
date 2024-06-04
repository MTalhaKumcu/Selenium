package Pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //create getter setter to string
@NoArgsConstructor // create empty constructor
@AllArgsConstructor //create another constructor
public class BookingPOJO {
    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private BookingdatesPOJO additionalneeds;
}
