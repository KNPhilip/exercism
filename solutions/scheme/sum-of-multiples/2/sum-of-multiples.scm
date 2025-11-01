(import (rnrs))

(define (sum-of-multiples ints limit)
  (let ((xs (filter positive? ints)))
    (if (not (nil? xs))
      (apply + (filter
          (lambda (x) (exists (lambda (y) (= 0 (mod x y))) xs))
          (iota limit)))
      0
    )))
