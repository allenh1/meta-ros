# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a collection of launch files that can be helpful in config"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native interval-intersection joint-states-settler laser-cb-detector monocam-settler urdfdom-py"
SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/kinetic/calibration_launch/0.10.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e05f3e86c2cf6b7d0f89ecac1e3eacaf"
SRC_URI[sha256sum] = "78a8df7a9d2745ee43a3e25336fd8e2d23c4207b0277ce649bfc2ec63c1dd702"
S = "${WORKDIR}/calibration-release-release-kinetic-calibration_launch-0.10.14-0"

inherit catkin
