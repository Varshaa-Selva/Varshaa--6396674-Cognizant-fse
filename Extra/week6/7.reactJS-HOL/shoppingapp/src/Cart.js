import React from "react";

class Cart extends React.Component {
  render() {
    const { Itemname, Price } = this.props;
    return (
      <tr>
        <td>{Itemname}</td>
        <td>{Price}</td>
      </tr>
    );
  }
}

// Default props as fallback
Cart.defaultProps = {
  Itemname: "Unknown",
  Price: 0,
};

export default Cart;
