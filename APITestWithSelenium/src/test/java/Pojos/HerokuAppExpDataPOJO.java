package Pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //create getter setter to string
@NoArgsConstructor // create empty constructor
@AllArgsConstructor //create another constructor
public class HerokuAppExpDataPOJO {

    private int bookingid;
    private BookingPOJO booking;
}
