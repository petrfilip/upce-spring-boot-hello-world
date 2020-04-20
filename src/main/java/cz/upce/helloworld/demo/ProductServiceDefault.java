package cz.upce.helloworld.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Service
@Profile("dev")
public class ProductServiceDefault implements ProductService {

  @Override
  public List<ProductModel> listProducts() {
    List<ProductModel> productModels = new ArrayList<>();
    productModels.add(new ProductModel(1, "Sony"));
    productModels.add(new ProductModel(2, "Xiaomi"));
    productModels.add(new ProductModel(3, "Samsung"));
    return productModels;
  }


}
