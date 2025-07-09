
import { useState } from "react";
import { Button } from "../components/Button"
import Message from "../components/Message"


export const CounterApp=()=>{

    const [count, setCount]=useState(0);
    // var count=0;

    const plus=()=>{

        // count++;
        setCount(count+1);
        console.log('Plus ', count);
        
    }

    const minus=()=>{

        // count--;
        setCount(count-1);
        console.log('Minus ', count);

    }

    return (<div className="container">

        <Message color="alert alert-success text-center" msg="Counter App"/>
        <Message color="alert alert-info" msg="Counter Value is " count={count}/>

        <Button fn={plus} val="+" color="btn btn-primary"/> &nbsp;
        <Button fn={minus} val="-" color="btn btn-danger"/>

    </div>)
}