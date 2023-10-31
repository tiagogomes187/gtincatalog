import { OrderDTO } from "../models/order";

export function save(cart : OrderDTO) {
  const str = JSON.stringify(cart);
  localStorage.setItem("br.dev.tiagogomes.dscommerce/Cart", str);
}

export function get(): OrderDTO {
  const str =
    localStorage.getItem("br.dev.tiagogomes.dscommerce/Cart") || '{"items"=[]}';
  return JSON.parse(str);
}
