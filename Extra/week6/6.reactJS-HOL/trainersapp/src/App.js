import { BrowserRouter, NavLink, Navigate, Route, Routes } from "react-router-dom";
import Home from "./Home";
import TrainerDetails from "./TrainerDetails";
import TrainersList from "./TrainersList";
import { trainers } from "./TrainersMock";

const App = () => (
  <BrowserRouter>
    <header style={{ padding: "1rem" }}>
      <h1>My Academy Trainers App</h1>
      <nav>
        <NavLink to="/home" style={({ isActive }) => ({ marginRight: 8, textDecoration: isActive ? "underline" : "none" })}>
          Home
        </NavLink>
        |
        <NavLink to="/trainers" style={({ isActive }) => ({ marginLeft: 8, textDecoration: isActive ? "underline" : "none" })}>
          Show Trainers
        </NavLink>
      </nav>
    </header>

    <main style={{ padding: "1rem" }}>
      <Routes>
        <Route path="/" element={<Navigate to="/home" replace />} />
        <Route path="/home" element={<Home />} />
        <Route path="/trainers" element={<TrainersList trainers={trainers} />} />
        <Route path="/trainer/:id" element={<TrainerDetails />} />
        <Route path="*" element={<Navigate to="/home" replace />} />
      </Routes>
    </main>
  </BrowserRouter>
);

export default App;
