import { useState } from 'react';
import './App.css';

function LoginButton(props) {
  return <button onClick={props.onClick}>Login</button>;
}

function LogoutButton(props) {
  return <button onClick={props.onClick}>Logout</button>;
}

function GuestGreeting() {
  return <h2>Welcome, Guest! Browse flights below.</h2>;
}

function UserGreeting() {
  return <h2>Welcome back! You can book your flight.</h2>;
}

function Greeting({ isLoggedIn }) {
  return isLoggedIn ? <UserGreeting /> : <GuestGreeting />;
}

function FlightDetails({ isLoggedIn }) {
  const handleBook = () => {
    if (!isLoggedIn) {
      alert('You must be logged in to book tickets.');
    } else {
      alert('Booking confirmed!'); // placeholder for actual booking flow
    }
  };

  return (
    <div style={{ border: '1px solid #ccc', padding: '16px', marginTop: '16px' }}>
      <h3>Flight: NY to London</h3>
      <p>Departure: 10 Aug 2025, 09:00 AM</p>
      <p>Arrival: 10 Aug 2025, 09:00 PM</p>
      <p>Price: $850</p>
      <button onClick={handleBook}>Book Ticket</button>
    </div>
  );
}

function App() {
  const [isLoggedIn, setLoggedIn] = useState(false);

  const handleLogin = () => setLoggedIn(true);
  const handleLogout = () => setLoggedIn(false);

  return (
    <div style={{ padding: '30px', fontFamily: 'Arial, sans-serif' }}>
      <h1>Flight Ticket Booking</h1>

      {/* Conditional login/logout button */}
      {isLoggedIn ? (
        <LogoutButton onClick={handleLogout} />
      ) : (
        <LoginButton onClick={handleLogin} />
      )}

      {/* Greeting changes based on login state */}
      <Greeting isLoggedIn={isLoggedIn} />

      {/* Flight listing always visible; booking depends on login */}
      <FlightDetails isLoggedIn={isLoggedIn} />
    </div>
  );
}

export default App;
