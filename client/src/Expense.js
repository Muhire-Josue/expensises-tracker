import React, { Component } from 'react';
import DatePicker from "react-datepicker";
import "react-datepicker/dist/react-datepicker.css";
import {Container, Input, Button, Label, Form, FormGroup} from 'reactstrap' 
import {Link} from 'react-router-dom';

export class Expense extends Component {

    emptyItem = {
        id: '102',
        expenseDate: '2020-09-09',
        description: 'Hello from react',
        location: 'react client',
        categories: [1, 'Travel']
    }
    constructor(props){
        this.state ={
            date: new Date(),
            expenses: [],
            categories: [],
            isLoading: true
        }
    }
    
    handleChange(){

    }
    async componentDidMount(){
        const response = await fetch('http://localhost:8080/api/category');
        const body = await response.json();
        console.log('body', body)
        this.setState({categories: body, isLoading: false});
    }
    render() {

        const {categories, isLoading} = this.state;
        if (isLoading) {
            return (<div> Loading...</div>)
        }

        return (
            <div>
                <Container />
                <Form onSubmit={this.handleSubmit}>

                    <FormGroup>
                        <Label for="title">Title</Label>
                        <Input type="text" name="title" id="title" onChange={this.handleChange}/>
                    </FormGroup>
                    <FormGroup>
                    <select>
                        {categories.map(category => <option id={category.id}>{category.name}</option>)}
                    </select>
                    </FormGroup>
                    <FormGroup>
                        <Label for="expenseDate">Expense Date</Label>
                        <DatePicker selected={this.state.date} onChange={this.handleChange}/>
                    </FormGroup>

                    <FormGroup>
                        <Label for="location">Location</Label>
                        <Input type="text" name="location" id="location" onChange={this.handleChange}/>
                    </FormGroup>

                    <FormGroup>
                        <Button color="primary" type="submit">Save</Button>
                        <Button color="secondary" tag={Link} to="/categories">Cancel</Button>
                    </FormGroup>
                </Form>
            </div>
        )
    }
}

export default Expense
