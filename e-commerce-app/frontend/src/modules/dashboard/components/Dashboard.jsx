
// import React from 'react'
import { useEffect, useState } from 'react'
import { Header } from '../../../shared/components/Header';
import { getApiCall, getApi } from '../../../shared/services/api-client';
import { Products } from './Products';
import { CartView } from '../../carts/pages/CartView';
import { CartContext } from '../context/cart-context';
// import { Product } from './Product';

export const Dashboard=()=>{

    const [loading, setLoading]=useState(true);
    const [products, setProducts]=useState([]);
    // let carts=[];
    const [carts, setCarts]=useState([]);

    // const [pizzas, setPizzas]=useState([]);
    // const [errors, setErrors]=useState(null);

    useEffect(()=>{

        // return function(){}

        getProducts();

        // getPizzas();

    }, []); // Mounting

    const addCart=(product)=>{
        const c=[...carts];
        c.push(product);
        setCarts(c);
    }

    const getProducts=async()=>{

        const data=await getApi();
        console.log('Products ', data);
        setLoading(false);
        setProducts(data['products'])
    }

    /*
    const getPizzas=async()=>{

        try{

            const PIZZA_ENDPOINT=import.meta.env.VITE_PIZZA_URL;
            const pizzas=await getApiCall(PIZZA_ENDPOINT);
            console.log('Pizzas are ', pizzas);
            setLoading(false);
            setPizzas(pizzas['Vegetarian']);

        }

        catch(err){
            setErrors(err);
        }
        
    }
    */

    return (
        <div className='container'>

            <Header/>

            <CartContext.Provider value={{carts:carts, addCart:addCart}}>

            <div className='row'>

                <div className='col-8'> 

                    <div className='row'>

                        {loading?<p> Loading..... </p>:<Products products={products}/>}
                        {/* <Product/>
                        <Product/>
                        <Product/> */}
                    </div>

                </div>

                <div className='col-4'> 

                    <h3 className='alert alert-success'> Carts </h3>

                    <CartView/>
                    
                </div>

            </div>

            </CartContext.Provider>

        </div>

    )
}

