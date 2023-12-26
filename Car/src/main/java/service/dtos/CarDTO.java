package service.dtos;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarDTO{
    private String model;
    private String color;
    private String matricul;
    private Double price;
}
