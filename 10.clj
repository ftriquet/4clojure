;(= __ ((hash-map :a 10, :b 20, :c 30) :b))
;(= __ (:b {:a 10, :b 20, :c 30}))

(def answer 20)
(= answer ((hash-map :a 10, :b 20, :c 30) :b))
(= answer (:b {:a 10, :b 20, :c 30}))
