package com.jnyakush.carhub.network.network

import java.io.IOException

class ApiException(msg: String) : IOException(msg)
class NoInternetException(msg: String) : IOException(msg)