(ns pinsgster.core
  "Web app made for Heroku that periodically pings web sites."
  (:require [clojure.string :as string]
            [clj-http.client :as http]
            [cemerick.url :as urls]))

