# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch a PID control node."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure message-generation message-runtime roscpp std-msgs"
SRC_URI = "https://github.com/AndyZe/pid-release/archive/release/lunar/pid/0.0.23-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "90f158f8faa5fea4b234cc55037a09b5"
SRC_URI[sha256sum] = "6ff65d493ea275cf1fad2255ca4e0bde298aa45e76805600c7f440826fb0cb78"
S = "${WORKDIR}/pid-release-release-lunar-pid-0.0.23-0"

inherit catkin
