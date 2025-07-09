
import React from 'react'

const Message=(props)=>{
    
    console.log('Count in Message ', props.count);

    return (
        
        <h1 className={props.color}> {props.msg} {props.count} </h1>

    )
}

export default Message;
