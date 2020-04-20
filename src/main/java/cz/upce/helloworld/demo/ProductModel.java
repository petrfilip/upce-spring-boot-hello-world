package cz.upce.helloworld.demo;

public class ProductModel {
  
  private Integer id;
  private String name;

  public ProductModel() {
  }

  public ProductModel(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
