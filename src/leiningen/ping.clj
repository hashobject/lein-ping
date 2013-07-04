(ns leiningen.ping
  "Leiningen plugin that pings websites/urls."
  (:require [clj-http.client :as http]))


(defn ping
  "Ping all urls specified in the project.clj under :ping-urls keyword"
  [project & args]
  (let [urls (-> project :ping-urls)]
    (dorun
      (for [url urls]
        (http/get url)))))
