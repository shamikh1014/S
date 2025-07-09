
import { ProductModel } from '../products/model/product-schema.js';

export const addNewProduct=async (product)=>{

    try{
        const doc=await ProductModel.create(product);
        return doc;
    }
    catch(err){
        throw err;
    }
}

export const viewAllProduct=async()=>{
    try{
        const docs=await ProductModel.find({}).exec();
        return docs;
    }
    catch(err){
        throw(err);
    }
}