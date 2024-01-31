const initialState = []
const userReducer =(users=initialState,action) =>{
const {type,payload} = action
    switch (type){
        case "getAll":
            return payload;
        case "deleteUser":
            return users.filter((user) => user.id !== payload.id);
        default:
            return users
    }
}
export default userReducer;