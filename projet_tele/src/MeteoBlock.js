import React from 'react';

export default class MeteoBlock extends React.Component {
    render() {
      return (
          <div>
            Date : {(this.props.date)} <br/>
            Temperature : {this.props.temp}<br/>
            <img src={ "http://openweathermap.org/img/wn/" + this.props.img+ "@2x.png"}/> : {this.props.meteo}
            </div>
      )
    }
}