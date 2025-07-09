
import express, { response } from 'express'
import { addNewProd, viewAll } from '../controllers/product-controller.js';

export const productRoutes=express.Router();

// HTTP Methods
// 1. GET (read)-Bring the data
// 2. POST (write/create)-Data Write/Create
// 3. PUT (update)-Password change
// 4. Delete-Remove
// CRUD

productRoutes.get('/view-products', viewAll)

productRoutes.post('/add-new-product', addNewProd)


















/*
import { addProduct, getProducts } from '../controllers/product-controller.js';

const routes=express.Router();

routes.get('/view-products', getProducts);

routes.post('/add-product', addProduct);

// routes.put('/update-products', (request, response)=>{
//     // Array-Pizzas
//     response.send('Products');
// })

// routes.get('/search-product', (request, response)=>{
//     // Array-Pizzas
//     response.send('Products');
// })
*/