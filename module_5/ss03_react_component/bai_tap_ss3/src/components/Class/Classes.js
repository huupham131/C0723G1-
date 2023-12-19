import {useState} from "react";

const listStudent = [
    {
        id: 1,
        name: 'Hữu',
        age: 23,
        address: 'Quảng Ngãi'
    },
    {
        id: 2,
        name: 'Tuong',
        age: 23,
        address: 'Quảng Trị'
    },
    {
        id: 3,
        name: 'Hieu',
        age: 23,
        address: 'Huế'
    }
]
const StudentInfo = ({id, name, age, address}) => {
    const [data, setData] = useState(listStudent);
    return (
        <>
            <h1>Student List</h1>
            <table>
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Address</th>
                </tr>
                </thead>
                <tbody>
                {listStudent.map((student) => (
                    <tr key={student.id}>
                        <td>{student.id}</td>
                        <td>{student.name}</td>
                        <td>{student.age}</td>
                        <td>{student.address}</td>
                    </tr>
                ))}

                </tbody>
            </table>
        </>
    )
}

export default StudentInfo