interface UserInterface {
  username: string;
  password: string;
  firstName: string;
  lastName: string;
  role: string;
}

export class User implements UserInterface {
  username: string;
  password: string;
  firstName: string;
  lastName: string;
  role: string;
  // static username: string;
  // static password: string;
  // static firstName: string;
  // static lastName: string;
  // static role: string;

  constructor(username: string, password: string, firstName: string, lastName: string, role: string) {
    this.username = username;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.role = role;
  }
}
