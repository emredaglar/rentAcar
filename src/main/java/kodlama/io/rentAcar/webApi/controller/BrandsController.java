package kodlama.io.rentAcar.webApi.controller;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlama.io.rentAcar.business.absractt.BrandService;
import kodlama.io.rentAcar.business.request.CreateBrandRequest;
import kodlama.io.rentAcar.business.response.GetAllBrandsResponse;
import kodlama.io.rentAcar.entites.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //annotation bilgilendirme
@RequestMapping("/api/brands") //iletişim yöntemi. tarayıcıda adreslemede gördüğümüz şey
public class BrandsController {

    private BrandService brandService;
    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody() CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);
    }
}
