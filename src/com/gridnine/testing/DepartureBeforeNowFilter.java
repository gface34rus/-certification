package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;

public class DepartureBeforeNowFilter implements FlightFilter {

    @Override
    public List<Flight> filter(List<Flight> flights) {
        return flights.stream()
                .filter(flight -> flight.getSegments()
                        .get(0)
                        .getDepartureDate()
                        .isAfter(LocalDateTime.now()))
                .toList();
    }
}
