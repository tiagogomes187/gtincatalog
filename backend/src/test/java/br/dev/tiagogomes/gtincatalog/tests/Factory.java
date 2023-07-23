package br.dev.tiagogomes.gtincatalog.tests;

import br.dev.tiagogomes.gtincatalog.dto.ProductDTO;
import br.dev.tiagogomes.gtincatalog.entities.Category;
import br.dev.tiagogomes.gtincatalog.entities.Product;

import java.time.Instant;

public class Factory {

	public static Product createProduct() {
		Product product = new Product(1L, 10240L, "Azul Cobalto", "Birkenmiss Fivelas", "Miss-Miss", 17918630110477L, "6402.99.90", Instant.parse("2022-08-09T10:30:00Z"), "GTIN_14", 27.9, "https://cnp30blob.blob.core.windows.net/cnp3filestemp/e3714bb41effef32e893c6bf8b9caa58595f18fc7d9cba1c929a2f075bc32112.png", "Full Plastic", 1.6F, "Primavera Verão");
		product.getCategories().add(createCategory());
		return product;
	}

	public static ProductDTO createProductDTO (){
		Product product = createProduct();
		return new ProductDTO(product, product.getCategories());
	}

	public static Category createCategory () {
		return new Category(1L, "Adultos");
	}
}
