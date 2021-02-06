import React, {Component} from 'react';
import TextTicker from 'react-native-text-ticker'

export default class MyMarquee extends Component{
  render(){
      return(
        <TextTicker
        style={{ fontSize: 14 }}
        duration={3000}
        loop
        bounce
        repeatSpacer={50}
        marqueeDelay={1000}
      >
        Super long piece of text is long. The quick brown fox jumps over the lazy dog.
      </TextTicker>
    );
  }
}