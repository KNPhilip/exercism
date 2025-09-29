(import (rnrs))

(define (square n)
  (assert (< 0 n 65))
  
  (if (>= n 2) 
    (* 2 (square (- n 1)))
    n))

(define total
  (- (* 2 (square 64)) 1))
