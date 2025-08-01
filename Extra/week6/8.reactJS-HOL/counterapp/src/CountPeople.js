import React from "react";

class CountPeople extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      entrycount: 0,
      exitcount: 0,
    };

    // bind if not using arrow methods
    this.updateEntry = this.updateEntry.bind(this);
    this.updateExit = this.updateExit.bind(this);
  }

  updateEntry() {
    this.setState((prev) => ({ entrycount: prev.entrycount + 1 }));
  }

  updateExit() {
    this.setState((prev) => {
      // optional: prevent exitcount exceeding entrycount
      const maxExit = prev.entrycount - prev.exitcount;
      if (maxExit <= 0) return null; // no change
      return { exitcount: prev.exitcount + 1 };
    });
  }

  render() {
    const { entrycount, exitcount } = this.state;
    return (
      <div style={{
        display: "flex",
        justifyContent: "space-around",
        alignItems: "center",
        padding: "2rem",
        fontFamily: "Arial, sans-serif"
      }}>
        <div style={{ textAlign: "center" }}>
          <button
            onClick={this.updateEntry}
            style={{
              backgroundColor: "#d1ffd1",
              border: "1px solid green",
              padding: "10px 20px",
              cursor: "pointer",
              fontWeight: "bold",
              borderRadius: "4px"
            }}
          >
            Login
          </button>
          <div style={{ marginTop: "8px", fontSize: "18px" }}>
            <span style={{ color: "black" }}>
              {entrycount} {entrycount === 1 ? "Person Entered!!!" : "People Entered!!!"}
            </span>
          </div>
        </div>

        <div style={{ textAlign: "center" }}>
          <button
            onClick={this.updateExit}
            style={{
              backgroundColor: "#ffe6e6",
              border: "1px solid red",
              padding: "10px 20px",
              cursor: "pointer",
              fontWeight: "bold",
              borderRadius: "4px"
            }}
          >
            Exit
          </button>
          <div style={{ marginTop: "8px", fontSize: "18px" }}>
            <span style={{ color: "black" }}>
              {exitcount} {exitcount === 1 ? "Person Left!!!" : "People Left!!!"}
            </span>
          </div>
        </div>
      </div>
    );
  }
}

export default CountPeople;
