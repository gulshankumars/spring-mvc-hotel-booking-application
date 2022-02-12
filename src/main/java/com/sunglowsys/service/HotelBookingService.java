package com.sunglowsys.service;

import com.sunglowsys.domain.HotelBooking;

import java.util.List;

public interface HotelBookingService {

    HotelBooking create(HotelBooking hotelBooking) ;

    HotelBooking update(HotelBooking hotelBooking,Integer id) ;

    HotelBooking findById(Integer id);

    List<HotelBooking>findAll() ;

    void deleteById(Integer id) ;
}
