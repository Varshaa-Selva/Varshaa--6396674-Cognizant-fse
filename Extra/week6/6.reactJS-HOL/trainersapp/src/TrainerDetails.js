import { Link, useParams } from "react-router-dom";
import { trainers } from "./TrainersMock";

const TrainerDetails = () => {
  const { id } = useParams();
  const trainerId = parseInt(id, 10);
  const trainer = trainers.find((t) => t.TrainerId === trainerId);

  if (!trainer) {
    return (
      <div>
        <h2>Trainer not found</h2>
        <p>Invalid ID: {id}</p>
        <Link to="/trainers">Back to Trainers</Link>
      </div>
    );
  }

  return (
    <div>
      <h2>Trainers Details</h2>
      <h3>{trainer.Name} ({trainer.Technology})</h3>
      <p>{trainer.Email}</p>
      <p>{trainer.Phone}</p>
      <ul>
        {trainer.Skills.map((s, i) => (
          <li key={i}>{s}</li>
        ))}
      </ul>
      <Link to="/trainers">Back to List</Link>
    </div>
  );
};

export default TrainerDetails;
