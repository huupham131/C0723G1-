import { Link } from 'react-router-dom';
import {NavLink } from "react-router-dom";
function Room(){
    return(
        <section className="section">
            <div className="container">

                <div className="row">
                    <div className="col-md-6 col-lg-4 mb-5" data-aos="fade-up">
                        <Link to="#" className="room">
                            <figure className="img-wrap">
                                <img src="https://furamavietnam.com/wp-content/uploads/2018/03/Vietnam_Danang_Furama_Ocean-Suite-Feature-370x239.jpg" alt="Free website template" className="img-fluid mb-3"/>
                            </figure>
                            <div className="p-3 text-center room-info">
                                <h4>PHÒNG SUITE HƯỚNG BIỂN</h4><br></br>
                                <Link className="btn btn-primary text-white" to="/editRoom">Sừa</Link>
                                <button className="btn btn-danger text-white" data-bs-toggle="modal" data-bs-target="#exampleModal">Xoá</button>
                            </div>
                        </Link>
                    </div>

                    <div className="col-md-6 col-lg-4 mb-5" data-aos="fade-up">
                        <Link to="#" className="room">
                            <figure className="img-wrap">
                                <img src="https://furamavietnam.com/wp-content/uploads/2018/03/Vietnam_Danang_Furama_Ocean-Studio-Suite-F-370x239.jpg" alt="Free website template" className="img-fluid mb-3"/>
                            </figure>
                            <div className="p-3 text-center room-info">
                                <h4>PHÒNG STUDIO SUITE HƯỚNG BIỂN</h4>
                                <Link className="btn btn-primary text-white" to="editRoom.html">Sừa</Link>
                                <button className="btn btn-danger text-white" data-bs-toggle="modal" data-bs-target="#exampleModal">Xoá</button>
                            </div>
                        </Link>
                    </div>

                    <div className="col-md-6 col-lg-4 mb-5" data-aos="fade-up">
                        <Link to="#" className="room">
                            <figure className="img-wrap">
                                <img src="https://furamavietnam.com/wp-content/uploads/2018/03/Furama_Ocean_Deluxe-2-370x239.jpg" alt="Free website template" className="img-fluid mb-3"/>
                            </figure>
                            <div className="p-3 text-center room-info">
                                <h4>PHÒNG DELUXE HƯỚNG BIỂN</h4>
                                <Link className="btn btn-primary text-white" to="editRoom.html">Sừa</Link>
                                <button className="btn btn-danger text-white" data-bs-toggle="modal" data-bs-target="#exampleModal">Xoá</button>
                            </div>
                        </Link>
                    </div>

                    <div className="col-md-6 col-lg-4 mb-5" data-aos="fade-up">
                        <Link to="#" className="room">
                            <figure className="img-wrap">
                                <img src="https://furamavietnam.com/wp-content/uploads/2018/03/Vietnam_Danang_Furama_Lagoon-Superior-twin-bed-F-370x239.jpg" alt="Free website template" className="img-fluid mb-3"/>
                            </figure>
                            <div className="p-3 text-center room-info">
                                <h3>PHÒNG SUPERIOR HƯỚNG HỒ</h3>
                                <Link className="btn btn-primary text-white" to="editRoom.html">Sừa</Link>
                                <button className="btn btn-danger text-white" data-bs-toggle="modal" data-bs-target="#exampleModal">Xoá</button>
                            </div>
                        </Link>
                    </div>

                    <div className="col-md-6 col-lg-4 mb-5" data-aos="fade-up">
                        <Link to="#" className="room">
                            <figure className="img-wrap">
                                <img src="https://furamavietnam.com/wp-content/uploads/2018/03/Vietnam_Danang_Furama_Garden-Superior-TwinBed-1-F-370x239.jpg" alt="Free website template" className="img-fluid mb-3"/>
                            </figure>
                            <div className="p-3 text-center room-info">
                                <h3>PHÒNG SUPERIOR HƯỚNG VƯỜN</h3>
                                <Link className="btn btn-primary text-white" to="editRoom.html">Sừa</Link>
                                <button className="btn btn-danger text-white" data-bs-toggle="modal" data-bs-target="#exampleModal">Xoá</button>
                            </div>
                        </Link>
                    </div>

                    <div class="col-md-6 col-lg-4 mb-5" data-aos="fade-up">
                        <Link to="#" class="room">
                            <figure class="img-wrap">
                                <img src="https://furamavietnam.com/wp-content/uploads/2018/03/Furama_Garden-Deluxe-5-370x239.jpg" alt="Free website template" class="img-fluid mb-3"/>
                            </figure>
                            <div class="p-3 text-center room-info">
                                <h3>PHÒNG DELUXE HƯỚNG VƯỜN</h3>
                                <Link class="btn btn-primary text-white" to="editRoom.html">Sừa</Link>
                                <button class="btn btn-danger text-white" data-bs-toggle="modal" data-bs-target="#exampleModal">Xoá</button>
                            </div>
                        </Link>
                    </div>

                </div>
            </div>
        </section>
    )
}
export default Room;