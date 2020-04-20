package cz.upce.helloworld.demo;

import java.util.List;
import org.springframework.context.annotation.Profile;

public interface ProductService {

  List<ProductModel> listProducts();
}
