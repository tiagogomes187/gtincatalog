import { AxiosRequestConfig } from "axios";
import { requestBackend } from "../utils/requests";

export function findPageRequest(
  page: number,
  name: string,
  size = 12,
  order = "name"
) {
  const config: AxiosRequestConfig = {
    method: "GET",
    url: "/products",
    params: {
      page,
      name,
      size,
      order,
    },
  };
  return requestBackend(config);
}

export function findById(id: number) {
  return requestBackend({ url: `/products/${id}` });
}
