import axios from "axios";

export const getAll = async ()=> {
    try {
            const response = await axios.get("http://localhost:8080/tasks");
            return response.data;
        } catch (error) {
        console.log(error);
    }
}

export const addTodo = async (title) => {
    try {
        const response = await axios.post("http://localhost:8080/tasks", {title});
        return true;
    } catch (error) {
        console.log(error);
    }
}