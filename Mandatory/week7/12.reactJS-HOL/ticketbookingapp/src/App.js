import { useState } from "react";

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);

  let content;
  if (isLoggedIn) {
    content = (
      <div>
        <h1>Welcome back</h1>
        <button onClick={handleLogout}>Logout</button>
      </div>
    );
  } else {
    content = (
      <div>
        <h1>Please sign up.</h1>
        <button onClick={handleLogin}>Login</button>
      </div>
    );
  }

  return <div>{content}</div>;
}

export default App;
