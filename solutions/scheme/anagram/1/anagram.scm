(import (rnrs))

(define (anagram target words)
  (filter (anagrams? target) words))

(define (anagrams? target)
  (lambda (word)
    (let ((lcase-target (string-downcase target))
          (lcase-word (string-downcase word)))
      (and
        (not (equal? lcase-word lcase-target))
        (equal? 
          (string-sort lcase-word) 
          (string-sort lcase-target)))
    )))

(define (string-sort str)
  (list->string (sort char-ci<? (string->list str))))
