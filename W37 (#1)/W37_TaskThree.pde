int caseCounter = 1;

void setup(){
size(800,600);
background(0);

//Trafficlight #Shape
rectMode(CENTER);
rect(200,200,100,300);
}

void draw(){
  int circle = 75;
  color none = color(0);
  color red = color(255,0,0);
  color ylw = color(255,255,0);
  color green = color(0,255,0);
  
  
  ellipseMode(CENTER);
  
  switch(caseCounter){
  case 1:
  delay(1000);
  fill(red);
  ellipse(200,100,circle,circle);
  fill(none);
  ellipse(200,200,circle,circle);
  fill(none); 
  ellipse(200,300,circle,circle);
  caseCounter = 2;
  break;
  
  case 2:
  delay(1000);    
  fill(red);
  ellipse(200,100,circle,circle);
  fill(ylw);
  ellipse(200,200,circle,circle);
  fill(none); 
  ellipse(200,300,circle,circle);
  caseCounter = 3;
  break;
  
  case 3:
  delay(1000);    
  fill(none);
  ellipse(200,100,circle,circle);
  fill(none);
  ellipse(200,200,circle,circle);
  fill(green); 
  ellipse(200,300,circle,circle);
  caseCounter = 4;
  break;
  
    case 4:
  delay(1000);    
  fill(none);
  ellipse(200,100,circle,circle);
  fill(ylw);
  ellipse(200,200,circle,circle);
  fill(none); 
  ellipse(200,300,circle,circle);
  caseCounter = 5;
  break;

  case 5:
  delay(1000);    
  fill(red);
  ellipse(200,100,circle,circle);
  fill(ylw);
  ellipse(200,200,circle,circle);
  fill(none); 
  ellipse(200,300,circle,circle);
  caseCounter = 1;
  break;

}
}
