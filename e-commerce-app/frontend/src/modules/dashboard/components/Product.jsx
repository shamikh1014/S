// Single Pizza Display
// import React from 'react'

import { useContext } from 'react';
import { CartContext } from '../context/cart-context';

export const Product=({product})=>{

    const ctx=useContext(CartContext);

    const myStyle={width:'18rem', /*backgroundColor: 'grey'*/};

    const addToCart=()=>{
        ctx.addCart({...product});
        console.log('Add to Cart Call ', product);
    }

    return (
        <div className="card me-2" style={myStyle}>
            <img src={product.image} className="card-img-top" alt="..."/>
            {/* <img src={product.assets.menu[0].url} className="card-img-top" alt="..."/> */}
            <div className="card-body">
                <h5 className="card-title"> {product.name} </h5>
                <p className="card-text"> {product.price} </p>
                <button onClick={addToCart} className="btn btn-primary"> Add to Cart </button>
            </div>
        </div>
    )
}

