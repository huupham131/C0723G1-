import {useState} from "react";

function useIncrement(addAmount) {
    const [count, setCount] = useState(0);
    function increase() {
        setCount((prevCount) => prevCount + addAmount);
    }
    return [count,increase]
}
function Counter({addAmount}){
    const [count,increase] = useIncrement(addAmount);
    return(
        <>
            <h2>Count: {count}</h2>
            <button onClick={increase}>Add: {addAmount}</button>
        </>
    )
}
export default Counter;