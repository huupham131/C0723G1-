import Footer from "../Footer/Footer";
import Header from "../Header/Header";
import HeadingAddContract from "./HeadingAddContract";

export default function AddContract (){
    return(
        <>
            <Header/>
            <HeadingAddContract/>
            <section className="section" id="next">
                <div className="container rounded bg-white mt-5 mb-5">
                    <div className="row">
                        <div className="col-md-5 border-right">
                            <div className="d-flex flex-column align-items-center text-center p-3 py-5"><img className="rounded-circle mt-5"
                                                                                                         width="150px"
                                                                                                         src="https://t4.ftcdn.net/jpg/05/49/98/39/240_F_549983970_bRCkYfk0P6PP5fKbMhZMIb07mCJ6esXL.jpg"/><span
                                className="font-weight-bold">Phạm Thanh Hữu</span><span> </span></div>
                            <div className="col-md-12"><label className="labels">Chọn khách hàng</label>
                                <div className="field-icon-wrap">
                                    <div className="icon"><span className="ion-ios-arrow-down"></span></div>
                                    <select name="" id="" className="form-control">
                                        <option value="">A</option>

                                    </select>
                                </div>
                            </div>
                            <div className="col-md-12"><label className="labels">Chọn phòng</label>
                                <div className="field-icon-wrap">
                                    <div className="icon"><span className="ion-ios-arrow-down"></span></div>
                                    <select name="" id=" " className="form-control">
                                        <option value="">A</option>

                                    </select>
                                </div>
                            </div>
                        </div>

                        <div className="col-md-7 border-right">
                            <div className="p-3 py-5">
                                <div className="d-flex justify-content-between align-items-center mb-3">
                                    <h4 className="text-right">Thêm thông tin hợp đồng</h4>
                                </div>
                                <div className="row mt-2">
                                    <div className="col-md-12"><label className="labels"> Số hợp đồng</label>
                                        <input type="number"
                                               className="form-control"
                                               placeholder="Nhập số hợp đồng"
                                               value=""/></div>
                                </div>
                                <div className="row mt-3">
                                    <div className="col-md-12">
                                        <label className="labels">Ngày bắt đầu</label>
                                        <input type="date" className="form-control"/></div>
                                    <div className="col-md-12">
                                        <label className="labels">Ngày kết thúc</label>
                                        <input type="date" className="form-control"/></div>

                                    <div className="col-md-12">
                                        <label className="labels">Tiền cọc trước</label>
                                        <input type="text"
                                               className="form-control"
                                               placeholder="Nhập tiền cọc"
                                               value=""/>
                                    </div>
                                    <div className="col-md-12">
                                        <label className="labels">Tổng tiền thanh toán</label>
                                        <input type="text"
                                               className="form-control"
                                               placeholder="Nhập tổng tiền"
                                               value=""/>
                                    </div>
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