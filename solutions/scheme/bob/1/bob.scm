(import (rnrs))

(define (response-for message)
  (define trimmed (string-trim-both message))

  (cond
    ((string=? trimmed "") "Fine. Be that way!")
    ((and (yell? trimmed) (question? trimmed)) "Calm down, I know what I'm doing!")
    ((yell? trimmed) "Whoa, chill out!")
    ((question? trimmed) "Sure.")
    (else "Whatever.")))


(define (yell? message)
  (and (string=? (string-upcase message) message)
    (not (string=? (string-downcase message) message))))

(define (question? message)
  (string-suffix? "?" message))
