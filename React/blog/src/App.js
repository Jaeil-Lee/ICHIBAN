/* eslint-disable */

import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {

let post = "강남 우동 맛집"
let [글제목,b] = useState(['一番さん、Lifull合格！','一番さん、ソフトバンクも合格！', '一番さん、京セラまで合格！']);
let [좋아요,c] = useState(0);

// function () {
  
// }


  return (
    <div className="App">
     <div className="nav-bc">
      <h4>Ichibans's Blog</h4>
      <h5>Have a good day!</h5>
     </div>
     <div className="list">
       <h4>{글제목[0]} <span>いいね!👍</span> {좋아요} </h4>
       <p>2月 17日 発行</p>
     </div>
     <div className="list">
       <h4>{글제목[1]}</h4>
       <p>2月 17日 発行</p>
     </div>
     <div className="list">
       <h4>{글제목[2]}</h4>
       <p>2月 17日 発行</p>
     </div>
    </div>
  );
}

export default App;
