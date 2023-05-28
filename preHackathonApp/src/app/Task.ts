export class Task{
  id: number;
  desc: string;
  type: string;
  constructor(id: number, desc: string, type: string) {
    this.id = id;
    this.desc = desc;
    this.type = type;
  }
}
