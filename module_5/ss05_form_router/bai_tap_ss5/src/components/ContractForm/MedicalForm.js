import React, {useState} from 'react';
import {Formik} from 'formik';

const SEX_LIST = [
    {label: 'Nam', value: 'male'},
    {label: 'Nữ', value: 'female'},
];
const REGEX = {
    email: /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,
    phone: /^[0-9]{10}$/,
};
const MedicalForm = () => {
    const [form, setForm] = useState({});
    const [errors, setErrors] = useState({});

    const handleChange = (event) => {
        const value = event.target.type === 'checkbox' ? event.target.checked : event.target.value;
        setForm((prevForm) => ({
            ...prevForm,
            [event.target.name]: value,
        }));
    };

    const handleValidate = (values) => {
        const newErrors = {};

        if (!values.name) {
            newErrors.name = 'Yêu cầu nhập';
        }
        if (!values.cmnd) {
            newErrors.cmnd = 'Yêu cầu nhập';
        }
        if (!values.birthday) {
            newErrors.birthday = 'Yêu cầu nhập';
        } else if (!values.birthday < 1900) {
            newErrors.birthday = 'Năm sinh không hợp lệ';
        }

        if (!values.sex) {
            newErrors.sex = 'Yêu cầu nhập';
        }
        if (!values.nationality) {
            newErrors.nationality = 'Yêu cầu nhập';
        }
        if (!values.province) {
            newErrors.province = 'Yêu cầu nhập';
        }
        if (!values.city) {
            newErrors.city = 'Yêu cầu nhập';
        }
        if (!values.district) {
            newErrors.district = 'Yêu cầu nhập';
        }
        if (!values.wards) {
            newErrors.wards = 'Yêu cầu nhập';
        }
        if (!values.address) {
            newErrors.address = 'Yêu cầu nhập';
        }
        if (!values.phone) {
            newErrors.phone = 'Yêu cầu nhập';
        }
        if (!values.email) {
            newErrors.email = 'Yêu cầu nhập';
        } else if (!REGEX.email.test(values.email)) {
            newErrors.email = 'Email không hợp lệ';
        }
        setErrors(newErrors);
        return newErrors;
    };

    const handleSubmit = () => {
        console.log('submit')
        alert('Nhập thành công!');
    };

    return (
        <div>
            <Formik
                initialValues={form}
                validate={handleValidate}
                onSubmit={handleSubmit}
            >
                {({
                      values,
                      errors: formikErrors,
                      handleChange: formikHandleChange,
                      handleSubmit: formikHandleSubmit,
                  }) => (

                    <form onSubmit={formikHandleSubmit}>
                        <h1>Tờ Khai Y Tế</h1>
                        <div>
                            <label> Họ tên:</label>
                            <input
                                type="text"
                                name="name"
                                value={values.name || ''}
                                onChange={(e) => {
                                    handleChange(e);
                                    formikHandleChange(e);
                                }}
                            />
                            {formikErrors.name && <small>{formikErrors.name}</small>}
                        </div>
                        <div>
                            <lable>Số hộ chiếu/CMND:</lable>
                            <br/>
                            <input
                                type="text"
                                name="cmnd"
                                value={values.cmnd || ''}
                                onChange={(e) => {
                                    handleChange(e);
                                    formikHandleChange(e);
                                }}
                            />
                            {formikErrors.cmnd && <small>{formikErrors.cmnd}</small>}
                        </div>

                        <div>
                            <label>Giới tính:</label>
                            {SEX_LIST.map((option) => (
                                <label key={option.value}>
                                    <input
                                        type="radio"
                                        name="sex"
                                        value={option.value}
                                        checked={values.sex === option.value}
                                        onChange={(e) => {
                                            handleChange(e);
                                            formikHandleChange(e);
                                        }}
                                    />
                                    {option.label}
                                </label>
                            ))}
                            {formikErrors.sex && <small>{formikErrors.sex}</small>}
                        </div>
                        <div>
                            <lable>Quốc tịch:</lable>
                            <br/>
                            <input
                                type="text"
                                name="nationality"
                                value={values.nationality || ''}
                                onChange={(e) => {
                                    handleChange(e);
                                    formikHandleChange(e);
                                }}
                            />
                            {formikErrors.nationality && <small>{formikErrors.nationality}</small>}
                        </div>
                        <div>
                            <lable>Công ty làm việc:</lable>
                            <br/>
                            <input
                                type="text"
                                name="company"
                                value={values.company || ''}
                                onChange={(e) => {
                                    handleChange(e);
                                    formikHandleChange(e);
                                }}
                            />
                        </div>
                        <div>
                            <lable>Bộ phận làm việc:</lable>
                            <br/>
                            <input
                                type="text"
                                name="department"
                                value={values.department || ''}
                                onChange={(e) => {
                                    handleChange(e);
                                    formikHandleChange(e);
                                }}
                            />
                        </div>
                        <div>
                            <lable>Có thẻ bảo hiểm y tế:</lable>
                            <input
                                type="checkbox"
                                name="insurance"
                                value={values.insurance || ''}
                                onChange={(e) => {
                                    handleChange(e);
                                    formikHandleChange(e);
                                }}
                            />
                        </div>
                        <h2>Địa chỉ liên lạc tại Việt Nam</h2>
                        <div>
                            <lable>Tỉnh thành:</lable>
                            <br/>
                            <input
                                type="text"
                                name="province"
                                value={values.province || ''}
                                onChange={(e) => {
                                    handleChange(e);
                                    formikHandleChange(e);
                                }}
                            />
                            {formikErrors.province && <small>{formikErrors.province}</small>}
                        </div>
                        <div>
                            <lable>Quận/huyện:</lable>
                            <br/>
                            <input
                                type="text"
                                name="district"
                                value={values.district || ''}
                                onChange={(e) => {
                                    handleChange(e);
                                    formikHandleChange(e);
                                }}
                            />
                            {formikErrors.district && <small>{formikErrors.district}</small>}
                        </div>
                        <div>
                            <lable>Phường/xã:</lable>
                            <br/>
                            <input
                                type="text"
                                name="wards"
                                value={values.wards || ''}
                                onChange={(e) => {
                                    handleChange(e);
                                    formikHandleChange(e);
                                }}
                            />
                            {formikErrors.wards && <small>{formikErrors.wards}</small>}
                        </div>
                        <div>
                            <lable>Số nhà, phố:</lable>
                            <br/>
                            <input
                                type="text"
                                name="address"
                                value={values.address || ''}
                                onChange={(e) => {
                                    handleChange(e);
                                    formikHandleChange(e);
                                }}
                            />
                            {formikErrors.address && <small>{formikErrors.address}</small>}
                        </div>
                        <div>
                            <lable>Điện thoại:</lable>
                            <br/>
                            <input
                                type="text"
                                name="phone"
                                value={values.phone || ''}
                                onChange={(e) => {
                                    handleChange(e);
                                    formikHandleChange(e);
                                }}
                            />
                            {formikErrors.phone && <small>{formikErrors.phone}</small>}
                        </div>
                        <div>
                            <lable> Email:</lable>
                            <br/>
                            <input
                                type="text"
                                name="email"
                                value={values.email || ''}
                                onChange={(e) => {
                                    handleChange(e);
                                    formikHandleChange(e);
                                }}
                            />
                            {formikErrors.email && <small>{formikErrors.email}</small>}
                        </div>
                        <h2>Trong 14 ngày qua, Anh/Chị có đến quốc gia/vùng</h2><h2> lãnh thổ nào(Có thể đi qua nhiều
                        quốc gia</h2>
                        <textarea
                            name="visitCountries"
                            value={values.visitCountries || ''}
                            onChange={(e) => {
                                handleChange(e);
                                formikHandleChange(e);
                            }}/>
                        <div>
                            <div>
                                <h2>Trong 14 ngày qua, Anh/Chị có triệu chứng nào sau đây</h2>
                                <label>
                                    <input
                                        type="checkbox"
                                        name="symptoms"
                                        value="Ho"
                                        checked={values.symptoms && values.symptoms.includes('Ho')}
                                        onChange={handleChange}
                                    />
                                    Ho
                                </label>
                                <label>
                                    <input
                                        type="checkbox"
                                        name="symptoms"
                                        value="Sốt"
                                        checked={values.symptoms && values.symptoms.includes('Sốt')}
                                        onChange={handleChange}
                                    />
                                    Sốt
                                </label>
                                <label>
                                    <input
                                        type="checkbox"
                                        name="symptoms"
                                        value="Khó thở"
                                        checked={values.symptoms && values.symptoms.includes('Khó thở')}
                                        onChange={handleChange}
                                    />
                                    Khó thở
                                </label>
                                <label>
                                    <input
                                        type="checkbox"
                                        name="symptoms"
                                        value="Viêm họng"
                                        checked={values.symptoms && values.symptoms.includes('Viêm họng')}
                                        onChange={handleChange}
                                    />
                                    Viêm họng
                                </label>
                                <label>
                                    <input
                                        type="checkbox"
                                        name="symptoms"
                                        value="Mệt mỏi"
                                        checked={values.symptoms && values.symptoms.includes('Mệt mỏi')}
                                        onChange={handleChange}
                                    />
                                    Mệt mỏi
                                </label>
                            </div>
                            <div>
                                <h2>Trong 14 ngày qua, Anh/Chị có tiếp xúc với?</h2>
                                <label>
                                    <input
                                        type="checkbox"
                                        name="touch"
                                        value="Người bệnh hoặc nghi ngờ mắc covid"
                                        checked={values.touch && values.touch.includes('Người bệnh hoặc nghi ngờ mắc covid')}
                                        onChange={handleChange}
                                    />
                                    Người bệnh hoặc nghi ngờ mắc covid
                                </label>
                                <label>
                                    <input
                                        type="checkbox"
                                        name="touch"
                                        value="Người có biểu hiện ho sốt ..."
                                        checked={values.touch && values.touch.includes('Người có biểu hiện ho sốt ...')}
                                        onChange={handleChange}
                                    />
                                    Người có biểu hiện ho sốt ...
                                </label>
                                <label>
                                    <input
                                        type="checkbox"
                                        name="touch"
                                        value="Người từ nước có covid"
                                        checked={values.touch && values.touch.includes('Người từ nước có covid')}
                                        onChange={handleChange}
                                    />
                                    Người từ nước có covid
                                </label>
                            </div>
                            <button type="submit">Submit</button>
                        </div>
                    </form>
                    )}
            </Formik>
        </div>
);
};

export default MedicalForm;