class RnaTranscription {

    String transcribe(String dnaStrand) {


        StringBuilder rnaComp = new StringBuilder();
        int i;
        for (i = 0; i < dnaStrand.length(); i++) {
            if (dnaStrand.charAt(i) == 'G') {
                rnaComp.append('C');
            }

            else if (dnaStrand.charAt(i) == 'C') {
                rnaComp.append('G');
            }

            else if (dnaStrand.charAt(i) == 'T') {
                rnaComp.append('A');
            }

            else if (dnaStrand.charAt(i) == 'A') {
                rnaComp.append('U');
            }
            else {
                throw new IllegalArgumentException("Invalid input");
            }
        }
        return rnaComp.toString();

    }

}
