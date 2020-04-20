package cz.upce.helloworld.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("heroku")
@Service
public class ProductServiceHeroku implements ProductService {

  @Override
  public List<ProductModel> listProducts() {
    List<ProductModel> productModels = new ArrayList<>();
    productModels.add(new ProductModel(1, "Heroku 1"));
    productModels.add(new ProductModel(2, "Heroku 2"));
    productModels.add(new ProductModel(3, "Heroku 3"));
    return productModels;
  }

}
