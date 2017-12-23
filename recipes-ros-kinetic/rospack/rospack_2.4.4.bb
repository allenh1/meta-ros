# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS Package Tool"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cmake-modules gtest pkgconfig python python-catkin-pkg-native python-rosdep libtinyxml"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/2.4.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "44f62a24bde29085a04dcf716a046eb9"
SRC_URI[sha256sum] = "149f27ece8b24235aaea6ed37ab49d89ec00dad1fa77843ac93fb6836fccf3b4"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-2.4.4-0"

inherit catkin
