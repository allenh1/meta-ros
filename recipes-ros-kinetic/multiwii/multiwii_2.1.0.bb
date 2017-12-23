# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The multiwii package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure eigen geometry-msgs mavros-msgs message-generation message-runtime msp roscpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/christianrauch/ros-${PN}-release/archive/release/kinetic/${PN}/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ac192e5e9c88ede1b17c38f0139a9970"
SRC_URI[sha256sum] = "0ae71a854438fb1034b90fa0aec5ddcd2d4d71f960ace95a8e3c96e4e33d4aa6"
S = "${WORKDIR}/ros-${PN}-release-release-kinetic-${PN}-2.1.0-0"

inherit catkin
