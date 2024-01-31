import {useDispatch, useSelector} from "react-redux";
import {useEffect} from "react";
import {getAllUsers} from "../redux/action/user";
import UserService from "../service/UserService";

export function UserList(){
    const users = useSelector(state =>state.users)
    const dispatch = useDispatch();


    function handleGetUser() {
        dispatch(getAllUsers())
    }

     function handleDelete(user) {
        console.log(user)
         dispatch(UserService.deleteUser(user))
        alert("response status 200")
    }

    return(
        <>
            <h1>UserList</h1>
            <button onClick={handleGetUser}>Get users</button>
            <table>
                <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Website</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody>
                {
                    users.map((user) =>(
                        <tr key={user.id}>
                            <td>{user.id}</td>
                            <td>{user.name}</td>
                            <td>{user.email}</td>
                            <td>{user.website}</td>
                            <td><button onClick={()=>handleDelete(user)}>Delete user</button></td>
                        </tr>
                    ))
                }
                </tbody>
            </table>
        </>
    )
}