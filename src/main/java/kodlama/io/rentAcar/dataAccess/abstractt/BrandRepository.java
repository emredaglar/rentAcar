package kodlama.io.rentAcar.dataAccess.abstractt;

import kodlama.io.rentAcar.entites.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand,Integer> {
//    List<Brand> getAll(); //bunu çağıran markaları listeler.
}
