import Ticker from "react-ticker";
import React, {Component} from 'react';

class MoveStuffAround extends Component {
  render() {
  return (
    <Ticker>
      {({ index }) => (
        <>
          <h1 style={{ paddingRight: "0.5em" }}>
            This is the Headline of element #{index}!
          </h1>
        </>
      )}
    </Ticker>
  )
}
}

export default MoveStuffAround;