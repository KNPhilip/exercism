#lang racket

(provide two-fer)

(define (two-fer [name #f])
  (if name
      (string-append "One for " name ", one for me.")
      "One for you, one for me."))
