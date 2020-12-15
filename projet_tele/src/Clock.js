import React from 'react';


export default class MyClock extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
          time: new Date().toLocaleTimeString()
        };
        
      }
      componentDidMount() {
        this.intervalID = setInterval(
          () => this.tick(),
          1000
        );
      }
      componentWillUnmount() {
        clearInterval(this.intervalID);
      }
      tick() {
        this.setState({
          time: new Date().toLocaleString()
        });
      }
      doTheMultiplication() {
        this.setState(function (prevState, props) {
          return {
            value: prevState.thingToMultiply * props.multiplier
          };
        });
      }
    render(){
        return(
        <div>
          <p className="App-clock">
         {this.state.time}
      </p>
        </div>);
    }
}

