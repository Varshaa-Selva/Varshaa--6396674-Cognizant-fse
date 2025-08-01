import { createRoot } from "react-dom/client";
import CountPeople from "./CountPeople";

const container = document.getElementById("root");
const root = createRoot(container);
root.render(<CountPeople />);
