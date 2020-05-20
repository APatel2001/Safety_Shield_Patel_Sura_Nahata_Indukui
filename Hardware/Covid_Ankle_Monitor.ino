int const trigPin = 6;
int const echoPin = 5;
int const buzzPin = 13;

void setup()
{
pinMode(trigPin, OUTPUT); // trig pin will have pulses output
pinMode(echoPin, INPUT); // echo pin should be input to get pulse width
pinMode(buzzPin, OUTPUT); // buzz pin is output to control buzzer
}

void loop() 
{
int width, distance; // Width is the input pulse width and distance will be the distance to the obstacle in centimeters
// Output pulse with 1ms width on trigPin
digitalWrite(trigPin, HIGH);
delay(1);
digitalWrite(trigPin, LOW);
width = pulseIn(echoPin, HIGH); // The width for the pulse input from the ultrasonic sensor
distance = (duration/2) / 29.1; // Defining the distance variable from ultrasonic sensor's datasheet
if (distance <= 10 && distance >= 0) { // if the distance less than 0.05 meters and more than 0 meters
digitalWrite(buzzPin, HIGH); // Will buzz
} 
else {
digitalWrite(buzzPin, LOW); // Doesn't buzz
}
}
