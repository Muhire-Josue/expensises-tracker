import React from 'react';
import './App.css';
import Categories from './Category';
import Expenses from './Expense';
import {Route, BrowserRouter as Router, Switch} from 'react-router-dom'

function App() {
  return (
    <Router>
      <Switch>
        <Route path="/categories" exact={true} component={Categories}/>
        <Route path="/expenses" exact={true} component={Expenses}/>
      </Switch>
    </Router>
  );
}

export default App;
