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
                                                    <li><NavLink to="/" activeClassName="active">Trang chủ</NavLink></li>
                                                    <li><Link to="/">Loại phòng</Link></li>
                                                    <li><Link to="/">Khách hàng</Link></li>
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

            <section className="site-hero overlay" style={{backgroundImage: "url('https://cf.bstatic.com/xdata/images/hotel/max1280x900/37836676.jpg?k=6e5197f999e346e00edd20fe9de55d145f8f8ba7acf290921f4b1def1bbf6f93&o=&hp=1')"}} data-stellar-background-ratio="0.5">
                <div className="container">
                    <div className="row site-hero-inner justify-content-center align-items-center">
                        <div className="col-md-10 text-center" data-aos="fade-up">
                            <span className="custom-caption text-uppercase text-white d-block  mb-3">Welcome To 5 <span className="fa fa-star text-primary"></span> Resort</span>
                            <h1 className="heading">Lựa chọn tốt nhất để trải nghiệm</h1>
                        </div>
                    </div>
                </div>

                <Link className="mouse smoothscroll" to="/">
                    <div className="mouse-icon">
                        <span className="mouse-wheel"></span>
                    </div>
                </Link>
            </section>
        </>
    );
}

export default Header;
