import React, {useState} from "react";
import {Formik} from "formik";

const REGEX = {
    email: /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,
    phone: /^[0-9]{10}$/,
};
const ContractForm = ()=>{
    const [form, setForm]= useState({})
    const [error, setErrors] = useState({})
    const handleChange = (event) => {
        const { name, value } = event.target;
        setForm((prevForm)=>({
            form : prevForm,
            [name]: value,
        }))
    };

    const handleValidate = (values) => {
        const newErrors = {};

        if (!values.name) {
            newErrors.name = 'Name Required';
        }

        if (!values.email) {
            newErrors.email = 'Required';
        } else if (!REGEX.email.test(values.email)) {
            newErrors.email = 'Invalid email address';
        }

        if (!values.phone) {
            newErrors.phone = 'Required';
        }else if (!REGEX.phone.test(values.phone)) {
            newErrors.phone = 'Invalid phone number';
        }
        if (!values.message){
            newErrors.message = 'Required';
        }
        setErrors(newErrors);
        return newErrors;
    };

    const handleSubmit = () => {
        alert('Contact added successfully!');
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
                        <div>
                            <label>Name:</label>
                            <input
                                type="text"
                                name="name"
                                value={values.name || ''}
                                onChange={(e) => {
                                    handleChange(e);
                                    formikHandleChange(e);
                                }}
                            />
                            {formikErrors.name && <div>{formikErrors.name}</div>}
                        </div>
                        <div>
                            <label>Email:</label>
                            <input
                                type="text"
                                name="email"
                                value={values.email || ''}
                                onChange={(e) => {
                                    handleChange(e);
                                    formikHandleChange(e);
                                }}
                            />
                            {formikErrors.email && <div>{formikErrors.email}</div>}
                        </div>
                        <div>
                            <label>Phone:</label>
                            <input
                                type="text"
                                name="phone"
                                value={values.phone || ''}
                                onChange={(e) => {
                                    handleChange(e);
                                    formikHandleChange(e);
                                }}
                            />
                            {formikErrors.phone && <div>{formikErrors.phone}</div>}
                        </div>
                        <div>
                            <label>Message:</label>
                            <textarea
                                name="message"
                                value={values.message || ''}
                                onChange={(e) => {
                                    handleChange(e);
                                    formikHandleChange(e);
                                }}/>
                            {formikErrors.message && <div>{formikErrors.message}</div>}
                        </div>
                        <button type="submit">Submit</button>
                    </form>
                )}
            </Formik>
        </div>
    );
};

export default ContractForm;