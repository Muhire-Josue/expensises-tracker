import React, { Component } from 'react'

export class Category extends Component {
    state = {
        isLoading: true,
        categories: []
    }
    async componentDidMount(){
        const response = await fetch('http://localhost:8080/api/category');
        const body = await response.json();
        console.log('body', body)
        this.setState({categories: body, isLoading: false});
    }
    render() {
        const {isLoading, categories} = this.state;
        if(isLoading){
            return (<div>Loading.....</div>)
        }
        return (
           <div>
               <h2>Categories</h2>
               {
                   categories.map(category => 
                    <div id={category.id}>
                        {category.name}
                    </div>
                    )
               }
           </div>
        )
    }
}

export default Category
