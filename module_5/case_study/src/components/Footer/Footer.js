import { Link } from 'react-router-dom';
import React from'react';
function Footer(){
    return(
        <footer className="section footer-section">
            <div className="container">
                <div className="row mb-4">
                    <div className="col-md-3 mb-5">
                        <ul className="list-unstyled link">
                            <li><Link to="#">Về chúng tôi</Link></li>
                            <li><Link to="#">Điều khoản &amp; điều kiện</Link></li>
                            <li><Link to="#">Chính sách bảo mật</Link></li>
                        </ul>
                    </div>
                    <div className="col-md-3 mb-5">
                        <ul className="list-unstyled link">
                            <li><Link to="#">Các loại phòng</Link></li>
                            <li><Link to="#">Liên hệ chúng tôi</Link></li>
                            <li><Link to="#">Nhà hàng</Link></li>
                        </ul>
                    </div>
                    <div className="col-md-3 mb-5 pr-md-5 contact-info">
                        <p><span className="d-block"><span className="ion-ios-location h5 mr-3 text-primary"></span>Địa chỉ:</span> <span> 103 - 105 Vo Nguyen Giap Street, Khue My Ward,<br></br> Ngu Hanh Son District, Danang City, Vietnam</span></p>
                        <p><span className="d-block"><span className="ion-ios-telephone h5 mr-3 text-primary"></span>Số điện thoại:</span> <span> 84-236-3847 333/888</span></p>
                        <p><span className="d-block"><span className="ion-ios-email h5 mr-3 text-primary"></span>Email:</span> <span> reservation@furamavietnam.com</span></p>
                    </div>
                    <div className="col-md-3 mb-5">
                        <p>Đăng kí nhận bản tin</p>
                        <form action="#" className="footer-newsletter">
                            <div className="form-group">
                                <input type="email" className="form-control" placeholder="Email..."/>
                                    <button type="submit" className="btn"><span className="fa fa-paper-plane"></span></button>
                            </div>
                        </form>
                    </div>
                </div>
                <div className="row pt-5">


                    <p className="col-md-6 text-right social">
                        <Link to="#"><span className="fa fa-tripadvisor"></span></Link>
                        <Link to="#"><span className="fa fa-facebook"></span></Link>
                        <Link to="#"><span className="fa fa-twitter"></span></Link>
                        <Link to="#"><span className="fa fa-linkedin"></span></Link>
                        <Link to="#"><span class="fa fa-vimeo"></span></Link>
                    </p>
                </div>
            </div>
        </footer>

)
}
export default Footer;