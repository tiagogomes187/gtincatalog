package br.dev.tiagogomes.gtincatalog.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_product")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long reference; //REFERÊNICIA
    @NotBlank
    private String color; //COR
    @NotBlank
    private String name; //NOME
    @NotBlank
    private String brand; //MARCA
    @Column(unique = true)
    @NotNull
    private Long gtin; //EAN13 OU EAN14
    @NotBlank
    private String ncm; //NCM
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant date; //DATA DE LAÇAMENTO
    @NotBlank
    private String type; //TIPO DE GTIN
    private Double price; //PREÇO
    private String imgUrl; //IMAGEM
    private String material; //MATERIAL EX: FULL PLASTIC
    private Float platformHeight; //ALTURA DA PLATAFORMA
    private String collection; //COLEÇÃO EX: OUTONO INVERNO
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant createdAt;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant updatedAt;

    @ManyToMany
    @JoinTable(name = "tb_product_category", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
    Set<Category> categories = new HashSet<>();

    public Product() {
    }

    public Product(Long id, Long reference, String color, String name, String brand, Long gtin, String ncm, Instant date, String type, Double price, String imgUrl, String material, Float platformHeight, String collection) {
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

    public Set<Category> getCategories() {
        return categories;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    @PrePersist
    public void prePersist() {
        createdAt = Instant.now();
    }

    @PreUpdate
    public void preUpdate() {
        updatedAt = Instant.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Objects.equals(getId(), product.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
