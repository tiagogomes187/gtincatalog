import { CategoryDTO } from "./category";

export type ProductDTO = {
    id : number;
    reference : number;
    color : string;
    name : string;
    brand : string;
    gtin : number;
    ncm : string;
    date : string;
    type : string;
    price : number;
    imgUrl : string;
    material : string;
    platformHeight : number;
    collection : string;
    categories : CategoryDTO[];
}