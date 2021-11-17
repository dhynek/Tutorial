package com.tutorials.model;

import java.math.BigDecimal;

public class Room {
    private long id;
    private int capacity;
    private boolean balcony;
    private boolean seaView;
    private BigDecimal pricePerNight;

    public Room(long id, int capacity, boolean balcony, boolean seaView, BigDecimal pricePerNight) {
        this.id = id;
        this.capacity = capacity;
        this.balcony = balcony;
        this.seaView = seaView;
        this.pricePerNight = pricePerNight;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }

    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getDescription() {
        return "Pokoj č. " + id + ", kapacita: " + capacity + ", balkón: " + balcony + ", výhled na moře: " + seaView;
    }
}
