package Pojos;

import lombok.*;

@Getter
@Setter
@Data //create getter setter to string
@NoArgsConstructor // create empty constructor
@AllArgsConstructor //create another constructor
public class BookingPOJO {

    private String firstname ;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private BookingdatesPOJO bookingdatesPOJO;
    private String additionalneeds;


}
