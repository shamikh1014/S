
// import React from 'react'

import { payWithRazorPay } from "../../shared/services/payment"

export const UserInfo=({email, image, name, total})=>{

    const payNow=()=>{
        payWithRazorPay(email, name, total);
    }

    return (

        <div>

            <img src={image}/>
            <div className='form-group'>
                <label htmlFor> Email </label>
                <label htmlFor> {email} </label>
            </div>

            <div className='form-group'>
                <label htmlFor> Name </label>
                <input value={name} className='form-control' type='text' placeholder=''> {name} </input>
            </div>

            <div>
                <label htmlFor=""> Address </label>
                <textarea cols="30" rows="10"></textarea>
            </div>

            <button onClick={payNow} className='btn btn-primary'> Pay Now </button>

        </div>
    )
}