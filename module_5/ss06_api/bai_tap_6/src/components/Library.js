import {useState} from "react";

export default function Library() {
    const [books, setBooks] = useState([])

    return (
        <>
        <h1>Library</h1>
        <button>Add a new book</button>
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
                                <button>Edit</button>
                                <button>Delete</button>
                            </td>
                        </tr>
            ))
            }
        </tbody>
        </table>
</>
)
}