float r = random(0,6);
//Task 6a
int a = int(random(0,10));

float t = random(0,6);
int b = int (t);

println(+a+ " + " +b+ " = "+(a+b));

if((a+b) == 10 || a == 10 || b == 10) {
println("Success!");
}
else {
println("Failure!"); 
}

//Task 6b
int x = int(random(0,30));
int y = int(random(0,30));
int z = int(random(0,30));

println(+x+" + "+y+" + " +z);

if (x == 10 || x == 20 || x == 30 || y == 10 || y == 20 || y == 30 || z == 10 || z == 20 || z == 30) {
println("Failure!");
}
else if (x+y+z == 30) {
println("Success!"); 
}
else 
println("Failure!");
