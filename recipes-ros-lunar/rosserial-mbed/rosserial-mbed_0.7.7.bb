# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosserial for mbed platforms."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin message-generation message-runtime rospy rosserial-client rosserial-msgs"
SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/lunar/rosserial_mbed/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e3dffa80cb9f6879f31e97b5767d26d2"
SRC_URI[sha256sum] = "d5e4ae821240df48c0a4c5ad8169c7ff7084ac5612022ae6ad5f1bdd61aea3c2"
S = "${WORKDIR}/rosserial-release-release-lunar-rosserial_mbed-0.7.7-0"

inherit catkin
