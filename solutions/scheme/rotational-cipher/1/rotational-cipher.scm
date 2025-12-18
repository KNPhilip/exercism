(import (rnrs))

(define (rot c base dx)
  (integer->char
        (+ (modulo (+ dx (- (char->integer c) (char->integer base))) 26)
           (char->integer base))))
  
(define (rotate-char c dx)
  (cond ((char<=? #\A c #\Z) (rot c #\A dx))
        ((char<=? #\a c #\z) (rot c #\a dx))
        (else c)))

(define (rotate phrase dx)
  (let ((chars (string->list phrase)))
    (list->string 
      (map (lambda (c) 
        (rotate-char c dx)) chars))))
