import React, {useState} from "react";
import {Field, Form, Formik} from "formik";

const REGEX = {
    email: /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,
    phone: /^[0-9]{10}$/,
};
const ContractForm = () => {
    // const [form, setForm] = useState({})
    const [error, setErrors] = useState({})
    // const handleChange = (event) => {
    //     const {name, value} = event.target;
    //     setForm((prevForm) => ({
    //         ...prevForm,
    //         [name]: value,
    //     }))
    // };

    const handleValidate = (values) => {
        const newErrors = {};

        if (!values.name) {
            newErrors.name = 'Name Required';
        }

        if (!values.email) {
            newErrors.email = 'Email Required';
        } else if (!REGEX.email.test(values.email)) {
            newErrors.email = 'Invalid email address';
        }

        if (!values.phone) {
            newErrors.phone = 'Phone Required';
        } else if (!REGEX.phone.test(values.phone)) {
            newErrors.phone = 'Invalid phone number';
        }
        if (!values.message) {
            newErrors.message = 'Message Required';
        }
        setErrors(newErrors);
        return newErrors;
    };

    const handleSubmit = (value) => {
        console.log(value)
        alert('Contact added successfully!');
    };

    return (
        <div>
            <Formik
                initialValues={{
                    name: '',
                    email: '',
                    phone: '',
                    message: ''
                }}
                validate={handleValidate}
                onSubmit={handleSubmit}
            >
                {({
                      values,
                      errors: formikErrors,
                      handleChange: formikHandleChange,
                      handleSubmit: formikHandleSubmit,
                  }) => (
                    <Form onSubmit={formikHandleSubmit}>
                        <div>
                            <label>Name:</label>
                            <Field
                                type="text"
                                name="name"
                            />
                            {formikErrors.name && <div>{formikErrors.name}</div>}
                        </div>
                        <div>
                            <label>Email:</label>
                            <Field
                                type="text"
                                name="email"

                                onChange={(e) => {
                                    // handleChange(e);
                                    formikHandleChange(e);
                                }}
                            />
                            {formikErrors.email && <div>{formikErrors.email}</div>}
                        </div>
                        <div>
                            <label>Phone:</label>
                            <Field
                                type="text"
                                name="phone"

                                onChange={(e) => {
                                    // handleChange(e);
                                    formikHandleChange(e);
                                }}
                            />
                            {formikErrors.phone && <div>{formikErrors.phone}</div>}
                        </div>
                        <div>
                            <label>Message:</label>
                            <Field
                                as ="textarea"
                                name="message"
                                onChange={(e) => {
                                    // handleChange(e);
                                    formikHandleChange(e);
                                }}/>
                            {formikErrors.message && <div>{formikErrors.message}</div>}
                        </div>
                        <button type="submit">Submit</button>
                    </Form>
                )}
            </Formik>
        </div>
    );
};

export default ContractForm;