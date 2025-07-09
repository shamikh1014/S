
import express, { response } from 'express'
import cors from 'cors'
import { createConnection } from './shared/db/connection.js';
import dotenv from 'dotenv'
import { productRoutes } from './modules/products/routes/product-route.js';
import { orderRoutes } from './modules/orders/routes/order-route.js';

const app=express();
dotenv.config();
app.use(cors());
app.use(express.json());
app.use('/', productRoutes);
app.use('/', orderRoutes);

// app.use('/', orderRoutes);
// app.get('/products', (request, response)=>{
//     // response.send("<h2> Hello Products... </h2>");
//     // 3 Products
//     response.json({id:1001, name:'Ram'});
// })

const promise=createConnection();
promise.then((conInfo)=>{

    console.log('DB Connection Establish');

    app.listen(process.env.PORT || 4444, err=>{
        if(err){
            console.log('Error in App ', err);
        }
        else{
            console.log('Server Up and Running');
        }
    })

}).catch(err=>{
    console.log('DB Connection is Down... ', err);
})


























/*
const promise=createConnection();
promise.then(r=>{

    app.listen(4444, err=>{

        if(err){
            console.log('Application Crash ', err);
        }
        else{
            console.log('Application Up and Running');
        }
    })

}).catch(err=>{
    console.log("Application can't UP DB is Down");
})
*/

