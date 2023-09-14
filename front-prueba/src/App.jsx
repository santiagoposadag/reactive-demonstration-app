import { useEffect, useRef, useState } from 'react'
import './App.css'
import Sale from './components/Sale'


function App() {
  const [sales, setSales] = useState([])
  const [mode, setMode] = useState(false)

  const handleRetrieve = () => {
    if(mode){
      fetchDataStream()
    }else{
      fetchDataSync()
    }
    
  }

  const handleModeChange = () => {
    setMode(!mode)
  }

  /*useEffect(() => {
    const eventSource = new EventSource('http://localhost:8081/sales/get/all');

    eventSource.onmessage = (event) => {
      updateSalesArray(event.data)
    }

    // Clean up the event source on component unmount
    return () => {
      eventSource.close();
    };
  }, []); */


  function fetchDataStream(){
    let source = new EventSource('http://localhost:8081/sales/get/all')
    source.onmessage = function(event){
      let data = JSON.parse(event.data)
      setSales(previous => [...previous, data])
    }
    source.onerror = (event) => {
      console.log(event);
      source.close()
    }
  }

  async function fetchDataSync(){
    const response = await fetch('http://localhost:8080/sales/get/all')
    const data = await response.json()
    console.log(data);
    setSales(data)
  }

    

  return (
    <>
    <h1>Sales registry</h1>
    <button onClick={handleRetrieve}>retrieve</button>
    <br />
    <button onClick={handleModeChange}>{mode?"Reactive":"No-reactive"}</button>
    <section>
      {sales.map((sale, index) => {
            return <Sale  key={index} sale={sale} index={index}/>
        })}
    </section>
    </>
  )
}

export default App
