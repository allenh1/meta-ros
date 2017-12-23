# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package that handle conversion from RangeArray messsages"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "catkin-native rospy"
SRC_URI = "https://github.com/Terabee/teraranger_array_converter-release/archive/release/kinetic/teraranger_array_converter/1.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e4a819c67d0ff7136d06b2508affe548"
SRC_URI[sha256sum] = "2e0b096a60b5932333999952d0ba84b78e0c0aadd617fada3d3f486e387c490e"
S = "${WORKDIR}/teraranger_array_converter-release-release-kinetic-teraranger_array_converter-1.1.1-0"

inherit catkin
