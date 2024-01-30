import {useEffect, useState} from "react";
import {deleteBooks, getAll, getBooks} from "../../service/LibraryService";
import {Link} from "react-router-dom";
import 'bootstrap/dist/css/bootstrap.min.css';
import { Modal, Button } from 'react-bootstrap';

export default function Library() {
    const [books, setBooks] = useState([]);
    const [showModal, setShowModal] = useState(false);
    const [selectedBook, setSelectedBook] = useState(null);
    useEffect(() => {
        getAll().then(books => {
            setBooks(books)
        })
    }, []);
    const handleDelete = (book) => {
        setSelectedBook(book)
        setShowModal(true);
    }
    const handleConfirmDelete = async () => {
        if (selectedBook) {
            await deleteBooks(selectedBook.id);
            const updatedBooks = await getAll();
            setBooks(updatedBooks);
            setShowModal(false);
            setSelectedBook(null);
        }
    }
    return (
        <>
            <h1>Library</h1>
            <button>
                <Link to='/library/create'>
                    Add a new book</Link>
            </button>
            <table>
                <thead>
                <tr>
                    <th>Title</th>
                    <th>Quantity</th>
                    <th>Actions</th>
                </tr>
                </thead>
                <tbody>
                {
                    books.map(book => (
                        <tr key={book.id}>
                            <td>{book.title}</td>
                            <td>{book.quantity}</td>
                            <td>
                                <Link to={`/library/edit/${book.id}`}>
                                    <button>Edit</button>
                                </Link>
                                <button onClick={() => handleDelete(book)}>Delete</button>

                            </td>
                        </tr>
                    ))
                }
                </tbody>
            </table>
            <Modal show={showModal} onHide={() => setShowModal(false)}>
                <Modal.Header closeButton>
                    <Modal.Title>Delete</Modal.Title>
                </Modal.Header>
                <Modal.Body>
                    <p>Do you want to delete "{selectedBook?.title}"?</p>
                </Modal.Body>
                <Modal.Footer>
                    <Button variant="primary" onClick={handleConfirmDelete}>Delete</Button>
                    <Button variant="secondary" onClick={() => setShowModal(false)}>Close</Button>
                </Modal.Footer>
            </Modal>
        </>
    )
}