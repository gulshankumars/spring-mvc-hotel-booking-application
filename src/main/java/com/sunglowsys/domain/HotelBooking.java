package com.sunglowsys.domain;

import javax.persistence.*;


import java.util.Objects;

@Entity
@Table(name = "hotelBooking")
public class HotelBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id ;

    private String checkInDate ;

    private String checkOutDate ;

    private Integer totalGuest ;

    private Integer noOfNights ;

    private Integer noOfRooms ;

    private Integer bookingAmount ;

    private Integer customerId ;

    private Integer hotelId ;

    private Integer roomTypeId ;

    private Integer ratePlanId ;

    public HotelBooking(){
        System.out.println("HotelBooking object is created :");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Integer getTotalGuest() {
        return totalGuest;
    }

    public void setTotalGuest(Integer totalGuest) {
        this.totalGuest = totalGuest;
    }

    public Integer getNoOfNights() {
        return noOfNights;
    }

    public void setNoOfNights(Integer noOfNights) {
        this.noOfNights = noOfNights;
    }

    public Integer getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(Integer noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public Integer getBookingAmount() {
        return bookingAmount;
    }

    public void setBookingAmount(Integer bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public Integer getRatePlanId() {
        return ratePlanId;
    }

    public void setRatePlanId(Integer ratePlanId) {
        this.ratePlanId = ratePlanId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelBooking that = (HotelBooking) o;
        return Objects.equals(id, that.id) && Objects.equals(checkInDate, that.checkInDate) && Objects.equals(checkOutDate, that.checkOutDate) && Objects.equals(totalGuest, that.totalGuest) && Objects.equals(noOfNights, that.noOfNights) && Objects.equals(noOfRooms, that.noOfRooms) && Objects.equals(bookingAmount, that.bookingAmount) && Objects.equals(customerId, that.customerId) && Objects.equals(hotelId, that.hotelId) && Objects.equals(roomTypeId, that.roomTypeId) && Objects.equals(ratePlanId, that.ratePlanId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, checkInDate, checkOutDate, totalGuest, noOfNights, noOfRooms, bookingAmount, customerId, hotelId, roomTypeId, ratePlanId);
    }

    @Override
    public String toString() {
        return "HotelBooking{" +
                "id=" + id +
                ", checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                ", totalGuest=" + totalGuest +
                ", noOfNights=" + noOfNights +
                ", noOfRooms=" + noOfRooms +
                ", bookingAmount=" + bookingAmount +
                ", customerId=" + customerId +
                ", hotelId=" + hotelId +
                ", roomTypeId=" + roomTypeId +
                ", ratePlanId=" + ratePlanId +
                '}';
    }
}
