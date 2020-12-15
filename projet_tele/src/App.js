import logo from './logo.svg';
import './App.css';
import Coconut from './Coconut.js';
import MyClock from './Clock.js';

function App() {
  return (
    <div className="App">
      
      <header className="App-header">
      <Coconut/>
      <MyClock/>
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Cliquez bande de bg
        </a>
      </header>
    </div>
  );
}

export default App;
