import logo from './Logos/logo_fges.png';
import './App.css';
import Info from './Informations.js';
import MyClock from './Clock.js';
import MoveStuffAround from './Marquee.js';
import Meteo from './Meteo';
import AppDash from './admin/app';
import { BrowserRouter, Route, Switch } from 'react-router-dom';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
      <Switch>
        <Route exact path='/'>
        <div className="App-header">
        <aside className="App-aside">
          <img src={logo} className="App-logo" alt="logo" />
          <div className="App-aside-data">
            <MyClock/>
            <div className="App-aside-meteo">
              <Meteo/>
            </div>
          </div>
        </aside>
        <div className="App-infos" >
          <Info/>
        </div>
      </div>
      <footer >
      <MoveStuffAround/>
      </footer>
      </Route>
      <Route path="/dashboard">
        <AppDash/>
      </Route>
      </Switch>
      </BrowserRouter>
    </div>
  );
}

export default App;
