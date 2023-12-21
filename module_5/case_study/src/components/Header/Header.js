import React from 'react';
function Header() {
    return (


        <header className="site-header js-site-header">
            <div className="container-fluid">
                <div className="row align-items-center">
                    <div className="col-6 col-lg-4 site-logo" data-aos="fade"><a href="">Furama Resort</a>
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
                                                <li><a href="">Trang chủ</a></li>
                                                <li><a href="">Loại phòng</a></li>
                                                <li className="active"><a href="">Khách hàng</a></li>
                                                <li><a href="">About</a></li>
                                                <li><a href="">Sự kiện</a></li>
                                                <li><a href="">Liên hệ</a></li>
                                                <li><a href="">Reservation</a></li>
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
    )
}

export default Header