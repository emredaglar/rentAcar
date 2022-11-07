package kodlama.io.rentAcar.business.absractt;

import kodlama.io.rentAcar.business.request.CreateBrandRequest;
import kodlama.io.rentAcar.business.response.GetAllBrandsResponse;
import kodlama.io.rentAcar.entites.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);


}
