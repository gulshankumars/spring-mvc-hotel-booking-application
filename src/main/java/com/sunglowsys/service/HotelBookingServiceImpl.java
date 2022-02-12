package com.sunglowsys.service;

import com.sunglowsys.domain.HotelBooking;
import com.sunglowsys.repository.HotelBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelBookingServiceImpl implements HotelBookingService{

    @Autowired
    private HotelBookingRepository hotelBookingRepository;

    @Override
    public HotelBooking create(HotelBooking hotelBooking) {
        return hotelBookingRepository.save(hotelBooking);
    }

    @Override
    public HotelBooking update(HotelBooking hotelBooking, Integer id) {
        HotelBooking hotelBooking1 = hotelBookingRepository.findById(id).get();
        hotelBooking1.setCheckInDate(hotelBooking1.getCheckInDate());
        hotelBooking1.setCheckOutDate(hotelBooking1.getCheckOutDate());
        hotelBooking1.setTotalGuest(hotelBooking1.getTotalGuest());
        hotelBooking1.setNoOfNights(hotelBooking1.getNoOfNights());
        hotelBooking1.setNoOfRooms(hotelBooking1.getNoOfRooms());
        hotelBooking1.setBookingAmount(hotelBooking1.getBookingAmount());
        hotelBooking1.setCustomerId(hotelBooking1.getCustomerId());
        hotelBooking1.setHotelId(hotelBooking1.getHotelId());
        hotelBooking1.setRoomTypeId(hotelBooking1.getRoomTypeId());
        hotelBooking1.setRatePlanId(hotelBooking1.getRatePlanId());
        return hotelBookingRepository.save(hotelBooking);
    }

    @Override
    public HotelBooking findById(Integer id) {
        Optional<HotelBooking> optional = hotelBookingRepository.findById(id);
        HotelBooking hotelBooking = null;
        if (optional.isPresent()){
            hotelBooking = optional.get();
        }
        else {
            throw new RuntimeException("Hotel-Booking not found for id:" +id);
        }
        return hotelBooking;
    }

    @Override
    public List<HotelBooking> findAll() {
        return hotelBookingRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        hotelBookingRepository.deleteById(id);
    }
}
