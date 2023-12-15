// 10. Tạo một đối tượng "book" với thuộc tính "title", "author" và "pages" bằng cách
// sử dụng Enhanced object literals. Đối tượng "book" cũng có phương thức "displayInfo" để
// in ra thông tin về sách.
const book ={
    title: "Anh em xã hội",
    author: "Anh Long",
    pages : 50,
    displayInfo(){
        console.log(`title: ${this.title}, author: ${this.author}, page: ${this.pages}`)
    }
}
book.displayInfo()

