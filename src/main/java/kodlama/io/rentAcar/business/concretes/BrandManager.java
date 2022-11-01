package kodlama.io.rentAcar.business.concretes;

import kodlama.io.rentAcar.business.absractt.BrandService;
import kodlama.io.rentAcar.dataAccess.abstractt.BrandRepository;
import kodlama.io.rentAcar.entites.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service //bu sınıf bir bussines nesnesidir.
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        //iş kuralları
        return brandRepository.getAll() ;
    }
}
