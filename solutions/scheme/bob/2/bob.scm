(import (rnrs))

(define (response-for message)
  (let* ((trimmed (string-trim-both message))
         (is-yelling? (yell? trimmed))
         (is-question? (question? trimmed)))
    (cond
      ((string=? trimmed "") "Fine. Be that way!")
      ((and is-yelling? is-question?) "Calm down, I know what I'm doing!")
      (is-yelling? "Whoa, chill out!")
      (is-question? "Sure.")
      (else "Whatever."))))


(define (yell? message)
  (and (string=? (string-upcase message) message)
    (not (string=? (string-downcase message) message))))

(define (question? message)
  (string-suffix? "?" message))
