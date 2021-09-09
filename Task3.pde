//Task 3

color red = color(255,0,0);
color yellow = color(255,255,0);
color green = color(0,255,0);
color grey = color(80,80,80);
color top = grey;
color mid = grey;
color bot = grey;

int active = 1;

void setup(){

size(500,600);
}



void draw(){
background(0);
stroke(100,100,0);
fill(255);
rect(100,80,200,400);



fill(top);
circle(200, 150, 100);


fill(mid);
circle(200, 275, 100);


fill(bot);
circle(200, 400, 100);
setColor();

}

void setColor(){
switch(active){
  case 1:
     delay(1000);
    top = red; mid = grey; bot = grey; active = 2; break;
  case 2:
     delay(1000); 
     top = red; mid = yellow; bot = grey; active=3;break;
  case 3:
    delay(1000);
    top = grey; mid = grey; bot = green; active = 4;break;
  case 4:
    delay(1000);
    top = grey; mid = yellow; bot = grey; active = 5;break;
  case 5:
    delay(1000);
    top = red; mid = grey; bot = grey; active = 2;break;
}

}
