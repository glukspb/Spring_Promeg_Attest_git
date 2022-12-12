package com.example.springsecurityapplication.util;

import com.example.springsecurityapplication.enumm.Status;
import com.example.springsecurityapplication.models.Person;
import com.example.springsecurityapplication.models.Product;

import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class OtborOrder {

    private String number;

//    @ManyToOne(optional = false)
//    private Person person;
//    private int person_id;
//
//    private float sum_price;
//
//    private LocalDate date;
//
//    private int status;
//

    public OtborOrder() {
    }

//    public OtborOrder(String number, int person_id, float sum_price, LocalDate date, int status) {
//        System.out.println("OtborOrder={{{");
//        this.number = number;
//        this.person_id = person_id;
//        this.sum_price = sum_price;
//        this.date = date;
//        this.status = status;
//    }


    public OtborOrder(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

//    public Person getPerson() {
//        return person;
//    }
//
//    public void setPerson(Person person) {
//        this.person = person;
//    }
//
//    public int getPerson_id() {
//        return person_id;
//    }
//
//    public void setPerson_id(int person_id) {
//        this.person_id = person_id;
//    }
//
//    public float getSum_price() {
//        return sum_price;
//    }
//
//    public void setSum_price(float sum_price) {
//        this.sum_price = sum_price;
//    }
//
//    public LocalDate getDate() {
//        return date;
//    }
//
//    public void setDate(LocalDate date) {
//        this.date = date;
//    }
//
//    public int getStatus() {
//        return status;
//    }
//
//    public void setStatus(int status) {
//        this.status = status;
//    }
}
