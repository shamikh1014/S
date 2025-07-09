

import { response } from 'express';
import { addNewProduct, viewAllProduct } from '../../services/product-operations.js';


export const addNewProd=async (request, response)=>{

    const product=request.body;
    console.log('Request data is ', product);

    try{

        const doc=await addNewProduct(product);
        if(doc && doc._id){
            response.status(200).json({message:'Product Added', doc:doc});
        }
        
    }

    catch(err){
        response.status(500).json({message:'Problem in Product Add'});
    }
}

export const viewAll=async (request, response)=>{
    const docs=await viewAllProduct();
    response.status(200).json({products:docs});
}































/*
import { ProductModel } from '../models/product-schema.js';

export const getProducts=(request, response)=>{
    response.status(200).json();
}

export const addProduct=async (request, response)=>{
    const product=request.body;

    try{

        const doc=await ProductModel.create(product);

        if(doc && doc._id){
            response.status(200).json({message:'New Pizza Added in DB'});
        }
        else{
            response.status(500).json({message:'Unable to add New Pizza in DB'});
        }

    }
    catch(err){
        response.status(500).json({message:'Unable to add New Pizza in DB'});
    }
}*/