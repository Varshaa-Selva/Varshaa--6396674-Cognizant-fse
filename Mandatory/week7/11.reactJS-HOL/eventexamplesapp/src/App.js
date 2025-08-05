import { useState } from 'react';
import CurrencyConverter from './components/CurrencyConverter';

function App() {
  const [count, setCount] = useState(0);

  // multiple actions: increment + say hello
  const incrementAndGreet = () => {
    setCount((c) => c + 1);
    sayHello();
  };

  const decrement = () => {
    setCount((c) => c - 1);
  };

  const sayHello = () => {
    console.log('Hello! Counter updated.');
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleSyntheticPress = (event) => {
    // synthetic event; you can inspect event properties
    console.log('Synthetic event object:', event);
    alert('I was clicked');
  };

  return (
    <div style={{ padding: '20px' }}>
      <div>
        <div>Counter: {count}</div>
        <button onClick={incrementAndGreet}>Increment</button>
        <button onClick={decrement}>Decrement</button>
        <button onClick={() => sayWelcome('Welcome')}>Say welcome</button>
        <button onClick={handleSyntheticPress}>Click on me</button>
      </div>

      <hr />

      <CurrencyConverter />
    </div>
  );
}

export default App;
