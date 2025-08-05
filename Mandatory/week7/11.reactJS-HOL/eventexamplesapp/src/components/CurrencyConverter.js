import { useState } from 'react';

const INR_TO_EURO_RATE = 0.011; // example rate: 1 INR = 0.011 EUR

function CurrencyConverter() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('Euro');
  const [result, setResult] = useState(null);

  const handleSubmit = (e) => {
    e.preventDefault(); // prevent page reload
    if (currency.toLowerCase() === 'euro') {
      const euro = parseFloat(amount) * INR_TO_EURO_RATE;
      setResult(`Converting to Euro Amount is ${euro.toFixed(2)}`);
      alert(`Converting to Euro Amount is ${euro.toFixed(2)}`);
    } else {
      setResult('Unsupported currency');
    }
  };

  return (
    <div style={{ padding: '20px' }}>
      <h1 style={{ color: 'green' }}>Currency Convertor!!!</h1>
      <form onSubmit={handleSubmit}>
        <div>
          <label>
            Amount:&nbsp;
            <input
              type="number"
              value={amount}
              onChange={(e) => setAmount(e.target.value)}
              required
            />
          </label>
        </div>
        <div>
          <label>
            Currency:&nbsp;
            <input
              type="text"
              value={currency}
              onChange={(e) => setCurrency(e.target.value)}
              required
            />
          </label>
        </div>
        <div style={{ marginTop: '8px' }}>
          <button type="submit">Submit</button>
        </div>
      </form>
      {result && <p>{result}</p>}
    </div>
  );
}

export default CurrencyConverter;
