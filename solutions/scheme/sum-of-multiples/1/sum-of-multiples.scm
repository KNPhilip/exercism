(import (rnrs))

(define (multiples n mn limit)
  (if (>= mn limit) '() (cons mn (multiples n (+ mn n) limit))))

(define (merge xs ys)
  (cond ((null? xs) ys)
        ((null? ys) xs)
        ((< (car xs) (car ys)) (cons (car xs) (merge (cdr xs) ys)))
        ((> (car xs) (car ys)) (cons (car ys) (merge xs (cdr ys))))
        (else (cons (car xs) (merge (cdr xs) (cdr ys))))))

(define (sum-of-multiples ints limit)
  (let ((ms (map (lambda (n) (if (zero? n) '() (multiples n n limit)))
                 ints)))
    (fold-left + 0 (fold-left merge '() ms))))
