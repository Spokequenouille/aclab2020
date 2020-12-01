import React from 'react';

export default class Meteo extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      error: null,
      isLoaded: false,
      items: {}
    };
  }

  componentDidMount() {
    //appel l'api à l'affichage puis toute les heures
    this.getApi();
    this.interval = setInterval(() => {
      this.getApi();
    }, 3600000)
  }

  getApi() {
    fetch("http://api.openweathermap.org/data/2.5/forecast?q=Lille&appid=ad8c7096e0b579c4b8317d4c0a173495&units=metric&lang=fr")
      .then(res => res.json())
      .then(
        (result) => {
          this.setState({
            isLoaded: true,
            items: result.list
          });
        },
        (error) => {
          this.setState({
            isLoaded: true,
            error
          });
        }
      )
  }

  dtToDate(dt) {
    var t = new Date(dt)
    return t.toISOString()
  }

  render() {
    const { error, isLoaded, items } = this.state;
    if (error) {
      return <div>Erreur : {error.message}</div>;
    } else if (!isLoaded) {
      return <div>Chargement…</div>;
    } else {
      return (
        <div>
          <p>{Math.random()}</p>
        <ul>
          {items.map(item => (
            <li key={item.dt}>
              Date : {(item.dt_txt)} <br/>
              Temperature : {item.main.temp},<br/>
              <img src={ "http://openweathermap.org/img/wn/" + item.weather[0].icon+ "@2x.png"}/> : {item.weather[0].description}
            </li>
          ))}
        </ul>
        </div>
      );
    }
  }
}