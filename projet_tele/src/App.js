import logo from './Logos/logo_droit.png';
import './App.css';
import Info from './Informations.js';
import MyClock from './Clock.js';
import MyMarquee from './Marquee.js';

function App() {
  return (
    <div className="App">
      
      <header className="App-header">
        <aside className="App-aside">
          <img src={logo} className="App-logo" alt="logo" />
          <div className="App-aside-data">
            <MyClock/>
            <div className="App-aside-meteo">
            METEO
            </div>
          </div>
        </aside>
        <div className="App-infos" >
          <Info/>
        </div>
      </header>
      <footer className="App-footer-scrolling">
      <MyMarquee/>
      </footer>
    </div>
  );
}

export default App;
