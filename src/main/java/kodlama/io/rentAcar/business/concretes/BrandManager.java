package kodlama.io.rentAcar.business.concretes;

import kodlama.io.rentAcar.business.absractt.BrandService;
import kodlama.io.rentAcar.business.request.CreateBrandRequest;
import kodlama.io.rentAcar.business.response.GetAllBrandsResponse;
import kodlama.io.rentAcar.dataAccess.abstractt.BrandRepository;
import kodlama.io.rentAcar.entites.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service //bu sınıf bir bussines nesnesidir.
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {
        //iş kuralları
        List<Brand> brands= brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponse=new ArrayList<GetAllBrandsResponse>();

        for (Brand brand:brands){
            GetAllBrandsResponse responseItem=new GetAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());

            brandsResponse.add(responseItem);
        }
        return brandsResponse;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {

        Brand brand=new Brand();
        brand.setName(createBrandRequest.getName());

        this.brandRepository.save(brand);

    }


}
