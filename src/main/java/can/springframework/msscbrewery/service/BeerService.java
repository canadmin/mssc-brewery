package can.springframework.msscbrewery.service;

import can.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveBeer(BeerDto beerDto);

    void updateBeer(UUID beerId,BeerDto beerDto);

    void deleteById(UUID beerId);

}
