import { useState } from 'react'

import './App.css'
import BooksManager from './components/BooksManager'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
    <BooksManager/>
    </>
  )
}

export default App