import { useState } from "react";
import "./App.css";
import BlogDetails from "./BlogDetails";
import BookDetails from "./BookDetails";
import CourseDetails from "./CourseDetails";

function App() {
  const [view, setView] = useState("all");

  return (
    <div>
      {/* Buttons */}
      <div className="buttons">
        <button onClick={() => setView("all")}>Show All</button>
        <button onClick={() => setView("courses")}>Courses</button>
        <button onClick={() => setView("books")}>Books</button>
        <button onClick={() => setView("blogs")}>Blogs</button>
      </div>

      {/* Conditional Rendering */}
      <div className="main-container">
        {view === "all" && (
          <>
            <CourseDetails />
            <BookDetails />
            <BlogDetails />
          </>
        )}
        {view === "courses" && <CourseDetails />}
        {view === "books" && <BookDetails />}
        {view === "blogs" && <BlogDetails />}
      </div>
    </div>
  );
}

export default App;
