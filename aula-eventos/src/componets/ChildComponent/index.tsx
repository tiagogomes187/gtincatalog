import { useState } from "react"

type Props = {
    // eslint-disable-next-line @typescript-eslint/ban-types
    onNewValue?: Function;
}

export default function ChildComponent({onNewValue} : Props) {


    const [count, setCount] = useState(0);

    function handleClick(){
        const newCount = count + 1;
        setCount(newCount);
        if(onNewValue){
            onNewValue(newCount);
        }
        
    }

    return (
        <div style={{border: "1px solid red", padding: "10px"}}>
            <p>Filho</p>

            {count}
            <button onClick={handleClick}>OK</button>

        </div>
    )
}