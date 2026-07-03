#!/usr/bin/env bash

function main() {
    str_len="${#1}"
    for (( i=str_len-1; i>=0; i-- )); do
        reverse+="${1:${i}:1}"
    done
    echo "$reverse"
}


main "$@"