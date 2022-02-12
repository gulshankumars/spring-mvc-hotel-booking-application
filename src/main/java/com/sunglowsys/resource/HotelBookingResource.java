package com.sunglowsys.resource;

import com.sunglowsys.domain.HotelBooking;
import com.sunglowsys.service.HotelBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelBookingResource {


    @Autowired
    private HotelBookingService hotelBookingService;

    @PostMapping("/hotel_booking")
    public ResponseEntity<?> create(@RequestBody HotelBooking hotelBooking){
        HotelBooking result = hotelBookingService.create(hotelBooking);
        return ResponseEntity.ok().body(" HotelBooking is created successfully: " + result);
    }

    @GetMapping
    public List<HotelBooking> getAll(){
        List<HotelBooking> result1 = hotelBookingService.findAll();
        return result1;
    }

    @GetMapping("find_hotel_booking/{id}")
    public HotelBooking getById(@PathVariable("id") Integer id){
        return hotelBookingService.findById(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@RequestBody HotelBooking hotelBooking, @PathVariable("id") Integer id){
        hotelBookingService.update(hotelBooking, id);
        return ResponseEntity.ok().body(" HotelBooking is updated successfully: " + id);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        hotelBookingService.deleteById(id);
        return ResponseEntity.ok().body("HotelBooking is successfully Deleted on this ID :" + id);
    }
}
