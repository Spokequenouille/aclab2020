import React from 'react';
import MeteoBlock from './MeteoBlock';

export default class Meteo extends React.Component {

  constructor(props) {
    super(props);
    this.state = {
      error: null,
      isLoaded: false,
      items: {},
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
  
  getnextApi() {
    var hours = new Date().getHours();
    var num = Math.ceil(hours/3);
    num = (num+4) % 8;
    return 8-num;
  }

  render() {
    const { error, isLoaded, items } = this.state;
    if (error) {
      return <div>Erreur : {error.message}</div>;
    } else if (!isLoaded) {
      return <div>Chargement…</div>;
    } else {
      const nextApi= this.getnextApi();
      return (
        <div>
          <div class='first_meteo'>
            {/*<img src={ "http://openweathermap.org/img/wn/" + item.weather[0].icon+ "@2x.png"}/> : {item.weather[0].description}*/}
            <MeteoBlock date={items[0].dt_txt} temp={items[0].main.temp} img={items[0].weather[0].icon} meteo={items[0].weather[0].description} first={true}/>
          </div>
          <div class="other_meteo">
            <MeteoBlock date={items[nextApi+8].dt_txt} temp={items[nextApi+8].main.temp} img={items[nextApi+8].weather[0].icon} meteo={items[nextApi+8].weather[0].description}/>
            <MeteoBlock date={items[nextApi+16].dt_txt} temp={items[nextApi+16].main.temp} img={items[nextApi+16].weather[0].icon} meteo={items[nextApi+16].weather[0].description}/>
            <MeteoBlock date={items[nextApi+24].dt_txt} temp={items[nextApi+24].main.temp} img={items[nextApi+24].weather[0].icon} meteo={items[nextApi+24].weather[0].description}/>
          </div>
        </div>
      );
    }
  }
}