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

  );
}

export default App;
