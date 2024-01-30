import {Field, Form, Formik} from "formik";
import {createBook} from "../../service/LibraryService";
import {Link, useNavigate} from "react-router-dom";

export default function CreateBook() {
    const navigate = useNavigate()
    const createNewBook = async (book) => {
        let result = await createBook(book);
        if (result) {
            alert("Book added");
            navigate("/library")
        } else {
            console.error("error creating book");
        }
    }
    return (
        <>
            <Link to={'/library'}>Back</Link>
            <Formik
                initialValues={
                    {
                        title: '',
                        quantity: ''
                    }
                } onSubmit={createNewBook}
            >
                <Form>
                    <h1>Create new book</h1>
                    <label htmlFor='title'>Book title</label>
                    <Field name="title" id='title' type="text"/><br/>
                    <label>Quantity</label>
                    <Field name="quantity" id='quantity' type="text"/><br/>
                    <button>Submit</button>
                </Form>
            </Formik>
        </>
    )
}