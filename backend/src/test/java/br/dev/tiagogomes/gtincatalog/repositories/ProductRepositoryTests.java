package br.dev.tiagogomes.gtincatalog.repositories;

import br.dev.tiagogomes.gtincatalog.entities.Product;
import br.dev.tiagogomes.gtincatalog.tests.Factory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
public class ProductRepositoryTests {

    @Autowired
    private ProductRepository productRepository;

    private long existingId;
    private long nonExistingId;
    private long countTotalProduct;

    @BeforeEach
    void setUp() throws Exception {
        existingId = 1L;
        nonExistingId = 1000L;
        countTotalProduct = 25L;
    }

    @Test
    public void deleteShouldDeleteObjectWhenIdExists() {
        productRepository.deleteById(existingId);
        Optional<Product> result = productRepository.findById(existingId);
        Assertions.assertFalse(result.isPresent());
    }

    @Test
    public void saveShouldPersistWithAutoincrementWhenIdIsNull () {
        Product product = Factory.createProduct();
        product.setId(null);
        product = productRepository.save(product);
        Assertions.assertNotNull(product.getId());
        Assertions.assertEquals(countTotalProduct + 1, product.getId());

    }

    @Test
    public void findByIdShouldReturnNonEmptyOptionalWhenIdExists () {
        Optional<Product> result = productRepository.findById(existingId);
        Assertions.assertTrue(result.isPresent());
    }

    @Test
    public void finddByIdShouldReturnEmptyOptionalWhenIdDoesNotExists () {
        Optional<Product> result = productRepository.findById(nonExistingId);
        Assertions.assertFalse(result.isPresent());
    }

}
