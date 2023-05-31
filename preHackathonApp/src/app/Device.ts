export class Device{
  id: number;
  name: string;
  powerUsage: number;
  image: string;

  constructor(id: number, name: string, powerUsage: number, image: string) {
    this.id = id;
    this.name = name;
    this.powerUsage = powerUsage;
    this.image = image;
  }
}
