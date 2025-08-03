const offices = [
  {
    name: "DBS",
    rent: 50000,
    address: "Chennai",
    image: "/images/image1.png", // direct path from public
  },
  {
    name: "Alpha Towers",
    rent: 75000,
    address: "Bengaluru",
    image: "/images/image2.png",
  },
  {
    name: "Zenith Hub",
    rent: 60000,
    address: "Hyderabad",
    image: "/images/image3.png",
  },
];

const rentStyle = (rent) => ({
  color: rent < 60000 ? "red" : "green",
  fontWeight: "bold",
});

function App() {
  return (
    <div style={{ padding: "1.5rem", fontFamily: "Segoe UI, Arial, sans-serif" }}>
      <h1 style={{ fontSize: "2.2rem" }}>Office Space , at Affordable Range</h1>

      {offices.map((office, idx) => (
        <div
          key={idx}
          style={{
            marginTop: "2rem",
            borderBottom: "1px solid #ccc",
            paddingBottom: "1rem",
            maxWidth: "500px",
          }}
        >
          <img
            src={office.image}
            alt={`Office ${office.name}`}
            style={{ width: "200px", height: "180px", objectFit: "cover" }}
          />

          <div style={{ marginTop: "0.5rem" }}>
            <h2 style={{ margin: "0.5rem 0" }}>Name: {office.name}</h2>
            <p style={{ margin: "4px 0" }}>
              Rent: <span style={rentStyle(office.rent)}>Rs. {office.rent}</span>
            </p>
            <p style={{ margin: "4px 0" }}>Address: {office.address}</p>
          </div>
        </div>
      ))}
    </div>
  );
}

export default App;
