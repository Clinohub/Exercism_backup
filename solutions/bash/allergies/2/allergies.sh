#!/usr/bin/env bash

if (( $1==0 )); then
    if [[ "$2" == 'list' ]]; then
        exit 0
    fi
    
    echo false
	exit 0
fi

if (( $1>255 )); then
	exp=1
	while (( $(( 2**exp ))<="$1" )); do
		if (( $(( 2**exp ))=="$1" )); then
			exit 0
		fi
		exp=$(( exp+1 ))
	done
fi

num="$(( $1%256 ))"
allergy_num_list=()
for (( exp=9; exp>=0; exp-- )); do
	i=$(( 2**exp ))
	if (( i<=num )); then
		allergy_num_list+=("$i")
		num="$(( num-i ))"
	fi
done	

if (( num!=0 )); then
	exit 0
fi

rearrange=()
j=$(( ${#allergy_num_list[@]}-1 ))
for (( i=0; i<"${#allergy_num_list[@]}"; i++,j-- )); do
	rearrange[i]="${allergy_num_list[j]}"
done

allergic_to=()
for value in "${rearrange[@]}"; do
	case "$value" in
		1) allergic_to+=("eggs");;
		2) allergic_to+=("peanuts");;
		4) allergic_to+=("shellfish");;
		8) allergic_to+=("strawberries");;
		16) allergic_to+=("tomatoes");;
		32) allergic_to+=("chocolate");;
		64) allergic_to+=("pollen");;
		128) allergic_to+=("cats");;		
		*) ;;
	esac
done

for item in "${allergic_to[@]}"; do
    if [[ "$2" != 'list' && "$item" == "$3" ]]; then
        echo true
        exit 0
    fi
done

if [[ "$2" == 'list' ]]; then
    echo "${allergic_to[@]}"
    exit 0
fi

echo false
exit 0