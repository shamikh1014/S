
export const Button=({val, color, fn})=>{

    return (<button onClick={fn} className={color}> {val} </button>)

}