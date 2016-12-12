package service.laptop;

import entity.laptop.Laptop;
import entity.laptop.Producer;
import repository.laptop.LaptopRepository;

import java.util.List;

/**
 * @author Arsalan
 */
public class LaptopServiceImpl implements LaptopService {

    private LaptopRepository laptopRepository;

    public LaptopServiceImpl(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @Override
    public List<Laptop> getAllLaptops() {
        return laptopRepository.getAllLaptops();
    }

    @Override
    public List<Laptop> getByParameters(String[] producers) {
        return laptopRepository.getByParameters(producers);
    }

    @Override
    public List<Producer> getAllProducers() {
        return laptopRepository.getAllProducers();
    }
}
