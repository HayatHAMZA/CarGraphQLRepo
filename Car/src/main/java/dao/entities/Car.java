package dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Car {
    @Id
    private int id_Car;
    private String model;
    private String color;
    private String matricul;
    private Double price;
}
















