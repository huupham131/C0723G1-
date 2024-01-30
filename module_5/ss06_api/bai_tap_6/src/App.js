
import './App.css';
import Todo from "./components/Todo";
import {Route, Routes} from "react-router-dom";
import Library from "./components/library/Library";
import CreateBook from "./components/library/CreateBook";
import {EditBook} from "./components/library/EditBook";

function App() {
  return (
   <Routes>
       <Route path='/todo' element={<Todo/>}></Route>
       <Route path='/library' element={<Library/>}></Route>
       <Route path='/library/create' element={<CreateBook/>}></Route>
       <Route path='/library/edit/:id' element={<EditBook/>}></Route>
   </Routes>
  );
}

export default App;
