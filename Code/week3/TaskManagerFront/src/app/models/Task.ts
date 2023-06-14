interface TaskInterface {
  description: string;
  status: string;
  assignedTo: number;
  assigned: Object;

}

export class Task implements TaskInterface {
  description: string;
  status: string;
  assignedTo: number;
  assigned: Object;

  constructor(description: string, status: string, assignedTo: number, assigned: Object) {
    this.description = description;
    this.status = status;
    this.assignedTo = assignedTo;
    this.assigned = assigned;
  }
}
