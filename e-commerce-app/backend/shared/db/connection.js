
import mongoose from 'mongoose'

export const createConnection=async()=>{

    try{

        const conInfo=await mongoose.connect(process.env.DB_URL);
        return conInfo;

        // const result=await mongoose.connect(process.env.DB_URL);
        // console.log('DB Connection Created... ');
    }
    catch(err){
        console.log('DB Connection Fails... ', err);
        throw err;
    }

}

// createConnection()
