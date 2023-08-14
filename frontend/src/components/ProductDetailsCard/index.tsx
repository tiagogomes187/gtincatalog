import "./styles.css";
import ProductCategory from "../../components/ProductCategory";
import { ProductDTO } from "../../models/product";

type Props = {
  product: ProductDTO;
};

export default function ProductDetailsCard({ product }: Props) {
  return (
    <div className="dsc-card dsc-mb20">
      <div className="dsc-product-details-top dsc-line-bottom">
        <img src={product.imgUrl} alt={product.name} />
      </div>
      <div className="dsc-product-details-bottom">
        <h3>SKU: {product.reference}</h3>
        <h4>{product.name}</h4>  
        <p>Marca: {product.brand}</p>      
        <p>Cor: {product.color}</p>
        <p>Código EAN: {product.gtin}</p>
        <p>Altura da plataforma: {product.platformHeight} CM</p>
        <p>NCM: {product.ncm}</p>
        <div className="dsc-category-container">
          {product.categories.map((item) => (
            <ProductCategory key={item.id} name={item.name} />
          ))}
        </div>
      </div>
    </div>
  );
}
