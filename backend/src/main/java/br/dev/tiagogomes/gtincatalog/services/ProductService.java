package br.dev.tiagogomes.gtincatalog.services;

import br.dev.tiagogomes.gtincatalog.dto.CategoryDTO;
import br.dev.tiagogomes.gtincatalog.dto.ProductDTO;
import br.dev.tiagogomes.gtincatalog.entities.Category;
import br.dev.tiagogomes.gtincatalog.entities.Product;
import br.dev.tiagogomes.gtincatalog.repositories.CategoryRepository;
import br.dev.tiagogomes.gtincatalog.repositories.ProductRepository;
import br.dev.tiagogomes.gtincatalog.services.exceptions.DatabaseException;
import br.dev.tiagogomes.gtincatalog.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public Page<ProductDTO> findAllPaged(PageRequest pageRequest) {
        Page<Product> page = productRepository.findAll(pageRequest);
        return page.map(x -> new ProductDTO(x));
    }

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Optional<Product> obj = productRepository.findById(id);
        Product entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
        return new ProductDTO(entity, entity.getCategories());
    }

    @Transactional
    public ProductDTO insert(ProductDTO dto) {
        Product entity = new Product();
        copyDtoToEntity(dto, entity);
        entity = productRepository.save(entity);
        return new ProductDTO(entity);
    }


    @Transactional
    public ProductDTO update(Long id, ProductDTO dto) {
        try {
            Product entity = productRepository.getReferenceById(id);
            copyDtoToEntity(dto, entity);
            entity = productRepository.save(entity);
            return new ProductDTO(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Id [ " + id + " ] not found");
        }
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void delete(Long id) {
        if (!productRepository.existsById(id)) {
            throw new ResourceNotFoundException("Id [" + id + "] not found");
        }
        try {
            productRepository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException("Integrity violation");
        }
    }

    private void copyDtoToEntity(ProductDTO dto, Product entity) {
        entity.setReference(dto.getReference());
        entity.setColor(dto.getColor());
        entity.setName(dto.getName());
        entity.setBrand(dto.getBrand());
        entity.setGtin(dto.getGtin());
        entity.setNcm(dto.getNcm());
        entity.setDate(dto.getDate());
        entity.setDate(dto.getDate());
        entity.setType(dto.getType());
        entity.setPrice(dto.getPrice());
        entity.setImgUrl(dto.getImgUrl());
        entity.setMaterial(dto.getMaterial());
        entity.setPlatformHeight(dto.getPlatformHeight());
        entity.setCollection(dto.getCollection());

        entity.getCategories().clear();
        for (CategoryDTO catDto : dto.getCategories()) {
            Category category = categoryRepository.getReferenceById(catDto.getId());
            entity.getCategories().add(category);
        }

    }
}
