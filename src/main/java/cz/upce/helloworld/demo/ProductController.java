package cz.upce.helloworld.demo;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
  Logger logger = LoggerFactory.getLogger(ProductController.class);

  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping("/product")
  public List<ProductModel> listProducts() {
    logger.info("List product endpoint has been touched!");
    return productService.listProducts();
  }

}
