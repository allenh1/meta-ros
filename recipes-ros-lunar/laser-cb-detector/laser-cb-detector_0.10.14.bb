# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Extracts checkerboard corners from a dense laser snapshot.      This package is "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native cv-bridge image-cb-detector message-filters roscpp settlerlib std-msgs"
SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/lunar/laser_cb_detector/0.10.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "331c3f8d442ccde1e2ffb5639a0b1314"
SRC_URI[sha256sum] = "8efb1704530c8485206815b70c0301f0606ae4ac9c2ec245debff3ba3ecad4d4"
S = "${WORKDIR}/calibration-release-release-lunar-laser_cb_detector-0.10.14-0"

inherit catkin
