package com.jamesnyakush.core.network

import java.io.IOException

class ApiException(msg: String) : IOException(msg)
class NoInternetException(msg: String) : IOException(msg)