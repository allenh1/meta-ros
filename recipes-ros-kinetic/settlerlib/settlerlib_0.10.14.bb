# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Defines helper functions and routines that greatly help when trying to create a "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost calibration-msgs catkin-native rosconsole rostime"
SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/kinetic/${PN}/0.10.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e6810ba6dc51f40f40d10ed4bc7bfdb7"
SRC_URI[sha256sum] = "61737cc215bdf01acfbee2d2071761b241befb7d7ceaac78ebae8588a5442aa7"
S = "${WORKDIR}/calibration-release-release-kinetic-${PN}-0.10.14-0"

inherit catkin
