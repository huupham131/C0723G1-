import {useEffect, useState} from "react";
import {getAll} from "../service/TodoService";
import {Field, Formik} from "formik"
import * as toDoAppService from "../service/TodoService";

export default function Todo({data}) {
const [tasks, setTasks] = useState([])
    useEffect(() => {
        getAll().then((res) => {
            setTasks(res);
        });
    }, []);
    console.log(tasks)
    async function createTask(values) {
        let result = await toDoAppService.addTodo(values);
        if (result) {
            await getAll();
            alert("Task added");
            setTasks(await getAll());
        } else {
            console.error("error creating task");
        }
    }

    return (

        <div>
            <Formik
                initialValues={{
                    decription: ""
                }}
                onSubmit={createTask}
            >
                <form>
                <h1>Todo List</h1>
                <Field type="text" name="decription"/>
                <button>Submit</button>
                </form>
            </Formik>
                <ul>{
                    tasks.map((item,index) => (
                        <li key={item.id}>
                            {item.title}
                        </li>
                    ))
                }
                </ul>

        </div>

    )
}