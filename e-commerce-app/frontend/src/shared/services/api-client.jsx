
import axios from 'axios';

export const getApi=async()=>{

    const response=await axios.get(import.meta.env.VITE_PRODUCT_URL);
    return response.data;
}

































/*
export const getApiCall=async(URL)=>{
    const response=await axios.get(URL);
    return response.data;
}
*/