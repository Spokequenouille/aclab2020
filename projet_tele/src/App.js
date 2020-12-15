import './App.css';
import React from 'react';
import { Container, Row, Col } from 'react-bootstrap';
import Meteo from './Meteo';
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {
  return (
    <Container>
      <Row>
        <Col>Col 1 </Col>
        <Col> Col 2</Col>
        <Col>
          <Meteo/>
        </Col>
      </Row>
    </Container>

  );
}

export default App;
