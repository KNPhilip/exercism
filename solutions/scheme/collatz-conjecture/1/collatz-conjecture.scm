(import (rnrs))

(define (collatz n)
  (define (collatz n count)
    (if (= n 1) 
      count 
      (if (even? n) 
        (collatz (/ n 2) (+ count 1))
        (collatz (+ (* n 3) 1) (+ count 1))
      )))
  (collatz n 0))
