# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ntpd_driver sends TimeReference message time to ntpd server"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin cmake-modules poco message-generation message-runtime roscpp sensor-msgs"
SRC_URI = "https://github.com/vooon/ntpd_driver-release/archive/release/lunar/ntpd_driver/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7187f9257681018e7869a27929c9cae0"
SRC_URI[sha256sum] = "13fbef48869d39a1a1622e9bca602803959a148b4fe1f6be90fc1fc00ad04fc8"
S = "${WORKDIR}/ntpd_driver-release-release-lunar-ntpd_driver-1.2.0-0"

inherit catkin
