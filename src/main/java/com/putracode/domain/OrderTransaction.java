package com.putracode.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by KrisnaPutra on 8/25/2015.
 */
@Entity
@Table(name = "order_transaction")
@Data
public class OrderTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private String OrderProduct;
    private LocalDate orderDate;
    private LocalTime orderTime;
    private LocalDateTime orderCreated;
    /*
    *  Getter And Setter Using Library Project Lombok
    * */
}
