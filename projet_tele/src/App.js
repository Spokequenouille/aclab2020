<<<<<<< HEAD
import './App.css';
import React from 'react';
import { Container, Row, Col } from 'react-bootstrap';
import Meteo from './Meteo';
import 'bootstrap/dist/css/bootstrap.min.css';
import Logo from './Logo.js';

function App() {
  return (
    <Container fluid>
      <Row>
        <Col>
          <Logo/>
          <Meteo/>
        </Col>
        <Col lg="8"> Col 2</Col>
      </Row>
      <Row>
        News
      </Row>
    </Container>

=======
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
>>>>>>> 93473a069dcf3d0ce6c61c306abb15fcfef0385f
  );
}

export default App;
