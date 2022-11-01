package kodlama.io.rentAcar.dataAccess.abstractt;

import kodlama.io.rentAcar.entites.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BrandRepository {
    List<Brand> getAll(); //bunu çağıran markaları listeler.
}
