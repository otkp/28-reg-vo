package org.epragati.cfstVcr.vo;

import java.util.List;

public class VcrResponseModel {

    private List<VcrBookingData> bookings;

    public List<VcrBookingData> getBookings() {
        return bookings;
    }

    public void setBookingData(List<VcrBookingData> bookings) {
        this.bookings = bookings;
    }
}
