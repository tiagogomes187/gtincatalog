import { useState } from "react";
import "./styles.css";
import * as cartService from "../../../services/cart-service";
import { OrderDTO } from "../../../models/order";

// const item1: OrderItemDTO = new OrderItemDTO(
//   4,
//   1,
//   "Sandália Infantil Flat Led",
//   "20014",
//   "Preto",
//   29.9,
//   "https://cnp30blob.blob.core.windows.net/cnp3filestemp/a3f16ea11f623338b00ddaa19c8004b91b51291e98b5f98b4f21e7c438771c7c.png"
// );

// const item2: OrderItemDTO = new OrderItemDTO(
//   5,
//   2,
//   "Chinelo Infantil Soft",
//   "20029",
//   "Amarelo",
//   24.9,
//   "https://cnp30blob.blob.core.windows.net/cnp3filestemp/5356bffed1e8d7ffee2cde77092e2d963ad1c5772d8a32436f964309bd5f1f6e.png"
// );

export default function Cart() {

  const [cart] = useState<OrderDTO>(cartService.getCart()); 
  

  return (
    <main>
      <section id="cart-container-section" className="dsc-container">
        <div className="dsc-card dsc-mb20">
          {cart.items.map((item) => (
            <div
              key={item.productId}
              className="dsc-cart-item-container dsc-line-bottom"
            >
              <div className="dsc-cart-item-left">
                <img src={item.imgUrl} alt={item.name} />
                <div className="dsc-cart-item-description">
                  <h3>
                    {item.reference} - {item.name} - {item.color}
                  </h3>
                  <div className="dsc-cart-item-quantity-container">
                    <div className="dsc-cart-item-quantity-btn">-</div>
                    <p>{item.quantity}</p>
                    <div className="dsc-cart-item-quantity-btn">+</div>
                  </div>
                </div>
              </div>
              <div className="dsc-cart-item-right">
                {(item.price * item.quantity).toFixed(2)}
              </div>
            </div>
          ))}

          <div className="dsc-cart-total-container">
            <h3>R$ 15000,00</h3>
          </div>
        </div>
        <div className="dsc-btn-page-container">
          <div className="dsc-btn dsc-btn-blue">Finalizar pedido</div>
          <div className="dsc-btn dsc-btn-white">Continuar comprando</div>
        </div>
      </section>
    </main>
  );
}
