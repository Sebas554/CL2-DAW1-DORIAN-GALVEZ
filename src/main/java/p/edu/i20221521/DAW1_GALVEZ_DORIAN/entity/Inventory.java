package p.edu.i20221521.DAW1_GALVEZ_DORIAN.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Inventory {
    @Id
    private Integer inventory_id;
    private Integer store_id;
    private Date last_update;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;
}
