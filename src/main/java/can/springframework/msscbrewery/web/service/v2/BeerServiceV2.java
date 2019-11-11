package can.springframework.msscbrewery.web.service.v2;

import can.springframework.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface  BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId);

    void deleteById(UUID beerId);
}
