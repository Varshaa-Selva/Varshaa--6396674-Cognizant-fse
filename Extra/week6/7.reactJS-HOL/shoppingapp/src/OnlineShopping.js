import React from "react";
import Cart from "./Cart";
import "./OnlineShopping.css"; // optional external styling

class OnlineShopping extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      carts: [
        { Itemname: "Laptop", Price: 80000 },
        { Itemname: "TV", Price: 120000 },
        { Itemname: "Washing Machine", Price: 50000 },
        { Itemname: "Mobile", Price: 30000 },
        { Itemname: "Fridge", Price: 70000 },
      ],
    };
  }

  render() {
    return (
      <div className="container">
        <h1 className="title">Items Ordered :</h1>
        <div className="table-wrapper">
          <table className="cart-table">
            <thead>
              <tr>
                <th>Name</th>
                <th>Price</th>
              </tr>
            </thead>
            <tbody>
              {this.state.carts.map((c, idx) => (
                <Cart key={idx} Itemname={c.Itemname} Price={c.Price} />
              ))}
            </tbody>
          </table>
        </div>
      </div>
    );
  }
}

export default OnlineShopping;
