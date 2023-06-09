package com.dcankayrak.planeTicketOtomation.model;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Flight {
    private String flightNumber;
    private String from;
    private String to;
    private String planeName;
    private String status;
    private Company company;
    private List<Chair> chairs;

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", planeName='" + planeName + '\'' +
                ", status='" + status + '\'' +
                ", company=" + company +
                '}';
    }
}
