import {Field, Formik} from "formik";

export default function AddSong(){
    const create =()=>{};
    return(
        <>
            <Formik initialValues={this.initialValues} onSubmit={create}>
                <table>
                    <tbody>
                    <tr>
                        <td>Tên bài hát</td>
                        <td><Field></Field></td>
                    </tr>
                    </tbody>
                </table>
            </Formik>
        </>
    )
}