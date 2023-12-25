import Header from "../Header/Header";
import Footer from "../Footer/Footer";

function AddRoom(){
    return(
        <>
            <Header/>
        <section className="section contact-section" id="next">
            <div className="container">
                <div className="row">
                    <div className="col-md-12" data-aos="fade-up" data-aos-delay="100">

                        <form action="#" method="post" className="bg-white p-md-5 p-4 mb-5 border">
                            <div className="row">
                                <div className="col-md-6 form-group">
                                    <label className="text-black font-weight-bold" htmlFor="name">Tên phòng</label>
                                    <input type="text" id="name" className="form-control "/>
                                </div>
                                <div className="col-md-6 form-group">
                                    <label className="text-black font-weight-bold" htmlFor="phone">Diện tích</label>
                                    <input type="text" id="phone" className="form-control "/>
                                </div>
                            </div>

                            <div className="row">
                                <div className="col-md-6 form-group">
                                    <label className="text-black font-weight-bold" htmlFor="name">Giá</label>
                                    <input type="text" id="gia" className="form-control "/>
                                </div>
                                <div className="col-md-6 form-group">
                                    <label className="text-black font-weight-bold" htmlFor="img">Ảnh</label>
                                    <input type="text" id="img" className="form-control "/>
                                </div>
                            </div>


                            <div className="row">
                                <div className="col-md-6 form-group">
                                    <label htmlFor="adults" className="font-weight-bold text-black">Dịch vụ đi kèm</label>
                                    <div className="field-icon-wrap">
                                        <div className="icon"><span className="ion-ios-arrow-down"></span></div>
                                        <select name="" id="adults" className="form-control">
                                            <option value="">1</option>
                                            <option value="">2</option>
                                            <option value="">3</option>
                                            <option value="">4+</option>
                                        </select>
                                    </div>
                                </div>
                                <div className="col-md-6 form-group">
                                    <label htmlFor="children" className="font-weight-bold text-black">Loại phòng</label>
                                    <div className="field-icon-wrap">
                                        <div className="icon"><span className="ion-ios-arrow-down"></span></div>
                                        <select name="" id="children" className="form-control">
                                            <option value="">Vippro siêu cấp</option>
                                            <option value="">VVip</option>
                                            <option value="">Vip</option>
                                            <option value="">Nomal</option>
                                        </select>
                                    </div>
                                </div>
                            </div>



                            <div className="row mb-4">
                                <div className="col-md-12 form-group">
                                    <label className="text-black font-weight-bold" htmlFor="message">Mô tả</label>
                                    <textarea name="message" id="message" className="form-control " cols="30" rows="8"></textarea>
                                </div>
                            </div>
                            <div className="row">
                                <div className="col-md-6 form-group">
                                    <input type="submit" value="Chỉnh sửa" className="btn btn-primary text-white py-3 px-5 font-weight-bold"/>
                                </div>
                            </div>
                        </form>

                    </div>
                </div>
            </div>
        </section>
            <Footer/>
            </>
    )
}
export default AddRoom;