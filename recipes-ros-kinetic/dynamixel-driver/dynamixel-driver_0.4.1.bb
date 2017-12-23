# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides low level IO for Robotis Dynamixel servos.     Fully suppo"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs python-serial rospy"
SRC_URI = "https://github.com/arebgun/dynamixel_motor-release/archive/release/kinetic/dynamixel_driver/0.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d512346bc5249b432c58208c47531f77"
SRC_URI[sha256sum] = "8066bc94c261d3df45d2d1f3447ecd988917a341dff0e151f92c8839b7ada5b7"
S = "${WORKDIR}/dynamixel_motor-release-release-kinetic-dynamixel_driver-0.4.1-0"

inherit catkin
