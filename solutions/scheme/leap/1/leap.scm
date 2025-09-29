(import (rnrs))

(define (no-rem? a b)
  (= 0 (modulo a b)))

(define (leap-year? year)
  (if (or 
    (no-rem? year 400) ; Divisibles by 400 are leap years.
    (and 
      (not (no-rem? year 100)) ; Divisibles by 100 doesn't count.
      (no-rem? year 4))) ; Divisibles by 4 are leap years.
    #t #f))
