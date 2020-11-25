package main

import "fmt"

var c, java, python bool

//k := 3 cannot use := simplification at package level

func swap(x, y string) (string, string) { // type of returned variables can be written in bracket
	return y, x
}
func splint(sum int) (x, y int) {
	x = sum * 4 / 9 // all the decimals are thrown away for int
	y = sum - x
	return // simplified return by stating which variables to return at the beginning
}
func main() {
	a, b := swap("hello", "world") // simplified variable declaration
	fmt.Println(a, b)
	fmt.Println(splint(17))

	var i int
	fmt.Println(i, c, python, java) // default value of variables with no initializer
}
