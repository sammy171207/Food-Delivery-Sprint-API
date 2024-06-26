package spicestory.spicestory.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long Id;
 @ManyToOne
 @JsonIgnore
 private Cart cart;
 @ManyToOne
 private Food food;

 private int quantity;

 private List<String>ingredients;
 private Long totalPrice;

}
