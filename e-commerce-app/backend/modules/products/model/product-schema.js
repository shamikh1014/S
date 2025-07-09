
import mongoose, { SchemaTypes } from 'mongoose'

const productSchema=mongoose.Schema({

    name:{type:SchemaTypes.String, required:true, unique:true, maxLength:25, minLength:1,},
    price:{type:SchemaTypes.Number, required:true, min:100, max:1000},
    desc:{type:SchemaTypes.String},
    image:{type:SchemaTypes.String, required:true}

})

export const ProductModel=mongoose.model('products', productSchema); 