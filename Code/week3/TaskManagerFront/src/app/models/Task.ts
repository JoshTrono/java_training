interface TaskInterface {
  description: string;
  status: string;
  assigned_to: string;
}

export class Task implements TaskInterface {
  description: string;
  status: string;
  assigned_to: string;

  constructor(description: string, status: string, assigned_to: string) {
    this.description = description;
    this.status = status;
    this.assigned_to = assigned_to;
  }
}
