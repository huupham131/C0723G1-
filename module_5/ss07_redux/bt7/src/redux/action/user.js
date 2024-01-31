import UserService from "../../service/UserService";
import 'axios'


export const getAllUsers = () => async(dispatch)=>
{
    try {
        const res = await UserService.findAll();
        dispatch({
            type:'getAll',
            payload: res.data
        })
    } catch (e) {
        console.log(e)
    }
}
export const deleteUser = (user) => async(dispatch)=>
{
    try {
        const res = await UserService.deleteUser(user);
        dispatch({
            type:'deleteUser',
            payload: user
        })
    } catch (e) {
        console.log(e)
    }
}