package cz.upce.helloworld.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("heroku")
class DemoApplicationTests {

  @Autowired
  private ProductServiceHeroku productService;

  @Test
  void contextLoads() {
    List<ProductModel> productModels = productService.listProducts();
    assertThat(productService).isNotNull();
    System.out.println(productModels.size());
  }

}
