import Header from "../Header/Header";
import HeadingAddCustomer from "./HeadingAddCustomer";
import Footer from "../Footer/Footer";

export default function AddCustomer(){
    return(
        <>
        <Header/>
            <HeadingAddCustomer/>
        <section className="section" id="next">
            <div className="container rounded bg-white mt-5 mb-5">
                <div className="row">
                    <div className="col-md-5 border-right">
                        <div className="d-flex flex-column align-items-center text-center p-3 py-5"><img className="rounded-circle mt-5"
                                                                                                     width="150px"
                                                                                                     src="https://t4.ftcdn.net/jpg/05/49/98/39/240_F_549983970_bRCkYfk0P6PP5fKbMhZMIb07mCJ6esXL.jpg"/><span
                            className="font-weight-bold">Phạm Thanh Hữu</span><span> </span></div>
                    </div>
                    <div className="col-md-7 border-right">
                        <div className="p-3 py-5">
                            <div className="d-flex justify-content-between align-items-center mb-3">
                                <h4 className="text-right">Thêm thông tin khách hàng</h4>
                            </div>
                            <div className="row mt-2">
                                <div className="col-md-12"><label className="labels">Tên khách hàng</label>
                                    <input type="text"
                                           className="form-control"
                                           placeholder="họ tên"
                                           value=""/></div>
                            </div>
                            <div className="row mt-3">
                                <div className="col-md-6">
                                    <label className="labels">Ngày sinh</label>
                                    <input type="date" className="form-control"/></div>
                                <div className="col-md-6">
                                    <label className="labels">Giới tính</label><br/>
                                    <input style={{marginLeft: "5%"}} className="form-check-input" type="radio" name="flexRadioDefault"
                                           id="male"/>
                                        <label style={{marginLeft: "20%"}} className="form-check-label" htmlFor="male">
                                            Nam
                                        </label><br></br>
                                        <input style={{marginLeft: "5%"}} className="form-check-input" type="radio" name="flexRadioDefault"
                                               id="female"/>
                                            <label style={{marginLeft: "20%"}} className="form-check-label" htmlFor="female">
                                                Nữ
                                            </label>
                                </div>
                                <div className="col-md-12">
                                    <label className="labels">Căn cước công dân</label>
                                    <input type="text"
                                           className="form-control"
                                           placeholder="CCCD"
                                           value=""/>
                                </div>
                                <div className="col-md-12">
                                    <label className="labels">Số điện thoại</label>
                                    <input type="text"
                                           className="form-control"
                                           placeholder="số điện thoại"
                                           value=""/>
                                </div>
                                <div className="col-md-12">
                                    <label className="labels">Email</label>
                                    <input type="text"
                                           className="form-control"
                                           placeholder="email"
                                           value=""/></div>
                                <div className="col-md-12"><label className="labels">Loại khách</label>
                                    <div className="field-icon-wrap">
                                        <div className="icon"><span className="ion-ios-arrow-down"></span></div>
                                        <select name="" id="children" className="form-control">
                                            <option value="">Members</option>
                                            <option value="">Silver</option>
                                            <option value="">Gold</option>
                                            <option value="">Platinium</option>
                                            <option value="">Diamond</option>
                                        </select>
                                    </div>
                                </div>
                                <div className="col-md-12"><label className="labels">Địa chỉ</label><input type="text" className="form-control"
                                                                                                   placeholder="địa chỉ"
                                                                                                   value=""/></div>
                            </div>
                            <div class="mt-5 text-center">
                                <button class="btn btn-primary profile-button" type="button">Thêm mới</button>
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