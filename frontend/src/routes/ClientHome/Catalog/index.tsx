import "./styles.css";
import SearchBar from "../../../components/SearchBar";
import CatalogCard from "../../../components/CatalogCard";
import ButtonNextPage from "../../../components/ButtonNextPage";
import { useEffect, useState } from "react";
import { ProductDTO } from "../../../models/product";
import * as productService from "../../../services/product-service";

export default function Catalog() {
  const [products, setproducts] = useState<ProductDTO[]>([]);

  useEffect(() => {
    productService.findAll().then((response) => {
      setproducts(response.data.content);
    });
  }, []);

  return (
    <main>
      <section id="catalog-section" className="dsc-container">
        <SearchBar />

        <div className="dsc-catalog-cards dsc-mb20 dsc-mt20">
          {products.map((product) => (
            <CatalogCard key={product.id} product={product} />
          ))}
        </div>

        <ButtonNextPage />
      </section>
    </main>
  );
}
