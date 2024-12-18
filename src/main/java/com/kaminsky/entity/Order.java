package com.kaminsky.entity;

import com.kaminsky.status.Status;

import java.util.UUID;

public class Order {
    private UUID id;

    private int price;

    private Status status;

    private boolean isPaid;

    private boolean isPacked;

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public boolean isPacked() {
        return isPacked;
    }

    public void setPacked(boolean packed) {
        isPacked = packed;
    }

    @Override
    public String toString() {
        return id + " " + price;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

