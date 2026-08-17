#include "grains.h"
#include <stdio.h>

#define SQUARES 64

uint64_t square(uint8_t index)
{
    uint64_t square = 0;
    
    if(index > 0 || index <= 64){
        index--;
        square = 1ull;
        
        while (index > 0){
            square *= 2;
            index--;
        }
    }

    return square;
}

uint64_t total(void){
    uint64_t total = 0;
    uint8_t squares = SQUARES;
    
    while (squares) {
        total += square(squares);
        squares--;
    }
    return total;
}