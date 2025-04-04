package com.gridnine.testing;

import java.util.List;

public class GroundTimeExceedsTwoHoursFilter implements FlightFilter {

    @Override
    public List<Flight> filter(List<Flight> flights) {
        return flights.stream()
                .filter(flight -> {
                    List<Segment> segments = flight.getSegments();
                    long totalGroundTime = 0;
                    for (int i = 0; i < segments.size() - 1; i++) {
                        totalGroundTime += segments.get(i + 1).getDepartureDate().until(segments.get(i).getArrivalDate(), java.time.temporal.ChronoUnit.HOURS);
                    }
                    return totalGroundTime <= 2;
                })
                .toList();
    }
}
