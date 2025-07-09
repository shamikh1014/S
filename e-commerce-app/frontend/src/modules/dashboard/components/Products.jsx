
import { Product } from './Product';

export const Products=({products})=>{
    console.log('All Products are ', products);
    return (
        <div>

            <div className='row'>
                    {products.map(product=><Product key={product['_id']} product={product}/>)}
                    {/* {products.map(product=><Product key={product.id} product={product}/>)} */}
            </div>

        </div>
    )
} 