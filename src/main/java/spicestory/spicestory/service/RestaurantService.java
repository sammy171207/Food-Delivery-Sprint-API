package spicestory.spicestory.service;

import spicestory.spicestory.dto.RestaurantDto;
import spicestory.spicestory.model.Restaurant;
import spicestory.spicestory.model.User;
import spicestory.spicestory.request.CreateRestaurantRequest;

import java.util.List;

public interface RestaurantService {

    public Restaurant createRestaurant(CreateRestaurantRequest req, User user);

    public  Restaurant updateRestaurant(Long restaurantId,CreateRestaurantRequest updatedRestaurant)throws Exception;

    public void deleteRestaurant(Long RestaurantId) throws Exception;

    public List<Restaurant>getAllRestaurant();

    public List<Restaurant>searchRestaurant();
    public Restaurant findRestaurant(Long id)throws  Exception;

    public  Restaurant getRestaurantByUserId(Long userId)throws Exception;

    public RestaurantDto addToFavorites(Long restaurantId,User user) throws Exception;

    public Restaurant updateRestaurantStatus(Long id) throws Exception;
}
