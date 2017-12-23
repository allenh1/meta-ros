# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosserial for mbed platforms."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime rospy rosserial-client rosserial-msgs"
SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/kinetic/rosserial_mbed/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4e4fbda7779069d4af37c0b4946e4447"
SRC_URI[sha256sum] = "db94568438120f6953f926941b3a8d8d12da8202bc1a19bcfcbd7fdce4d1686b"
S = "${WORKDIR}/rosserial-release-release-kinetic-rosserial_mbed-0.7.7-0"

inherit catkin
