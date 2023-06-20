package br.dev.tiagogomes.gtincatalog.dto;

import br.dev.tiagogomes.gtincatalog.entities.Category;
import br.dev.tiagogomes.gtincatalog.entities.Product;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ProductDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private Long reference; //REFERÊNICIA
    private String color; //COR
    private String name; //NOME
    private String brand; //MARCA
    private Long gtin; //EAN13 OU EAN14
    private String ncm; //NCM
    private Instant date; //DATA DE LAÇAMENTO
    private String type; //TIPO DE GTIN
    private Double price; //PREÇO
    private String imgUrl; //IMAGEM
    private String material; //MATERIAL EX: FULL PLASTIC
    private Float platformHeight; //ALTURA DA PLATAFORMA
    private String collection; //COLEÇÃO EX: OUTONO INVERNO

    private List<CategoryDTO> categories = new ArrayList<>();

    public ProductDTO() {
    }

    public ProductDTO(Long id, Long reference, String color, String name, String brand, Long gtin, String ncm, Instant date, String type, Double price, String imgUrl, String material, Float platformHeight, String collection) {
        this.id = id;
        this.reference = reference;
        this.color = color;
        this.name = name;
        this.brand = brand;
        this.gtin = gtin;
        this.ncm = ncm;
        this.date = date;
        this.type = type;
        this.price = price;
        this.imgUrl = imgUrl;
        this.material = material;
        this.platformHeight = platformHeight;
        this.collection = collection;
    }


    public ProductDTO(Product entity) {
        this.id = entity.getId();
        this.reference = entity.getReference();
        this.color = entity.getColor();
        this.name = entity.getName();
        this.brand = entity.getBrand();
        this.gtin = entity.getGtin();
        this.ncm = entity.getNcm();
        this.date = entity.getDate();
        this.type = entity.getType();
        this.price = entity.getPrice();
        this.imgUrl = entity.getImgUrl();
        this.material = entity.getMaterial();
        this.platformHeight = entity.getPlatformHeight();
        this.collection = entity.getCollection();
    }

    public ProductDTO(Product entity, Set<Category> categories) {
        this(entity);
        categories.forEach(cat -> this.categories.add(new CategoryDTO(cat)));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReference() {
        return reference;
    }

    public void setReference(Long reference) {
        this.reference = reference;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getGtin() {
        return gtin;
    }

    public void setGtin(Long gtin) {
        this.gtin = gtin;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Float getPlatformHeight() {
        return platformHeight;
    }

    public void setPlatformHeight(Float platformHeight) {
        this.platformHeight = platformHeight;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public List<CategoryDTO> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryDTO> categories) {
        this.categories = categories;
    }
}
