import { useState } from 'react'
import { BrowserRouter } from 'react-router-dom'
import AuthPages from './Components/LoginPage/AuthPages'
import './Style.css'


function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <BrowserRouter>
      <AuthPages/>
      </BrowserRouter>
    </>
  )
}

export default App
