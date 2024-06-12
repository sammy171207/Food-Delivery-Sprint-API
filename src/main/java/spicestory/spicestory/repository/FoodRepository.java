package spicestory.spicestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import spicestory.spicestory.model.Food;

import java.util.List;

public interface FoodRepository extends JpaRepository<Food,Long> {

    List<Food>findBbyRestaurantId(Long restaurantId);
    @Query("SELECT f FROM Food f WHERE f.name LIKE %:keyword% OR f.foodCategory.name LIKE %:keyword%")
    List<Food>seacrhFood(@Param("keyword")String keyword);


}
