import React from "react";

import List from "components/List";
import listMovies from "movies.json";
import EmptyState from "./components/EmptyState";
import './App.css';

const black = '#000000';
const white = '#ffffff';

export default class App extends React.Component {

  constructor(props){
    super(props);
    this.state = {favItems: [],
      show : true,
      color : white
    };
    this.darkMode = this.darkMode.bind(this);
  };
    

  handleItemClick = (item) =>{
    const newItems = [ ...this.state.favItems];
    const newItem = { ...item};

    const targetInd = newItems.findIndex((it) => it.id === newItem.id);

    if(targetInd < 0) newItems.push(newItem);
    
    this.setState({favItems: newItems});
  };

  handleRemoveFavList = (item) =>{
    const newItems = [ ...this.state.favItems];
    const newItem = { ...item};

    const targetInd = newItems.findIndex((it) => it.id === newItem.id);

    if(targetInd < 0) newItems.push(newItem);
    else newItems.splice(targetInd, 1);

    this.setState({favItems: newItems});
  }

  handleRemoveAll = () =>{
    const newItems = [ ...this.state.favItems];

    newItems.splice(0, newItems.length);
    this.setState({favItems: newItems});
  }

  darkMode = () =>{
    if(this.state.color === black){
      this.setState({
        color: white
      });
    } else {
      this.setState({
        color: black
      });
    }  
  };
  


  showToggle = () => {
    const {show} = this.state;
    this.setState({show : !show});
  };

  render(){
    const {favItems} = this.state;
  return (
    <div className="container-fluid" style={{background: this.state.color}}>
      <h1 className="text-center mt-3 mb-0">Favorites Movie App</h1>
      <p className="text-center text-secondary text-sm font-italic">
        (This is a <strong>class-based</strong> application)
        <br />
        <br />
        <label className="switch">
        <input type="checkbox" onClick={this.showToggle} />
        <span className="slider round"></span>
        <br />
        <br />
        <p className="text-center text-secondary text-sm">Show Favorites</p>
      </ label>
      </p>
      
      <div className="container pt-3">
        <div className="row">
          <div className="col-sm">
            <List
              title="List Movies"
              items={listMovies}
              onItemClick={this.handleItemClick}
            />
          </div>
          {!this.state.show ?
          <div className="col-sm">
            {!this.state.favItems.length ? <EmptyState/> :
            <List
              title="My Favorites"
              items={favItems}
              onItemClick={this.handleRemoveFavList}
            />}
            {!this.state.favItems.length ? null :
            <button
              onClick={this.handleRemoveAll} className="btn btn-danger"
            > Hapus Semua </button>}
          </div>
          : null}
        </div>
        <br />
        <br />
        <label className="switch">
        <input type="checkbox" onClick={this.darkMode} />
        <span className="slider round"></span>
        <br />
        <br />
        <p className="text-center text-secondary text-sm">Dark Mode</p>
      </ label>
      </div>
    </div>
  );
}
}

