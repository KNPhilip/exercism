(import (rnrs))

(define (get-base c)
  (if (char-upper-case? c) 
      (char->integer #\A) 
      (char->integer #\a)))

(define (rotate-char c shift)
  (let ((base (get-base c)))
    (if (char-alphabetic? c)
      (integer->char (+ base (modulo (+ (- (char->integer c) base) shift) 26))) 
      c)))

(define (rotate phrase shift)
  (let* ((chars (string->list phrase)))
    (list->string
     (map (lambda (c)
            (rotate-char c shift))
          chars))))
