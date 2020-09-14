import React, { Component } from 'react'
import {Nav, NavItem, NavbarBrand} from 'reactstrap';

export class NavBar extends Component {
    render() {
        return (
            <div>
                <Navbar color="light" light expand="md">
                        <NavbarBrand href="/">Expense Tracker</NavbarBrand>
                        <NavbarToggler onClick={toggle} />
                        <Collapse isOpen={isOpen} navbar>
                        <Nav className="mr-auto" navbar>
                            <NavItem>
                            <NavLink href="/home">Home</NavLink>
                            </NavItem>
                            <NavItem>
                            <NavLink href="/categories">Categories</NavLink>
                            </NavItem>
                            <NavItem>
                            <NavLink href="/expenses">Expenses</NavLink>
                            </NavItem>
                        </Nav>
                        <NavbarText>Simple Text</NavbarText>
        </Collapse>
      </Navbar>
            </div>
        )
    }
}

export default NavBar
