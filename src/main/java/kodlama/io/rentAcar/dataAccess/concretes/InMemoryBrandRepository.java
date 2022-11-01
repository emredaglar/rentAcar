package kodlama.io.rentAcar.dataAccess.concretes;

import kodlama.io.rentAcar.dataAccess.abstractt.BrandRepository;
import kodlama.io.rentAcar.entites.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Repository //BuSınıf bir dataccess nesnesidir
public class InMemoryBrandRepository implements BrandRepository {

    ArrayList<Brand> brands;

    public InMemoryBrandRepository() {
        brands=new ArrayList<Brand>();
        brands.add(new Brand(1,"BMW"));
        brands.add(new Brand(1,"Mercedes"));
        brands.add(new Brand(1,"AUDİ"));
        brands.add(new Brand(1,"Reno"));
        brands.add(new Brand(1,"Fiat"));

    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
