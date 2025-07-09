
// import React from 'react'

import { useContext } from 'react'
import { CartContext } from '../../dashboard/context/cart-context.js';
import { Pay } from '../../payment/components/Pay';

export const Cart=()=>{
    const ctx=useContext(CartContext);

    const total=()=>{
        return ctx.carts.reduce((sum, product)=>sum+product.price, 0);
    }

    console.log('Context is ', ctx);
    return (
        <div>
            <p> Total Items in Cart {ctx.carts.length} </p>
            {ctx.carts.map(product=><>

                <p> {product.name} {product.price} </p>

            </>)}

            <p> Total Bill is {total()} </p>

            {ctx.carts.length>0} && <Pay total={total}/>

        </div>
    )
}


