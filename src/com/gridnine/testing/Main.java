package com.gridnine.testing;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();

        List<FlightFilter> filters = new ArrayList<>();
        filters.add(new DepartureBeforeNowFilter());
        filters.add(new ArrivalBeforeDepartureFilter());
        filters.add(new GroundTimeExceedsTwoHoursFilter());

        FlightFilterService filterService = new FlightFilterService(filters);

        System.out.println("Фильтры: ");

        System.out.println("\nПерелеты после текущего момента:");
        List<Flight> filteredFlights = filterService.filterFlights(flights);
        filteredFlights.forEach(System.out::println);

        System.out.println("\nПерелеты с сегментами, где дата прилета раньше даты вылета:");
        filteredFlights = filterService.filterFlights(flights);
        filteredFlights.forEach(System.out::println);

        System.out.println("\nПерелеты с временем на земле более 2 часов:");
        filteredFlights = filterService.filterFlights(flights);
        filteredFlights.forEach(System.out::println);
    }
}