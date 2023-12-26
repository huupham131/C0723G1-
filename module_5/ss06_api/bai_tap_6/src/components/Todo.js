import {useEffect, useState} from "react";
import {getAll} from "../service/TodoService";
import {Field} from "formik"
import * as toDoAppService from "../service/TodoService";

export default function Todo({data}) {
const [tasks, setTasks] = useState([])
    useEffect(() => {
       getAll().then((res)=>{
           setTasks(res)
       })
    },[])
    async function createTask(values) {
        let result = await toDoAppService.addTodo(values);
        if (result) {
            await getAll();
            alert("Task added")
            setTasks(await getAll());
        } else {
            console.error("error creating task")
        }
    }
    return (

        <div>
            <h1>Todo List</h1>
            <Field type="text" name="task"/>
            <button>Submit</button>
            <ul>{
                tasks.map((item,index) => (
                    <li key={item.id}>
                        {item.task}
                    </li>
                ))
            }
            </ul>
        </div>

    )
}