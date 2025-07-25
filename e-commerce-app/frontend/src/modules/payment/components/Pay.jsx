
// import React from 'react'

import { useState } from 'react';
import { OAuth } from '../../../shared/services/oauth.js'
import {UserInfo } from '../../users/pages/UserInfo'

export const Pay=({total})=>{

    // const [dispUserForm, setDispUserForm]=useState(false);
    const [user, setUser]=useState(null);

    const orderNow=async()=>{

        // Gmail Login 
        const usercred=await OAuth();
        console.log('User Info ', usercred);

        // setDispUserForm(true);
        setUser(usercred.user);

        // Fill Customer Info
        // Pay Now (Payment)--->Backend DB Store
    }
    return (
        <>
        {!user && <button onClick={orderNow} className="btn btn-primary"> Order Now </button>}
        {user && <UserInfo total={total} email={user.email} name={user.displayName} image={user.photoURL}/>}
        </>
    )
}

