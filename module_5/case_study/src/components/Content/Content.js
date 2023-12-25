import { Link } from 'react-router-dom';
function Content() {
    return (
        <>
            <section className="section bg-light pb-0">
                <div className="container">
                    <div className="row check-availabilty" id="next">
                        <div className="block-32" data-aos="fade-up" data-aos-offset="-200">
                            <form action="#">
                                <div className="row">
                                    <div className="col-md-6 mb-3 mb-lg-0 col-lg-3">
                                        <label htmlFor="checkin_date" className="font-weight-bold text-black">Check
                                            In</label>
                                        <div className="field-icon-wrap">
                                            <div className="icon"><span className="icon-calendar"/></div>
                                            <input type="text" id="checkin_date" className="form-control"/>
                                        </div>
                                    </div>
                                    <div className="col-md-6 mb-3 mb-lg-0 col-lg-3">
                                        <label htmlFor="checkout_date" className="font-weight-bold text-black">Check
                                            Out</label>
                                        <div className="field-icon-wrap">
                                            <div className="icon"><span className="icon-calendar"/></div>
                                            <input type="text" id="checkout_date" className="form-control"/>
                                        </div>
                                    </div>
                                    <div className="col-md-6 mb-3 mb-md-0 col-lg-3">
                                        <div className="row">
                                            <div className="col-md-6 mb-3 mb-md-0">
                                                <label htmlFor="adults" className="font-weight-bold text-black">Người
                                                    lớn</label>
                                                <div className="field-icon-wrap">
                                                    <div className="icon"><span className="ion-ios-arrow-down"/></div>
                                                    <select name="" id="adults" className="form-control">
                                                        <option value="1">1</option>
                                                        <option value="2">2</option>
                                                        <option value="3">3</option>
                                                        <option value="4+">4+</option>
                                                    </select>
                                                </div>
                                            </div>
                                            <div className="col-md-6 mb-3 mb-md-0">
                                                <label htmlFor="children" className="font-weight-bold text-black">Trẻ
                                                    em</label>
                                                <div className="field-icon-wrap">
                                                    <div className="icon"><span className="ion-ios-arrow-down"></span>
                                                    </div>
                                                    <select name="" id="children" className="form-control">
                                                        <option value="1">1</option>
                                                        <option value="2">2</option>
                                                        <option value="3">3</option>
                                                        <option value="4+">4+</option>
                                                    </select>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div className="col-md-6 col-lg-3 align-self-end">
                                        <button className="btn btn-primary btn-block text-white">Check Availability
                                        </button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </section>

            <section className="py-5 bg-light">
                <div className="container">
                    <div className="row align-items-center">
                        <div className="col-md-12 col-lg-7 ml-auto order-lg-2 position-relative mb-5"
                             data-aos="fade-up">
                            <figure className="img-absolute">
                                <img src="images/food-1.jpg" alt="Image" className="img-fluid"/>
                            </figure>
                            <img src="images/img_1.jpg" alt="Image" className="img-fluid rounded"/>
                        </div>
                        <div className="col-md-12 col-lg-4 order-lg-1" data-aos="fade-up">
                            <h6 className="heading">FURAMA ĐÀ NẴNG!</h6>
                            <p className="mb-4">Hướng ra bãi biển Đà Nẵng trải dài cát trắng, Furama Resort Đà Nẵng là
                                cửa ngõ
                                đến với 3 di sản văn hoá thế giới: Hội An (20 phút), Mỹ Sơn (90 phút) và Huế (2 tiếng.
                                196 phòng
                                hạng sang cùng với 70 căn biệt thự từ hai đến bốn phòng ngủ có hồ bơi riêng đều được
                                trang trí
                                trang nhã, theo phong cách thiết kế truyền thống của Việt Nam và kiến trúc thuộc địa của
                                Pháp,
                                biến Furama thành khu nghỉ dưỡng danh giá nhất tại Việt Nam.</p>
                            <p><Link to="#" className="btn btn-primary text-white py-2 mr-3">Xem thêm</Link>> <span
                                className="mr-3 font-family-serif"><em>or</em></span> <Link
                                to="https://www.youtube.com/watch?v=Z6_JZ8Ao6-c&t=1s" data-fancybox
                                className="text-uppercase letter-spacing-1">Xem video</Link>></p>
                        </div>
                    </div>
                </div>
            </section>

            <section className="section">
                <div className="container">
                    <div className="row justify-content-center text-center mb-5">
                        <div className="col-md-7">
                            <h2 className="heading" data-aos="fade-up">Các loại phòng</h2>
                            <p data-aos="fade-up" data-aos-delay="100">Khu nghỉ dưỡng có 196 phòng được thiết kế theo
                                phong cách
                                truyền thống Việt Nam kết hợp với phong cách Pháp, 2 tòa nhà 4 tầng có hướng nhìn ra
                                biển, nhìn
                                ra hồ bơi trong xanh và những khu vườn nhiệt đới xanh tươi mát. Ngoài ra, khu nghỉ dưỡng
                                Furama
                                còn cung cấp các liệu pháp spa, phòng xông hơi ướt, phòng xông hơi khô, dịch vụ
                                mát-xa
                                cạnh hồ bơi, các dịch vụ thể thao dưới nước và các lớp tập Thái Cực Quyền trên
                                bãi
                                biển.</p>
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-6 col-lg-4" data-aos="fade-up">
                            <Link to="#" className="room">
                                <figure className="img-wrap">
                                    <img
                                        src="https://furamavietnam.com/wp-content/uploads/2018/03/Vietnam_Danang_Furama_Lagoon-Superior-twin-bed-F-370x239.jpg"
                                        alt="Free website template" className="img-fluid mb-3"/>
                                </figure>
                                <div className="p-3 text-center room-info">
                                    <h2>Phòng superior</h2>
                                </div>
                            </Link>
                        </div>

                        <div className="col-md-6 col-lg-4" data-aos="fade-up">
                            <Link to="#" className="room">
                                <figure className="img-wrap">
                                    <img
                                        src="https://furamavietnam.com/wp-content/uploads/2018/03/Vietnam_Danang_Furama_Ocean-Studio-Suite-F-370x239.jpg"
                                        alt="Free website template" className="img-fluid mb-3"/>
                                </figure>
                                <div className="p-3 text-center room-info">
                                    <h2>Phòng suite</h2>

                                </div>
                            </Link>
                        </div>

                        <div className="col-md-6 col-lg-4" data-aos="fade-up">
                            <Link to="#" className="room">
                                <figure className="img-wrap">
                                    <img
                                        src="https://furamavietnam.com/wp-content/uploads/2018/03/Presidential-Suite-F-370x239.jpg"
                                        alt="Free website template" className="img-fluid mb-3"/>
                                </figure>
                                <div className="p-3 text-center room-info">
                                    <h2>Phòng Presidential</h2>
                                </div>
                            </Link>
                        </div>


                    </div>
                </div>
            </section>


            <section className="section slider-section bg-light">
                <div className="container">
                    <div className="row justify-content-center text-center mb-5">
                        <div className="col-md-7">
                            <h2 className="heading" data-aos="fade-up">Tổng quan</h2>
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-12">
                            <div className="home-slider major-caousel owl-carousel mb-5" data-aos="fade-up"
                                 data-aos-delay="200">
                                <div className="slider-item">
                                    <Link to="https://cf.bstatic.com/xdata/images/hotel/max1280x900/62371531.jpg?k=fb1828d64f739b526944dcb487699e4625ad8799986e0e4ef5c2c930dcf39b6c&o=&hp=1"
                                       data-fancybox="images" data-caption="Caption for this image"><img
                                        src="https://cf.bstatic.com/xdata/images/hotel/max1280x900/62371531.jpg?k=fb1828d64f739b526944dcb487699e4625ad8799986e0e4ef5c2c930dcf39b6c&o=&hp=1"
                                        alt="Image placeholder" className="img-fluid"/></Link>
                                </div>
                                <div className="slider-item">
                                    <Link to="https://cf.bstatic.com/xdata/images/hotel/max1280x900/64070859.jpg?k=f340e2ee68e6e898a6d9200ade7ba0ad27836a5591549e896d607243c16e6c51&o=&hp=1"
                                       data-fancybox="images" data-caption="Caption for this image"><img
                                        src="https://cf.bstatic.com/xdata/images/hotel/max1280x900/64070859.jpg?k=f340e2ee68e6e898a6d9200ade7ba0ad27836a5591549e896d607243c16e6c51&o=&hp=1"
                                        alt="Image placeholder" className="img-fluid"/></Link>
                                </div>
                                <div className="slider-item">
                                    <Link to="https://cf.bstatic.com/xdata/images/hotel/max1280x900/154610230.jpg?k=46affac8d9773acf603bfef22aeadb8221aa792e581e285c11770876251c7c83&o=&hp=1"
                                       data-fancybox="images" data-caption="Caption for this image"><img
                                        src="https://cf.bstatic.com/xdata/images/hotel/max1280x900/154610230.jpg?k=46affac8d9773acf603bfef22aeadb8221aa792e581e285c11770876251c7c83&o=&hp=1"
                                        alt="Image placeholder" className="img-fluid"/></Link>
                                </div>
                                <div className="slider-item">
                                    <Link to="https://cf.bstatic.com/xdata/images/hotel/max1280x900/206455597.jpg?k=6d04468d13e2dec9b6680c51e37b890788ab8204f3b475478a0a1fe61052a042&o=&hp=1"
                                       data-fancybox="images" data-caption="Caption for this image"><img
                                        src="https://cf.bstatic.com/xdata/images/hotel/max1280x900/206455597.jpg?k=6d04468d13e2dec9b6680c51e37b890788ab8204f3b475478a0a1fe61052a042&o=&hp=1"
                                        alt="Image placeholder" className="img-fluid"/></Link>
                                </div>
                                <div className="slider-item">
                                    <Link to="https://cf.bstatic.com/xdata/images/hotel/max1280x900/64261840.jpg?k=d1e6072b27235f3a38da4cefc7e28641918a5c66b1b77872188e8f7429b1d2d5&o=&hp=1"
                                       data-fancybox="images" data-caption="Caption for this image"><img
                                        src="https://cf.bstatic.com/xdata/images/hotel/max1280x900/64261840.jpg?k=d1e6072b27235f3a38da4cefc7e28641918a5c66b1b77872188e8f7429b1d2d5&o=&hp=1"
                                        alt="Image placeholder" className="img-fluid"/></Link>
                                </div>
                                <div className="slider-item">
                                    <Link to="https://cf.bstatic.com/xdata/images/hotel/max1280x900/160407105.jpg?k=9db3214928c5013d29fe7e34e8f741c0e52c6907960385cfa045a766ee6f8731&o=&hp=1"
                                       data-fancybox="images" data-caption="Caption for this image"><img
                                        src="https://cf.bstatic.com/xdata/images/hotel/max1280x900/160407105.jpg?k=9db3214928c5013d29fe7e34e8f741c0e52c6907960385cfa045a766ee6f8731&o=&hp=1"
                                        alt="Image placeholder" className="img-fluid"/></Link>
                                </div>
                                <div className="slider-item">
                                    <Link to="https://cf.bstatic.com/xdata/images/hotel/max1280x900/207296917.jpg?k=825c5a63e151fe2fa92bf1073d140f9399a43026f3c07e9598313295efd53d94&o=&hp=1"
                                       data-fancybox="images" data-caption="Caption for this image"><img
                                        src="https://cf.bstatic.com/xdata/images/hotel/max1280x900/207296917.jpg?k=825c5a63e151fe2fa92bf1073d140f9399a43026f3c07e9598313295efd53d94&o=&hp=1"
                                        alt="Image placeholder" className="img-fluid"/></Link>
                                </div>
                            </div>


                        </div>

                    </div>
                </div>
            </section>


            <section className="section bg-image overlay" style={{backgroundImage: "url('images/hero_3.jpg');"}}>
                <div className="container">
                    <div className="row justify-content-center text-center mb-5">
                        <div className="col-md-7">
                            <h2 className="heading text-white" data-aos="fade">TRẢI NGHIỆM ẨM THỰC</h2>
                            <p className="text-white" data-aos="fade" data-aos-delay="100">Trải nghiệm ẩm thực tại
                                Furama có sự
                                pha trộn độc đáo các món ăn truyền thống Việt Nam với hương vị ẩm thực châu Á, Ý và châu
                                Âu cùng
                                các món bò nhập khẩu thượng hạng tại đa dạng các nhà hàng, quầy bar đẳng cấp được bao
                                quanh bởi
                                một khu vườn nhiệt đới hay hướng mình ra biển.</p>
                        </div>
                    </div>
                    <div className="food-menu-tabs" data-aos="fade">
                        <ul className="nav nav-tabs mb-5" id="myTab" role="tablist">
                            <li className="nav-item">
                                <Link className="nav-link active letter-spacing-2" id="mains-tab" data-toggle="tab"
                                   to="#mains"
                                   role="tab" aria-controls="mains" aria-selected="true">Mains</Link>
                            </li>
                            <li className="nav-item">
                                <Link className="nav-link letter-spacing-2" id="desserts-tab" data-toggle="tab"
                                   to="#desserts"
                                   role="tab" aria-controls="desserts" aria-selected="false">Desserts</Link>
                            </li>
                            <li className="nav-item">
                                <Link className="nav-link letter-spacing-2" id="drinks-tab" data-toggle="tab"
                                   to="#drinks"
                                   role="tab" aria-controls="drinks" aria-selected="false">Drinks</Link>
                            </li>
                        </ul>
                        <div className="tab-content py-5" id="myTabContent">


                            <div className="tab-pane fade show active text-left" id="mains" role="tabpanel"
                                 aria-labelledby="mains-tab">
                                <div className="row">
                                    <div className="col-md-6">
                                        <div className="food-menu mb-5">
                                            <span className="d-block text-primary h4 mb-3">$20.00</span>
                                            <h3 className="text-white"><Link to="#" className="text-white">Murgh Tikka
                                                Masala</Link>
                                            </h3>
                                            <p className="text-white text-opacity-7">Far far away, behind the word
                                                mountains,
                                                far from the countries Vokalia and Consonantia, there live the blind
                                                texts.</p>
                                        </div>
                                        <div className="food-menu mb-5">
                                            <span className="d-block text-primary h4 mb-3">$35.00</span>
                                            <h3 className="text-white"><Link to="#" className="text-white">Fish
                                                Moilee</Link></h3>
                                            <p className="text-white text-opacity-7">Far far away, behind the word
                                                mountains,
                                                far from the countries Vokalia and Consonantia, there live the blind
                                                texts.</p>
                                        </div>
                                        <div className="food-menu mb-5">
                                            <span className="d-block text-primary h4 mb-3">$15.00</span>
                                            <h3 className="text-white"><Link to="#" className="text-white">Safed
                                                Gosht</Link></h3>
                                            <p className="text-white text-opacity-7">Far far away, behind the word
                                                mountains,
                                                far from the countries Vokalia and Consonantia, there live the blind
                                                texts.</p>
                                        </div>
                                    </div>
                                    <div className="col-md-6">
                                        <div className="food-menu mb-5">
                                            <span className="d-block text-primary h4 mb-3">$10.00</span>
                                            <h3 className="text-white"><Link to="#" className="text-white">French Toast
                                                Combo</Link>
                                            </h3>
                                            <p className="text-white text-opacity-7">Far far away, behind the word
                                                mountains,
                                                far from the countries Vokalia and Consonantia, there live the blind
                                                texts.</p>
                                        </div>
                                        <div className="food-menu mb-5">
                                            <span className="d-block text-primary h4 mb-3">$8.35</span>
                                            <h3 className="text-white"><Link to="#" className="text-white">Vegie
                                                Omelet</Link></h3>
                                            <p className="text-white text-opacity-7">Far far away, behind the word
                                                mountains,
                                                far from the countries Vokalia and Consonantia, there live the blind
                                                texts.</p>
                                        </div>
                                        <div className="food-menu mb-5">
                                            <span className="d-block text-primary h4 mb-3">$22.00</span>
                                            <h3 className="text-white"><Link to="#"
                                                                          className="text-white">Chorizo &amp; Egg
                                                Omelet</Link></h3>
                                            <p className="text-white text-opacity-7">Far far away, behind the word
                                                mountains,
                                                far from the countries Vokalia and Consonantia, there live the blind
                                                texts.</p>
                                        </div>
                                    </div>
                                </div>


                            </div>


                            <div className="tab-pane fade text-left" id="desserts" role="tabpanel"
                                 aria-labelledby="desserts-tab">
                                <div className="row">
                                    <div className="col-md-6">
                                        <div className="food-menu mb-5">
                                            <span className="d-block text-primary h4 mb-3">$11.00</span>
                                            <h3 className="text-white"><Link to="#" className="text-white">Banana
                                                Split</Link></h3>
                                            <p className="text-white text-opacity-7">Far far away, behind the word
                                                mountains,
                                                far from the countries Vokalia and Consonantia, there live the blind
                                                texts.</p>
                                        </div>
                                        <div className="food-menu mb-5">
                                            <span className="d-block text-primary h4 mb-3">$72.00</span>
                                            <h3 className="text-white"><Link to="#" className="text-white">Sticky Toffee
                                                Pudding</Link></h3>
                                            <p className="text-white text-opacity-7">Far far away, behind the word
                                                mountains,
                                                far from the countries Vokalia and Consonantia, there live the blind
                                                texts.</p>
                                        </div>
                                        <div className="food-menu mb-5">
                                            <span className="d-block text-primary h4 mb-3">$26.00</span>
                                            <h3 className="text-white"><Link to="#" className="text-white">Pecan</Link></h3>
                                            <p className="text-white text-opacity-7">Far far away, behind the word
                                                mountains,
                                                far from the countries Vokalia and Consonantia, there live the blind
                                                texts.</p>
                                        </div>
                                    </div>
                                    <div className="col-md-6">
                                        <div className="food-menu mb-5">
                                            <span className="d-block text-primary h4 mb-3">$42.00</span>
                                            <h3 className="text-white"><Link to="#" className="text-white">Apple
                                                Strudel</Link></h3>
                                            <p className="text-white text-opacity-7">Far far away, behind the word
                                                mountains,
                                                far from the countries Vokalia and Consonantia, there live the blind
                                                texts.</p>
                                        </div>
                                        <div className="food-menu mb-5">
                                            <span className="d-block text-primary h4 mb-3">$7.35</span>
                                            <h3 className="text-white"><Link to="#" className="text-white">Pancakes</Link>
                                            </h3>
                                            <p className="text-white text-opacity-7">Far far away, behind the word
                                                mountains,
                                                far from the countries Vokalia and Consonantia, there live the blind
                                                texts.</p>
                                        </div>
                                        <div className="food-menu mb-5">
                                            <span className="d-block text-primary h4 mb-3">$22.00</span>
                                            <h3 className="text-white"><Link to="#" className="text-white">Ice Cream
                                                Sundae</Link>
                                            </h3>
                                            <p className="text-white text-opacity-7">Far far away, behind the word
                                                mountains,
                                                far from the countries Vokalia and Consonantia, there live the blind
                                                texts.</p>
                                        </div>
                                    </div>
                                </div>
                            </div>


                            <div className="tab-pane fade text-left" id="drinks" role="tabpanel"
                                 aria-labelledby="drinks-tab">
                                <div className="row">
                                    <div className="col-md-6">
                                        <div className="food-menu mb-5">
                                            <span className="d-block text-primary h4 mb-3">$32.00</span>
                                            <h3 className="text-white"><Link to="#" className="text-white">Spring
                                                Water</Link></h3>
                                            <p className="text-white text-opacity-7">Far far away, behind the word
                                                mountains,
                                                far from the countries Vokalia and Consonantia, there live the blind
                                                texts.</p>
                                        </div>
                                        <div className="food-menu mb-5">
                                            <span className="d-block text-primary h4 mb-3">$14.00</span>
                                            <h3 className="text-white"><Link to="#" className="text-white">Coke, Diet
                                                Coke, Coke
                                                Zero</Link></h3>
                                            <p className="text-white text-opacity-7">Far far away, behind the word
                                                mountains,
                                                far from the countries Vokalia and Consonantia, there live the blind
                                                texts.</p>
                                        </div>
                                        <div className="food-menu mb-5">
                                            <span className="d-block text-primary h4 mb-3">$93.00</span>
                                            <h3 className="text-white"><Link to="#" className="text-white">Orange
                                                Fanta</Link></h3>
                                            <p className="text-white text-opacity-7">Far far away, behind the word
                                                mountains,
                                                far from the countries Vokalia and Consonantia, there live the blind
                                                texts.</p>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="food-menu mb-5">
                                            <span class="d-block text-primary h4 mb-3">$18.00</span>
                                            <h3 class="text-white"><Link to="#" class="text-white">Lemonade, Lemon
                                                Squash</Link>
                                            </h3>
                                            <p class="text-white text-opacity-7">Far far away, behind the word
                                                mountains, far
                                                from the countries Vokalia and Consonantia, there live the blind
                                                texts.</p>
                                        </div>
                                        <div class="food-menu mb-5">
                                            <span class="d-block text-primary h4 mb-3">$38.35</span>
                                            <h3 class="text-white"><Link to="#" class="text-white">Sparkling Mineral
                                                Water</Link>
                                            </h3>
                                            <p class="text-white text-opacity-7">Far far away, behind the word
                                                mountains, far
                                                from the countries Vokalia and Consonantia, there live the blind
                                                texts.</p>
                                        </div>
                                        <div class="food-menu mb-5">
                                            <span class="d-block text-primary h4 mb-3">$69.00</span>
                                            <h3 class="text-white"><Link to="#" class="text-white">Lemon,
                                                Lime &amp; Bitters</Link>
                                            </h3>
                                            <p class="text-white text-opacity-7">Far far away, behind the word
                                                mountains, far
                                                from the countries Vokalia and Consonantia, there live the blind
                                                texts.</p>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </section>




            <section class="section blog-post-entry bg-light">
                <div class="container">
                    <div class="row justify-content-center text-center mb-5">
                        <div class="col-md-7">
                            <h2 class="heading" data-aos="fade-up">Sự kiện</h2>
                            <p data-aos="fade-up">Far far away, behind the word mountains, far from the countries
                                Vokalia and
                                Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at
                                the
                                coast of the Semantics, a large language ocean.</p>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-4 col-md-6 col-sm-6 col-12 post" data-aos="fade-up" data-aos-delay="100">

                            <div class="media media-custom d-block mb-4 h-100">
                                <Link to="#" class="mb-4 d-block"><img src="images/img_1.jpg" alt="Image placeholder"
                                                                      class="img-fluid"/></Link>
                                <div class="media-body">
                                    <span class="meta-post">February 26, 2018</span>
                                    <h2 class="mt-0 mb-3"><Link to="#">Travel Hacks to Make Your Flight More
                                        Comfortable</Link></h2>
                                    <p>Far far away, behind the word mountains, far from the countries Vokalia and
                                        Consonantia,
                                        there live the blind texts.</p>
                                </div>
                            </div>

                        </div>
                        <div class="col-lg-4 col-md-6 col-sm-6 col-12 post" data-aos="fade-up" data-aos-delay="200">
                            <div class="media media-custom d-block mb-4 h-100">
                                <Link to="#" class="mb-4 d-block"><img src="images/img_2.jpg" alt="Image placeholder"
                                                                      class="img-fluid"/></Link>
                                <div class="media-body">
                                    <span class="meta-post">February 26, 2018</span>
                                    <h2 class="mt-0 mb-3"><Link to="#">5 Job Types That Aallow You To Earn As You Travel
                                        The
                                        World</Link></h2>
                                    <p>Separated they live in Bookmarksgrove right at the coast of the Semantics, a
                                        large
                                        language ocean.</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4 col-md-6 col-sm-6 col-12 post" data-aos="fade-up" data-aos-delay="300">
                            <div class="media media-custom d-block mb-4 h-100">
                                <Link to="#" class="mb-4 d-block"><img src="images/img_3.jpg" alt="Image placeholder"
                                                                      class="img-fluid"/></Link>
                                <div class="media-body">
                                    <span class="meta-post">February 26, 2018</span>
                                    <h2 class="mt-0 mb-3"><Link to="#">30 Great Ideas On Gifts For Travelers</Link></h2>
                                    <p>A small river named Duden flows by their place and supplies it with the necessary
                                        regelialia. t is a paradisematic country, in which roasted parts of
                                        sentences.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>

            <section class="section bg-image overlay"
                     style={{backgroundImage: "url('https://cf.bstatic.com/xdata/images/hotel/max1280x900/37836676.jpg?k=6e5197f999e346e00edd20fe9de55d145f8f8ba7acf290921f4b1def1bbf6f93&o=&hp=1');"}}>
                <div class="container">
                    <div class="row align-items-center">
                        <div class="col-12 col-md-6 text-center mb-4 mb-md-0 text-md-left" data-aos="fade-up">
                            <h2 class="text-white font-weight-bold">Lựa chọn tốt nhất để trải nghiệm!</h2>
                        </div>
                        <div class="col-12 col-md-6 text-center text-md-right" data-aos="fade-up" data-aos-delay="200">
                            <Link to="reservation.html" class="btn btn-outline-white-primary py-3 text-white px-5">Đặt
                                ngay</Link>
                        </div>
                    </div>
                </div>
            </section>
        </>
)
}
export default Content;