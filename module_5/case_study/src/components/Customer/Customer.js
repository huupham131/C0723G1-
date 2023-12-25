
import Header from "../Header/Header";
import HeadingCustomer from "./HeadingCustomer";
import {Link} from "react-router-dom";
import Footer from "../Footer/Footer";

export default function Customer(){
    return(
            <>
                <Header/>
                <HeadingCustomer/>
                <section className="section">
                    <div className="container">
                        <div className="row">
                            <div className="col-xl-12">
                                <div className="card">
                                    <div className="card-body">
                                        <h3 className="header-title pb-3 mt-0 text-center " data-aos="fade-up"
                                            style={{fontFamily: "Playfair Display,serif"}}>DANH
                                            SÁCH KHÁCH HÀNG</h3>
                                        <div className="table-responsive" data-aos="fade-up">
                                            <Link className="btn btn-outline-white-primary" to={"/addCustomer"}>Thêm khách hàng</Link>
                                            <table className="table table-hover mb-0">
                                                <thead>
                                                <tr className="align-self-center">
                                                    <th>STT</th>
                                                    <th>Tên khách hàng</th>
                                                    <th>Địa chỉ</th>
                                                    <th>Email</th>
                                                    <th>Số điện thoại</th>
                                                    <th>Xem thêm</th>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                <tr>
                                                    <td>1</td>
                                                    <td> Hữu
                                                    </td>
                                                    <td>Quảng Ngãi</td>
                                                    <td>pthuucv@gmail.com</td>
                                                    <td>0989895744</td>
                                                    <td className="text-center">
                                                        <div className="dropdown">
                                                            <Link data-bs-toggle="dropdown" to="#" className="btn p-1" aria-expanded="false">
                                                                <i className="fa fa-bars" aria-hidden="true"></i>
                                                            </Link>
                                                            <div className="dropdown-menu dropdown-menu-end">
                                                                <Link to={"/editCustomer"} className="dropdown-item">Chỉnh sửa thông
                                                                    tin</Link>
                                                                <button type="button" className="dropdown-item" data-bs-toggle="modal"
                                                                   data-bs-target="#exampleModal">Xoá khách hàng</button>
                                                            </div>
                                                        </div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>1</td>
                                                    <td> Hữu
                                                    </td>
                                                    <td>Quảng Ngãi</td>
                                                    <td>pthuucv@gmail.com</td>
                                                    <td>0989895744</td>
                                                    <td className="text-center">
                                                        <div className="dropdown">
                                                            <Link data-bs-toggle="dropdown" to="#" className="btn p-1" aria-expanded="false">
                                                                <i className="fa fa-bars" aria-hidden="true"></i>
                                                            </Link>
                                                            <div className="dropdown-menu dropdown-menu-end">
                                                                <Link to={"/editCustomer"} className="dropdown-item">Chỉnh sửa thông
                                                                    tin</Link>
                                                                <button type="button" className="dropdown-item" data-bs-toggle="modal"
                                                                        data-bs-target="#exampleModal">Xoá khách hàng</button>
                                                            </div>
                                                        </div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>1</td>
                                                    <td> Hữu
                                                    </td>
                                                    <td>Quảng Ngãi</td>
                                                    <td>pthuucv@gmail.com</td>
                                                    <td>0989895744</td>
                                                    <td className="text-center">
                                                        <div className="dropdown">
                                                            <Link data-bs-toggle="dropdown" to="#" className="btn p-1" aria-expanded="false">
                                                                <i className="fa fa-bars" aria-hidden="true"></i>
                                                            </Link>
                                                            <div className="dropdown-menu dropdown-menu-end" >
                                                                <Link to={"/editCustomer"} className="dropdown-item">Chỉnh sửa thông
                                                                    tin</Link>
                                                                <button type="button" className="dropdown-item" data-bs-toggle="modal"
                                                                        data-bs-target="#exampleModal">Xoá khách hàng</button>
                                                            </div>
                                                        </div>
                                                    </td>
                                                </tr>
                                                </tbody>
                                            </table>
                                        </div>

                                        <div className="pt-3 border-top text-right" data-aos="fade-up">
                                            <ul className="pagination justify-content-center mb-0">
                                                <li className="page-item disabled"><span className="page-link">Trước</span></li>
                                                <li className="page-item active" aria-current="page"><span class="page-link">1 </span> <span
                                                    className="sr-only">(current)</span></li>
                                                <li className="page-item"><Link className="page-link" to="#">2</Link></li>
                                                <li className="page-item"><Link className="page-link" to="#">3</Link></li>
                                                <li className="page-item"><Link className="page-link" to="#">...</Link></li>
                                                <li className="page-item"><Link className="page-link" to="#">25</Link></li>
                                                <li className="page-item"><Link className="page-link" to="#">Sau</Link></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
                <Footer/>
            </>
    )
}