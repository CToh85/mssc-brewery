package gurue.springframework.msscbrewery.services;

import gurue.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;


public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
