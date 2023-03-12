import React from "react";
import Book from "./Book";

function Library (props) {
  return (
    <div>
      <Book name="처음 만난 북극곰" numOfPag={300} />
      <Book name="처음 만난 betty" numOfPag={400} />
      <Book name="처음 만난 리액트" numOfPag={500} />
    </div>
  );
}

export default Library;