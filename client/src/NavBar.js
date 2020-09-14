import React, { Component } from 'react'
import {Nav, NavItem, NavbarBrand, Navbar, NavLink} from 'reactstrap';

export class NavBar extends Component {
    render() {
        return (
            <div>
                <Navbar color="dark" light expand="md">
                        <NavbarBrand href="/">Expense Tracker</NavbarBrand>
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
      </Navbar>
            </div>
        )
    }
}

export default NavBar
