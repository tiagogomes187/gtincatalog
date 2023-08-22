import "./styles.css";

const cart = {
  items: [
    {
      productId: 4,
      quantity: 1,
      name: "Sandália Infantil Flat Led",
      color: "Preto",
      reference: "20014",
      price: 29.9,
      imgUrl:
        "https://cnp30blob.blob.core.windows.net/cnp3filestemp/a3f16ea11f623338b00ddaa19c8004b91b51291e98b5f98b4f21e7c438771c7c.png",
    },
    {
      productId: 5,
      quantity: 2,
      name: "Chinelo Infantil Soft",
      color: "Amarelo",
      reference: "20029",
      price: 24.9,
      imgUrl:
        "https://cnp30blob.blob.core.windows.net/cnp3filestemp/5356bffed1e8d7ffee2cde77092e2d963ad1c5772d8a32436f964309bd5f1f6e.png",
    },
  ],
};

export default function Cart() {
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
                  <h3>{item.reference} - {item.name} - {item.color}</h3>
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
