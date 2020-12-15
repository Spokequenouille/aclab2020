import logo from './Logos/logo_droit.png';
import './App.css';
import Info from './Informations.js';
import MyClock from './Clock.js';

function App() {
  return (
    <div className="App">
      
      <header className="App-header">
      <Info/>
        <img src={logo} className="App-logo" alt="logo" />

      </header>
      <footer>
      <MyClock/>
      </footer>
    </div>
  );
}

export default App;
