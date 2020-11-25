package main

import (
	"fmt"
	"math"
) //import multiple packages

func add(x int, y int) int { //specify the type of output after function
	return x + y
}
func main() {
	fmt.Println(add(1, 5))                              //every Println has \n after all the text and variables as default
	fmt.Println("My pie has", math.Pi, "(sugar level)") //value from imported library must begin with capital letter
	fmt.Println(math.Sqrt(3))                           //function from library begins with capital letter.
}
