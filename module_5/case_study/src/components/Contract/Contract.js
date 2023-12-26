import {Link} from "react-router-dom";
import Header from "../Header/Header";
import Footer from "../Footer/Footer";
import HeadingCustomer from "../Customer/HeadingCustomer";

export default function Contract(){
    return(
        <>
        <Header/>
        <HeadingCustomer/>
        <section className="section" id="next">
            <div className="container">
                <div className="row">
                    <div className="col-xl-12">
                        <div className="card">
                            <div className="card-body">
                                <h3 className="header-title pb-3 mt-0 text-center " data-aos="fade-up" style="font-family: Playfair Display,serif">DANH
                                    SÁCH HỢP ĐỒNG</h3>
                                <div className="table-responsive" data-aos="fade-up">
                                    <Link className="btn btn-outline-white-primary" to={"/addContract"}>Tạo hợp đồng</Link>
                                    <table className="table table-hover mb-0">
                                        <thead>
                                        <tr className="align-self-center">
                                            <th>Số hợp đồng</th>
                                            <th>Ngày bắt đầu</th>
                                            <th>Ngày kết thúc</th>
                                            <th>Số tiền cọc trước</th>
                                            <th>Tổng tiền thanh toán</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td>1</td>
                                            <td>20/11/2023</td>
                                            <td>25/11/2023</td>
                                            <td>2.000.000</td>
                                            <td>6.000.000</td>
                                        </tr>
                                        <tr>
                                            <td>1</td>
                                            <td>20/11/2023</td>
                                            <td>25/11/2023</td>
                                            <td>2.000.000</td>
                                            <td>6.000.000</td>
                                        </tr>
                                        <tr>
                                            <td>1</td>
                                            <td>20/11/2023</td>
                                            <td>25/11/2023</td>
                                            <td>2.000.000</td>
                                            <td>6.000.000</td>
                                        </tr>


                                        </tbody>
                                    </table>
                                </div>

                                <div className="pt-3 border-top text-right" data-aos="fade-up">
                                    <ul className="pagination justify-content-center mb-0">
                                        <li className="page-item disabled"><span class="page-link">Trước</span></li>
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