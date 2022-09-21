package com.tourisme.residence.controller;


import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tourisme.residence.model.Restaurant;
import com.tourisme.residence.service.RestaurantService;



@RestController  
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class RestaurantController {
	//autowire the BooksService class  
	@Autowired  
	RestaurantService restaurantService;  
	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/restaurant")  
	private List<Restaurant> getAllRestaurants()   
	{  
		return restaurantService.getAllRestaurant();  
	}  
	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/restaurant/{restaurantid}")  
	private Restaurant getRestaurant(@PathVariable("restaurantid") int restaurantid)   
	{  
		return restaurantService.getRestaurantsById(restaurantid);  
	}  
	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/restaurant/{restaurantid}")  
	private void deleteRestaurant(@PathVariable("restaurantid") int restaurantid)   
	{  
		restaurantService.delete(restaurantid);  
	}  
	//creating post mapping that post the book detail in the database  
	@PostMapping("/restaurant")  
	private int saveRestaurant(@RequestBody Restaurant restaurant)   
	{  
		restaurantService.saveOrUpdate(restaurant);  
		return restaurant.getId();  
	}  
	//creating put mapping that updates the book detail   
	@PutMapping("/restaurant")  
	private int updateRestaurant(@RequestBody Restaurant restaurant)   
	{  
		restaurantService.saveOrUpdate(restaurant);  
		return restaurant.getId();  
	}

}
