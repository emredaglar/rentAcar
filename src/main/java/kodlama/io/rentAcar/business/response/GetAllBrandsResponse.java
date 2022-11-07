package kodlama.io.rentAcar.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBrandsResponse {
    //Son kullanıcıya neleri vermek istiyorum? son kullancıya apiden veriyor isem
    private int id;
    private String name;


}
