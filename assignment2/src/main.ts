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
        <p> a;dkjhdflkjhdflkj  5tgb5tg5tgb5tgb5tgb5tgb </p>
        <button type="submit"> Solve that cubic! </button>
        <button type="reset"> Clear </button>
        <input> INPUT </input>
      </body>
    </div>
  </html>
`

setupCounter(document.querySelector<HTMLButtonElement>('#counter')!)