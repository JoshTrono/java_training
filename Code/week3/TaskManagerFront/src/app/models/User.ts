interface UserInterface {
  username: string;
  password: string;
  email: string;
}

export class User implements UserInterface {
  username: string;
  password: string;
  email: string;
  // static username: string;
  // static password: string;
  // static firstName: string;
  // static lastName: string;
  // static role: string;

  constructor(username: string, password: string, email: string) {
    this.username = username;
    this.password = password;
    this.email = email;
  }
}
