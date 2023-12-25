import {Link} from "react-router-dom";

function Heading(){
    return(
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

    )
}
export default Heading;