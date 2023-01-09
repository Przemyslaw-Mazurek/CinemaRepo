package com.example.Cinema.model;

import com.example.Cinema.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "payments")
public class Payment {

    //TODO połączyć z seansem i userem

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String totalPrice;
    private LocalDateTime dateOfPayment;
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
}
