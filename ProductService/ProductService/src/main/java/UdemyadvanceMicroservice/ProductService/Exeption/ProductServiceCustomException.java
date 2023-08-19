package UdemyadvanceMicroservice.ProductService.Exeption;

public class ProductServiceCustomExeption extends RuntimeException{
  private String errorCode;
  public ProductServiceCustomExeption(String message, String error){
    super(message);
    this.errorCode = error;
  }

}
