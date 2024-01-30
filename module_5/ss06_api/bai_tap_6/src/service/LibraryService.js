import axios from "axios";

export const getAll = async () => {
    try {
        const response = await axios.get("http://localhost:8080/library");
        return response.data;
    } catch (e) {
        console.log(e)
    }
}
export const createBook = async (book) => {
    try {
        const response = await axios.post("http://localhost:8080/library",book);
        return true;
    } catch (e) {
        console.log(e)
    }
}
export const editBooks = async (book) => {
    try {
        const response = await axios.put(`http://localhost:8080/library/${book.id}`,book);
        return true;
    }catch (e) {
        console.log(e)
    }
}
export const getBooks = async (id) => {
    try {
        const response = await axios.get(`http://localhost:8080/library/${id}`);
        return response.data;
    }catch (e) {
        console.log(e)
    }
}
export const deleteBooks = async (id) => {
    try {
         await axios.delete(`http://localhost:8080/library/${id}`);
        return true;
    }catch (e) {
        console.log(e)
    }
}