// import './style.css'
import typescriptLogo from './typescript.svg'
import viteLogo from '/vite.svg'
import { setupCounter } from './counter.ts'

document.querySelector<HTMLDivElement>('#app')!.innerHTML = `
  <html>
    <div>
      <head>
        <h1> Cubic Solver </h1>
      </head>
      <body>
        <input> a-value: </input>
        <input> b-value: </input>
        <input> c-value: </input>
        <input> d-value: </input>
        <br>
        <button type="submit"> Solve that cubic! </button>
        <button type="reset"> Clear </button>
      </body>
    </div>
  </html>
`

setupCounter(document.querySelector<HTMLButtonElement>('#counter')!)