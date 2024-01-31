import request from "../http-common";
const findAll = ()=> {
    return request.get('/users')
}
const deleteUser = (user)=> {
    return request.delete(`/users/${user.id}`)
}
const UserService = {
    findAll,
    deleteUser
}
export default UserService