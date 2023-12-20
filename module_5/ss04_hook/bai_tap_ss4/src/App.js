import logo from './logo.svg';
import './App.css';
import Counter from "./components/Counter";

function App() {
  return (
    <div className="App">
     <Counter addAmount={1}/>
     <Counter addAmount={2}/>
    </div>
  );
}

export default App;
