class PrimeCalculator {

    int isPrime(int number)
    {
        if(number <2) return 0;
        if(number ==2) return 1;

        if(number %2==0) return 0;

        for (int index = 3; index * index <= number; index +=2) {
            if(number % index ==0) return 0;

        }
        return 1;
    }

    int nth(int nth) {
        if(nth==0){
            throw new IllegalArgumentException();
        }
        int prime_number =2;

        while(nth>0)
        {
            if(isPrime(prime_number)==1)
                nth--;

            prime_number++;
        }
        prime_number = prime_number -1;

        return prime_number;
    }

}
