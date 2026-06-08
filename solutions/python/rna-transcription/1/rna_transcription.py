def to_rna(dna_strand):
    rna_strand = ""

    for seq in dna_strand:
        if seq == 'G':
            rna_strand += 'C'

        if seq == 'C':
            rna_strand += 'G'

        if seq == 'T':
            rna_strand += 'A'

        if seq == 'A':
            rna_strand += 'U'
    
    return rna_strand
            
        
