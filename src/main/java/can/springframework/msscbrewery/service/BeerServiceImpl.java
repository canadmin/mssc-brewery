package can.springframework.msscbrewery.web.service;

import can.springframework.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Tuborg")
                .beerStyle("Malt")
                .build();
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID beerId,BeerDto beerDto) {
        //todo impl - would add real impl to update beer
    }

    @Override
    public void deleteById(UUID beerId) {
    //todo impl - delete beer
        log.debug("Deleting beer");
    }
}
