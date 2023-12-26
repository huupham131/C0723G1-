import React, {useEffect} from 'react';
import './App.css';
import './components/Header/css/aos.css';
import './components/Header/css/animate.css';
import './components/Header/css/bootstrap.css';
import './components/Header/css/bootstrap-datepicker.css';
import './components/Header/css/bootstrap-grid.css';
import './components/Header/css/bootstrap-reboot.css';
import './components/Header/css/customer.css';
import './components/Header/css/fancybox.min.css';
import './components/Header/css/jquery.timepicker.css';
import './components/Header/css/magnific-popup.css';
import './components/Header/css/owl.carousel.min.css';
import './components/Header/css/style.css';
import './components/Header/fonts/fontawesome/css/font-awesome.min.css'
import './components/Header/fonts/ionicons/css/ionicons.css'

import Aos from 'aos'
import {Route, Routes} from "react-router-dom";
import Home from "./components/Home/Home";
import Room from "./components/Room/Room";
import AddRoom from "./components/Room/AddRoom";
import EditRoom from "./components/Room/EditRoom";
import Customer from "./components/Customer/Customer";
import AddCustomer from "./components/Customer/AddCustomer";
import EditCustomer from "./components/Customer/EditCustomer";
import Contract from "./components/Contract/Contract";
import AddContract from "./components/Contract/AddContract";


function App() {
    useEffect(() => {
        Aos.init();
    }, []);
    return (
        <Routes>
            <Route path={"/"} element={<Home/>}></Route>
            <Route path={"/room"} element={<Room/>}></Route>
            <Route path={"/editRoom"} element={<EditRoom/>}></Route>
            <Route path={"/addRoom"} element={<AddRoom/>}></Route>
            <Route path={"/customer"} element={<Customer/>}></Route>
            <Route path={"/addCustomer"} element={<AddCustomer/>}></Route>
            <Route path={"/editCustomer"} element={<EditCustomer/>}></Route>
            <Route path={"/contract"} element={<Contract/>}></Route>
            <Route path={"/addContract"} element={<AddContract/>}></Route>

        </Routes>
    );
}

export default App;