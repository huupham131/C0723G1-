import React, { Component } from 'react';

class Todo extends Component {
    constructor(props) {
        super(props);
        this.state = {
            list: [],
            items: "",
        };
    }

    handleChange = (event) => {
        this.setState({
            items: event.target.value
        });
    }

    handleAddItem = () => {
        if (this.state.items.trim() !== "") {
            this.setState({
                list: [...this.state.list, this.state.items],
                items: ""
            });
        }else {
            alert("Please enter an item");
        }

    }

    render() {
        return (
            <div>
                <h1>Todo List</h1>
                <input type="text" value={this.state.items} onChange={this.handleChange} />
                <button onClick={this.handleAddItem}>Add</button>
                <ul>
                    {this.state.list.map((item, index) => (
                        <li key={index}>{item}</li>
                    ))}
                </ul>
            </div>
        );
    }
}

export default Todo;