Die [] dice;

void setup() {
  size(1200, 600);
  dice = new Die [4];
  for (int i = 0; i < dice.length; i++) 
    dice[i] = new Die (color((int)random(0, 256)), color((int)random(0, 256)));
}

void draw() {
  background(0, 255, 0);
  for (int i = 0; i < dice.length; i++) {
    int x = 75;
    int y = 75;
    int distX = 150;
    dice[i].drawDie(x+distX*i, y);
  }
}
