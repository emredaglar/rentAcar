package kodlama.io.rentAcar.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRequest {
    //benim bilgilerim bunlar xx kaydedermisin? Son kullanıcıdan alıyor isem
    private String name;

}
