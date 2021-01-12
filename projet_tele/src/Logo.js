import React from 'react';
import Symbole from "./img/logo.png";
import Image from 'react-bootstrap/Image';

export default class Logo extends React.Component {
    render() {
        return (
        //todo : fonction pour afficher logo custom
            <Image src={Symbole} thumbnail/> 
        )
    }
}