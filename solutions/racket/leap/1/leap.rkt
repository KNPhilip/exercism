#lang racket

(provide leap-year?)

(define (no-rem? n1 n2)
  (= (modulo n1 n2) 0))

(define (leap-year? year)
  (cond [(no-rem? year 400) #t]
        [(no-rem? year 100) #f]
        [(no-rem? year 4) #t]
        [else #f]))
