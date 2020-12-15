import logo from './Logos/logo_droit.png';
import './App.css';
import Coconut from './Coconut.js';

function App() {
  return (
    <div className="App">
      
      <header className="App-header">
      <Coconut/>
        <img src={logo} className="App-logo" alt="logo" />

      </header>
    </div>
  );
}

export default App;
