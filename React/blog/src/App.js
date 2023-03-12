import logo from './logo.svg';
import './App.css';

function App() {

let post = "일본 노래"

  return (
    <div className="App">
     <div className="nav-bc">
      <h4>Ichibanのブログであります。</h4>
     </div>
     <h4>{post}</h4>
    </div>
  );
}

export default App;
