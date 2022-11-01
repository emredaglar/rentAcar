package kodlama.io.rentAcar.webApi.controller;

import kodlama.io.rentAcar.business.absractt.BrandService;
import kodlama.io.rentAcar.entites.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    public List<Brand> getAll(){
        return brandService.getAll();

    }
}
