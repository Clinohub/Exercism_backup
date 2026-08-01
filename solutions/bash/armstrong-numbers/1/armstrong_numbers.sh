#!/usr/bin/env bash


function count_digits() {
    number="$1"
    until(( number == 0 )); do
        digits=$(( digits + 1 ))
        number=$(( number / 10 ))
    done
}

digits=0
length_from=0
sum=0

count_digits "$@"

n="$1"
while(( length_from < digits )); do
    placevalue=${n:length_from:1}
    sum=$(( placevalue ** digits + sum ))
    length_from=$(( length_from + 1 ))
done


if(( n == sum )); then
    echo true
else
    echo false
fi

exit 0