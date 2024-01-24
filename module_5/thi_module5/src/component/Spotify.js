import React, {useEffect, useState} from "react";
import { Formik, Field, Form } from "formik";
import axios from "axios";
import '../component/spotify.css'
export default function Spotify() {
    const [data, setData] = useState([]);
    async function getAll() {
        try {
            const response = await axios.get("http://localhost:8080/song");
            setData(response.data);
            console.log(response.data);
        } catch (error) {
            console.log(error);
        }
    }

    useEffect(() => {
        getAll()
    }, []);

    return (
        <>
            <h1>Kho nhạc</h1>
            <div>
                <button >Phát nhạc</button>
                <Formik
                    initialValues={{ search: "" }}
                    onSubmit={(values) => console.log(values)}
                >
                    <Form>
                        <Field type="text" name="search" />
                        <button type="submit">Tìm kiếm</button>
                    </Form>
                </Formik>
            </div>
            <div>
                <table>
                    <tbody>
                    <tr>
                        <th>STT</th>
                        <th>Tên bài hát</th>
                        <th>Ca sĩ</th>
                        <th>Thời gian phát hành</th>
                        <th>Số lượt yêu thích</th>
                        <th>Trạng thái</th>
                        <th>Chức năng</th>
                    </tr>
                    {data.map((item) => (
                        <tr key={item.id}>
                            <td>{item.id}</td>
                            <td>{item.name}</td>
                            <td>{item.singer}</td>
                            <td>{item.timeRelease}</td>
                            <td>{item.like}</td>
                            <td>{item.status}</td>
                            <td>
                                <button>Công khai</button>
                            </td>
                        </tr>
                    ))}
                    </tbody>
                </table>
            </div>
        </>
    );
}