(defn print-message []
  (println "Welcome to paradise"))

(print-menssage)

(defn apply-discount [value]
  (* value 0.9))

(apply-discount 100)

(defn value-discounted 
  "Return value discounted"
  [value]
  (* value (- 1 0.10)))

(value-discounted 150)


(defn value-discounted
  "Return value discounted 10%"
  [gross-amount]
  (let [discount (/ 10 100)]
   (println "Processing..." discounted)
   (* gross-amount (- 1 discounted)))
  )

(value-discounted 100)
