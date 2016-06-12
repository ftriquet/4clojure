;(= __ (set '(:a :a :b :c :c :c :c :d :d)))
;(= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))

(def answer #{:a :b :c})
(= answer (set '(:a :a :b :c :c :c :c :d :d)))
(= answer (clojure.set/union #{:a :b :c} #{:b :c :d}))
