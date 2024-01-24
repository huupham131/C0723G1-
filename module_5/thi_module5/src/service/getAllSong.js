import axios from "axios";

export default async function getAll() {
    const all = await axios.get("http://localhost:8080/song").then().catch((error) => {
        console.log(error)
    });
}