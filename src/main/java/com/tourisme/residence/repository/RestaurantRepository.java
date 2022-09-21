package com.tourisme.residence.repository;

import org.springframework.data.repository.CrudRepository;

import com.tourisme.residence.model.Restaurant;



public interface RestaurantRepository extends CrudRepository<Restaurant, Integer>
{
}