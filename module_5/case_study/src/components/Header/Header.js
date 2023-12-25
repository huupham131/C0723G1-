import { Link } from 'react-router-dom';
import {NavLink } from "react-router-dom";

function Header() {

    return (
        <>
            <header className="site-header js-site-header">
                <div className="container-fluid">
                    <div className="row align-items-center">
                        <div className="col-6 col-lg-4 site-logo" data-aos="fade">
                            <Link to="/">Furama Resort</Link>
                        </div>
                        <div className="col-6 col-lg-8">
                            <div className="site-menu-toggle js-site-menu-toggle" data-aos="fade">
                                <span></span>
                                <span></span>
                                <span></span>
                            </div>

                            <div className="site-navbar js-site-navbar">
                                <nav role="navigation">
                                    <div className="container">
                                        <div className="row full-height align-items-center">
                                            <div className="col-md-6 mx-auto">
                                                <ul className="list-unstyled menu">
                                                    <li><NavLink to={"/"} activeClassName="active">Trang chủ</NavLink></li>
                                                    <li><Link to={"/room"}>Loại phòng</Link></li>
                                                    <li><Link to={"/customer"}>Khách hàng</Link></li>
                                                    <li><Link to="/">About</Link></li>
                                                    <li><Link to="/">Sự kiện</Link></li>
                                                    <li><Link to="/">Liên hệ</Link></li>
                                                    <li><Link to="/">Reservation</Link></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
            </header>

        </>
    );
}

export default Header;
