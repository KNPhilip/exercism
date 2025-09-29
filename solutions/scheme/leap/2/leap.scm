(import (rnrs))

(define (no-rem? a b)
  (= 0 (modulo a b)))

(define (leap-year? year)
  (cond ((no-rem? year 400) #t) ; Divisibles by 400 are leap years.
        ((no-rem? year 100) #f) ; Divisibles by 100 doesn't count.
        ((no-rem? year 4)   #t) ; Divisibles by 4 are leap years.
        (else #f)))
