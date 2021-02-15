import React from 'react';
import { Card } from 'react-bootstrap';
import Moment from 'moment';
import 'moment/locale/fr';
import Image from 'react-bootstrap/Image';
import './Meteo.css';

export default class MeteoBlock extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      jour: this.props.date
    };
  }

  render() {
    return (
        <div class="meteoblock">
          {/*Date : {(this.props.date)} <br/>
          Temperature : {this.props.temp}<br/>
          <img src={ "http://openweathermap.org/img/wn/" + this.props.img+ "@2x.png"}/> : {this.props.meteo}*/}
          <div>
          <Card
            bg="info"
            
          >
            <Card.Body>
              <Card.Text>
                <p class="temperature">{this.props.temp}</p>
                <Image src={ "http://openweathermap.org/img/wn/" + this.props.img+ "@2x.png"}/>
              </Card.Text>
            </Card.Body>
          </Card>
          <p class="day">{this.props.first ? "Aujourd'hui" : Moment(this.state.jour).format('dddd')}</p>
          </div>
        </div>
    )
  }
}