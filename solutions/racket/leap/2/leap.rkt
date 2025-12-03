#lang racket

(provide leap-year?)

(define (divides? n divisor)
  (= (modulo n divisor) 0))

(define (leap-year? year)
  (cond [(divides? year 400) #t]
        [(divides? year 100) #f]
        [(divides? year 4) #t]
        [else #f]))
