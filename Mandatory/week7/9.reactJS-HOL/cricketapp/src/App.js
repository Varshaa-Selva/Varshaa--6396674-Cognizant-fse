

const players = [
  { name: "Sachin", score: 100 },
  { name: "Dhoni", score: 85 },
  { name: "Virat", score: 65 },
  { name: "Rohit", score: 90 },
  { name: "Jadeja", score: 55 },
  { name: "Raina", score: 72 },
  { name: "Kohli", score: 88 },
  { name: "Bumrah", score: 60 },
  { name: "Shami", score: 45 },
  { name: "Hardik", score: 77 },
  { name: "Pant", score: 68 },
];


const ListOfPlayers = ({ players }) => {
  
  const allList = players.map((p, i) => (
    <li key={i}>
      Mr. {p.name} {p.score}
    </li>
  ));

  
  const filtered = players
    .filter((p) => p.score < 70)
    .map((p, i) => (
      <li key={i}>
        Mr. {p.name} {p.score}
      </li>
    ));

  return (
    <div>
      <h2>List of Players</h2>
      <ul>{allList}</ul>

      <hr />

      <h2>List of Players having Scores Less than 70</h2>
      <ul>{filtered}</ul>
    </div>
  );
};


const IndianPlayers = () => {
  
  const oddTeam = ["Sachin1", "Virat3", "Yuvaraj5"];
  const evenTeam = ["Dhoni2", "Rohit4", "Raina6"];


  const [firstOdd, thirdOdd, fifthOdd] = oddTeam; 
  const [secondEven, fourthEven, sixthEven] = evenTeam;


  const T20players = ["Mr. First Player", "Mr. Second Player", "Mr. Third Player"];
  const RanjiTrophy = ["Mr. Fourth Player", "Mr. Fifth Player", "Mr. Sixth Player"];

  
  const merged = [...T20players, ...RanjiTrophy];

  return (
    <div>
      <h2>Odd Players</h2>
      <ul>
        {firstOdd && <li>First : {firstOdd}</li>}
        {thirdOdd && <li>Third : {thirdOdd}</li>}
        {fifthOdd && <li>Fifth : {fifthOdd}</li>}
      </ul>

      <h2>Even Players</h2>
      <ul>
        {secondEven && <li>Second : {secondEven}</li>}
        {fourthEven && <li>Fourth : {fourthEven}</li>}
        {sixthEven && <li>Sixth : {sixthEven}</li>}
      </ul>

      <h2>List of Indian Players Merged:</h2>
      <ul>
        {merged.map((p, idx) => (
          <li key={idx}>{p}</li>
        ))}
      </ul>
    </div>
  );
};

function App() {
  
  const flag = false; // set false to show IndianPlayers instead

  return (
    <div style={{ padding: "1rem", fontFamily: "Segoe UI, Arial, sans-serif" }}>
      {flag ? (
        <ListOfPlayers players={players} />
      ) : (
        <IndianPlayers />
      )}
    </div>
  );
}

export default App;
