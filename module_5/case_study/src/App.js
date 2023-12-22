import React from 'react';
import { BrowserRouter as Router } from 'react-router-dom';  // Sử dụng BrowserRouter
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
import Header from './components/Header/Header';
import Content from './components/Content/Content';
import Footer from './components/Footer/Footer';



function App() {
  return (
      <Router>
        <Header />
          <Content />
          <Footer />
      </Router>
  );
}

export default App;