import { useNavigate, useParams } from "react-router-dom";
import { editBooks, getBooks } from "../../service/LibraryService";
import { Field, Form, Formik } from "formik";
import { useEffect, useState } from "react";

export function EditBook() {
    const navigate = useNavigate();
    const params = useParams();
    const id = params.id;
    const [book, setBook] = useState();

    useEffect(() => {
        getBook(id)
    }, [id]);

    const getBook = async (id) => {
        let fetchedBook = await getBooks(id);
        if (fetchedBook) {
            setBook(fetchedBook);
        } else {
            console.error("Book not found");
        }
    };
    const edit = async (book) => {
        let result = await editBooks(book);
        if (result) {
            alert("Book edited");
            navigate("/library");
        } else {
            console.error("error editing book");
        }
    };
    if(!book) {
        return null;
    }

    return (
        <>
            <h1>Edit Book</h1>
            <Formik
                initialValues={{
                    id: book.id,
                    title: book.title,
                    quantity: book.quantity
                }
                }
                onSubmit={edit}
                enableReinitialize
            >
                <Form>
                    <label>Book title</label>
                    <Field name="title" />
                    <label>Book quantity</label>
                    <Field name="quantity" />
                    <button type="submit">Submit</button>
                </Form>
            </Formik>
        </>
    );
}
