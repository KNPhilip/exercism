(import (rnrs))

(define (square n)
  (* n n))

(define (inc n)
  (+ n 1))

(define (square-of-sum n) 
  (square (/ (* n (inc n)) 2)))

(define (sum-of-squares n) 
  (/ (* n (inc n) (inc (* 2 n))) 6))

(define (difference-of-squares n)
  (- (square-of-sum n) (sum-of-squares n)))
