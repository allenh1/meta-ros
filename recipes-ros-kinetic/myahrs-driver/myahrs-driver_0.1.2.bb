# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "myahrs_driver is a driver package for the WITHROBOT's myAHRS+. The myAHRS+ is a "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/robotpilot/myahrs_driver-release/archive/release/kinetic/myahrs_driver/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9f5b2589758d199b4c3bf8b283336c35"
SRC_URI[sha256sum] = "4468064f639bf769b565657f3ef92e0962bd14155387437fa7725ec7b1684ba1"
S = "${WORKDIR}/myahrs_driver-release-release-kinetic-myahrs_driver-0.1.2-0"

inherit catkin
